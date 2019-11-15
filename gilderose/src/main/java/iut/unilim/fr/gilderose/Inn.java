package iut.unilim.fr.gilderose;

import java.util.ArrayList;
import java.util.List;

public class Inn {
	private List<Item> items;

	public Inn() {
		items = new ArrayList<Item>();
		items.add(new Item("+5 Dexterity Vest", 10, 20));
		items.add(new Item("Aged Brie", 2, 0));
		items.add(new Item("Elixir of the Mongoose", 5, 7));
		items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		items.add(new Item("Conjured Mana Cake", 3, 6));
	}

	public List<Item> getItems() {
		return items;
	}
 
	public void updateQuality() {
		for (int i = 0; i < items.size(); i++) {
			if (pasAgedBrie(i) && pasBackstagePasses(i)) {
				if (qualityAbove0(i)) {
					if (pasSulfuras(i)) {
						decreaseQuality(i);
					}
				}
			} else {
				if (qualityUnder50(i)) {
					increaseQuality(i);

					if (!pasBackstagePasses(i)) {
						if (items.get(i).getSellIn() < 11) {
							if (qualityUnder50(i)) {
								increaseQuality(i);
							}
						}

						if (items.get(i).getSellIn() < 6) {
							if (qualityUnder50(i)) {
								increaseQuality(i);
							}
						}
					}
				}
			}

			if (pasSulfuras(i)) {
				items.get(i).setSellIn(items.get(i).getSellIn() - 1);
			}

			if (items.get(i).getSellIn() < 0) {
				if (pasAgedBrie(i)) {
					if (pasBackstagePasses(i)) {
						if (qualityAbove0(i)) {
							if (pasSulfuras(i)) {
								decreaseQuality(i);
							}
						}
					} else {
						items.get(i).setQuality(0);
					}
				} else {
					if (qualityUnder50(i)) {
						increaseQuality(i);
					}
				}
			}
		}

	}

	private boolean pasBackstagePasses(int i) {
		return !items.get(i).getName().equals("Backstage passes to a TAFKAL80ETC concert");
	}

	private boolean pasAgedBrie(int i) {
		return !items.get(i).getName().equals("Aged Brie");
	}

	private boolean qualityAbove0(int i) {
		return items.get(i).getQuality() > 0;
	}

	private boolean pasSulfuras(int i) {
		return !items.get(i).getName().equals("Sulfuras, Hand of Ragnaros");
	}

	private boolean qualityUnder50(int i) {
		return items.get(i).getQuality() < 50;
	}

	private void decreaseQuality(int i) {
		items.get(i).setQuality(items.get(i).getQuality() - 1);
	}

	private void increaseQuality(int i) {
		items.get(i).setQuality(items.get(i).getQuality() + 1);
	}


}
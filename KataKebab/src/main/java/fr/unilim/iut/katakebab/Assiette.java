package fr.unilim.iut.katakebab;

import java.util.ArrayList;
import java.util.List;

public class Assiette {
	
	ArrayList<Ingredients> liste = new ArrayList<Ingredients>();
	
	public Assiette avec(Ingredients ingredients) {
		this.liste.add(ingredients);
		return this;
	}

	public Kebab confectionnerKebab() {
		return new Kebab(liste);
	}

}

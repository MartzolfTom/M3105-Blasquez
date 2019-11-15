package iut.unilim.fr.gilderose;

import org.junit.Before;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class InnTest {

	Inn inn;
	LegacyInn legacy;

	@Before
	public void start() {
		inn = new Inn();
		legacy = new LegacyInn();
		inn.updateQuality();
		legacy.updateQuality();

	}

	@Test
	public void nombreItemDansLaListe() {
		assertEquals(inn.getItems().size(), inn.getItems().size());
	}
	
	@Test
	public void shouldAllWork() {
		assertEquals(legacy.getItems().get(0).getSellIn(),inn.getItems().get(0).getSellIn());
		assertEquals(legacy.getItems().get(0).getQuality(),inn.getItems().get(0).getQuality());
		
		assertEquals(legacy.getItems().get(1).getSellIn(),inn.getItems().get(1).getSellIn());
		assertEquals(legacy.getItems().get(1).getQuality(),inn.getItems().get(1).getQuality());

		assertEquals(legacy.getItems().get(2).getSellIn(),inn.getItems().get(2).getSellIn());
		assertEquals(legacy.getItems().get(2).getQuality(),inn.getItems().get(2).getQuality());

		assertEquals(legacy.getItems().get(3).getSellIn(),inn.getItems().get(3).getSellIn());
		assertEquals(legacy.getItems().get(3).getQuality(),inn.getItems().get(3).getQuality());
		
		assertEquals(legacy.getItems().get(4).getSellIn(),inn.getItems().get(4).getSellIn());
		assertEquals(legacy.getItems().get(4).getQuality(),inn.getItems().get(4).getQuality());
		
		assertEquals(legacy.getItems().get(5).getSellIn(),inn.getItems().get(5).getSellIn());
		assertEquals(legacy.getItems().get(5).getQuality(),inn.getItems().get(5).getQuality());
	}
	

}

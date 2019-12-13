package fr.unilim.iut.katakebab;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

import Ingredients.Oignon;
import Ingredients.Pain;
import Ingredients.Salade;
import Ingredients.Sauce;
import Ingredients.Tomate;

public class KebabTest {

	private static final Salade SALADE = new Salade();
	private static final Tomate TOMATE = new Tomate();
	private static final Agneau AGNEAU = new Agneau();
	private static final Sauce SAUCE = new Sauce();
	private static final Oignon OIGNON = new Oignon();
	private static final Pain PAIN = new Pain();

	private Kebab kebabAgneau;
	private Kebab kebabVege;
	
	@Before
	public void confectionnerLesKebabs() {
		 kebabAgneau= new Assiette()
				.avec(PAIN)
				.avec(OIGNON)
				.avec(SAUCE)
				.avec(AGNEAU)
				.avec(TOMATE)
				.confectionnerKebab();
		
		 kebabVege= new Assiette()
				.avec(PAIN)
				.avec(OIGNON)
				.avec(SAUCE)
				.avec(TOMATE)
				.avec(SALADE)
				.confectionnerKebab();
	}
	
	
	@Test
	public void un_kebab_Agneau_contient_bien_tous_les_ingredients_ajoutes() {
		 assertThat(kebabAgneau.listerLesIngredients()).containsExactly(
				PAIN, OIGNON, SAUCE, AGNEAU, TOMATE);
	}
	
	@Test
	public void un_kebab_Vege_contient_bien_tous_les_ingredients_ajoutes() {
		 assertThat(kebabVege.listerLesIngredients()).containsExactly(
				PAIN, OIGNON, SAUCE, TOMATE, SALADE);
	}
}

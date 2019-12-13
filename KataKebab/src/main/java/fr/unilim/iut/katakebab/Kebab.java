package fr.unilim.iut.katakebab;

import java.util.ArrayList;

public class Kebab {
	
	ArrayList<Ingredients> liste;

	public Kebab(ArrayList<Ingredients> liste) {
		this.liste = liste;
	}

	public ArrayList<Ingredients> listerLesIngredients() {
		return this.liste;
	}
}

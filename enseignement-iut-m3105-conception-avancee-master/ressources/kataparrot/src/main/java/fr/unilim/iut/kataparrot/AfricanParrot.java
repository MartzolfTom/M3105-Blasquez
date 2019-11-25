package fr.unilim.iut.kataparrot;

public class AfricanParrot extends Parrot {

		
	private static final int MINIMUM_SPEED = 0;
	private static final double LOADFACTOR = 9.0;
	protected int numberOfCoconuts;

	public AfricanParrot(int numberOfCoconuts ) {
		this.numberOfCoconuts=numberOfCoconuts;
	}

	public double getSpeed() {
		return Math.max(MINIMUM_SPEED, BASE_SPEED - LOADFACTOR * numberOfCoconuts);
	}

}
 
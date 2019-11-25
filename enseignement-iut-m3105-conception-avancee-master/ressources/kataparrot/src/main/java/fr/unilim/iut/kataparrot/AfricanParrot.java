package fr.unilim.iut.kataparrot;

public class AfricanParrot extends Parrot {

		
	private static final double LOADFACTOR = 9.0;
	protected int numberOfCoconuts;

	public AfricanParrot(int numberOfCoconuts ) {
		super(ParrotTypeEnum.AFRICAN);
		this.numberOfCoconuts=numberOfCoconuts;
	}

	public double getSpeed() {
		return Math.max(0, BASE_SPEED - LOADFACTOR * numberOfCoconuts);
	}

}
 
package fr.unilim.iut.kataparrot;

public class EuropeanParrot extends Parrot{

	public EuropeanParrot() {
		super(ParrotTypeEnum.EUROPEAN);
	}

	public double getSpeed() {
		return BASE_SPEED;
	}
}

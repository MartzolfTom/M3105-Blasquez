package fr.unilim.iut.kataparrot;

public class EuropeanParrot extends Parrot{

	public EuropeanParrot() {
		super(ParrotTypeEnum.EUROPEAN, 0,0,false);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSpeed() {
		return super.getBaseSpeed();
	}

}

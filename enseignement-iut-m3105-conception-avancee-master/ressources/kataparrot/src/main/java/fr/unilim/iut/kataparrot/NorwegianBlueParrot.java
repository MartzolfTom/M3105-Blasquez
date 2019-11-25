package fr.unilim.iut.kataparrot;

public class NorwegianBlueParrot extends Parrot {

	protected double voltage;
	protected boolean isNailed;

	public NorwegianBlueParrot(double voltage, boolean isNailed) {
		super(ParrotTypeEnum.NORWEGIAN_BLUE);
		this.voltage=voltage;
		this.isNailed=isNailed;
	}

	public double getSpeed() {
		return (isNailed) ? 0 : getBaseSpeed(voltage);
	}

	protected double getBaseSpeed(double voltage) {
		return Math.min(24.0, voltage * BASE_SPEED);
	}

} 
 
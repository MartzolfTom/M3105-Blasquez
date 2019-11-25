package fr.unilim.iut.kataparrot;

public class NorwegianBlueParrot extends Parrot {

	private static final double MAXIMUM_SPEED = 24.0;
	protected double voltage;
	protected boolean isNailed;

	public NorwegianBlueParrot(double voltage, boolean isNailed) {
		this.voltage=voltage;
		this.isNailed=isNailed;
	}

	public double getSpeed() {
		if (isNailed)
			return 0;
		else
			return getBaseSpeed(voltage);
	}

	protected double getBaseSpeed(double voltage) {
		return Math.min(MAXIMUM_SPEED, voltage * BASE_SPEED);
	}

} 
 
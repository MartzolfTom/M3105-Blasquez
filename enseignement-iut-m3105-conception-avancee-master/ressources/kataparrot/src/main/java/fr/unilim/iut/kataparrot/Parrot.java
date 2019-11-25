package fr.unilim.iut.kataparrot;


public class Parrot {

	private ParrotTypeEnum type;
	private double voltage;
	private boolean isNailed;

	public Parrot(ParrotTypeEnum _type, double voltage, boolean isNailed) {
		this.type = _type;
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	public double getSpeed() {
		switch (type) {
		case EUROPEAN:
			throw new RuntimeException("Should be unreachable");
		case AFRICAN:
			throw new RuntimeException("Should be unreachable");
		case NORWEGIAN_BLUE:
			return (isNailed) ? 0 : getBaseSpeed(voltage);
		}
		throw new RuntimeException("Should be unreachable");
	}

	private double getBaseSpeed(double voltage) {
		return Math.min(24.0, voltage * getBaseSpeed());
	}

	protected static double getBaseSpeed() {
		return 12.0;
	}

}

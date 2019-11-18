package fr.unilim.iut.tirepressuremonitoringsystem;

public class Alarm {
	private final double LowPressureThreshold;
	private final double HighPressureThreshold;

	Sensor sensor = new Sensor();

	boolean alarmOn;

	public Alarm(Sensor sensor) {
		this.sensor = sensor;
		this.LowPressureThreshold  = 17;
		this.HighPressureThreshold = 21;
		this.alarmOn = false;
	}

	public void check() {
		double psiPressureValue = sensor.popNextPressurePsiValue();

		if (validePressure(psiPressureValue)) {
			alarmOn = true;
		}
	}

	private boolean validePressure(double psiPressureValue) {
		return psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue;
	}

	public boolean isAlarmOn() {
		return alarmOn;
	}
}

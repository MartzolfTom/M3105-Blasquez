package fr.unilim.iut.tirepressuremonitoringsystem;

public class Alarm {
	private final double lowThreshold;
	private final double highThreshold;
	Sensor sensor;
	boolean alarmOn;

	public Alarm(Sensor sensor) {
		this.sensor = sensor;
		this.lowThreshold  = 17;
		this.highThreshold = 21;
		this.alarmOn = false;
	}

	public void check() {
		double psiValue = sensor.popNextPressurePsiValue();

		if (validePsi(psiValue)) {
			activateAlarm();
		}
	}

	private void activateAlarm() {
		alarmOn = true;
	}

	private boolean validePsi(double psiValue) {
		return psiValue < lowThreshold || highThreshold < psiValue;
	}

	public boolean isAlarmOn() {
		return alarmOn;
	}
}

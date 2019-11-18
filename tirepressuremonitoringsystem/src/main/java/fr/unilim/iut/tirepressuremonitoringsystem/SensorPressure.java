package fr.unilim.iut.tirepressuremonitoringsystem;

import java.util.Random;

// The reading of the pressure value from the sensor is simulated in this implementation.
// Because the focus of the exercise is on the other class.

public class SensorPressure implements Sensor {
	
    public static final double OFFSET = 16;
  
    @Override
	public double popNextPressurePsiValue() {
        double pressureTelemetryValue;
        pressureTelemetryValue = samplePressure( );
 
        return OFFSET + pressureTelemetryValue;
    }

    private static double samplePressure() {
        Random basicRandomNumbersGenerator = new Random();
        double pressureTelemetryValue = 6 * basicRandomNumbersGenerator.nextDouble() * basicRandomNumbersGenerator.nextDouble();
        return pressureTelemetryValue; 
    }
}

package fr.unilim.iut.tirepressuremonitoringsystem;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class AlarmTest {
	
	
	@Test
	public void testDeclenchementAlarmePressionBasse() {
		
		Sensor sensor = mock(Sensor.class);
		when(sensor.popNextPressurePsiValue()).thenReturn(15.0);
		Alarm alarm = new Alarm(sensor);
		alarm.check();
		
		assertTrue(alarm.isAlarmOn());
	}
	
	@Test
	public void testDeclenchementAlarmePressionForte() {
		
		Sensor sensor = mock(Sensor.class);
		when(sensor.popNextPressurePsiValue()).thenReturn(50.0);
		Alarm alarm = new Alarm(sensor);
		alarm.check();
		
		assertTrue(alarm.isAlarmOn());
	}
	
	@Test
	public void testDeclenchementAlarmePressionValide() {
		
		Sensor sensor = mock(Sensor.class);
		when(sensor.popNextPressurePsiValue()).thenReturn(18.0);
		Alarm alarm = new Alarm(sensor);
		alarm.check();
		
		assertFalse(alarm.isAlarmOn());
	}
	
	@Test
	public void testDeclenchementAlarmeResteDeclenche() {
		
		Sensor sensor = mock(Sensor.class);
		Alarm alarm = new Alarm(sensor);
		when(sensor.popNextPressurePsiValue()).thenReturn(50.0);		
		alarm.check();	
		when(sensor.popNextPressurePsiValue()).thenReturn(18.0);		
		alarm.check();
		assertTrue(alarm.isAlarmOn());
	}
   
}

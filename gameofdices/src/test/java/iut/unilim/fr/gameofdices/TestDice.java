package iut.unilim.fr.gameofdices;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class TestDice {

	Dice theDice;
	
	@Test
	public void rollReturnsAValue() {
		 theDice = new Dice(new Random());
		for (int i = 0; i < 100; i++) {
			int result = theDice.roll();
			assertTrue(result >= 1);
			assertTrue(result <= 6);
		}
	}
	
	@Test(expected = RuntimeException.class)
	public void identifyBadValuesGreaterThanNumberOfFaces() {
		Random tooMuch = mock(Random.class);
		when(tooMuch.nextInt(anyInt())).thenReturn(7);
		theDice = new Dice(tooMuch);
		theDice.roll();
	}
	
	@Test(expected = RuntimeException.class)
 	public void identifyBadValuesLesserThanOne() {

     	Random pasAssezWollah = mock(Random.class);
     	when(pasAssezWollah.nextInt(anyInt())).thenReturn(-1);
     	theDice = new Dice(pasAssezWollah);
     	theDice.roll();
	}
	
}

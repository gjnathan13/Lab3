package primeFactors;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.Arrays;

import org.junit.Test;

public class PrimeFactorsTest {
	
	private java.util.List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);
	}

	@Test
	public void testOne() {
		assertEquals(list(), PrimeFactors.generate(1));
	}
	
	@Test
	public void testTwo(){
		assertEquals(list(2), PrimeFactors.generate(2));
	}
	
	@Test
	public void testThree(){
		assertEquals(list(3), PrimeFactors.generate(3));
	}

}

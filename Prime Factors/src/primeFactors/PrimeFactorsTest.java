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
	
	@Test
	public void testFour(){
		assertEquals(list(2,2), PrimeFactors.generate(4));
	}
	
	@Test
	public void testSix(){
		assertEquals(list(2,3), PrimeFactors.generate(6));
	}
	
	@Test
	public void testEight(){
		assertEquals(list(2,2,2), PrimeFactors.generate(8));
	}

}

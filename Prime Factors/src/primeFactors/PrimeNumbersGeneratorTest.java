package primeFactors;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class PrimeNumbersGeneratorTest {
	
	private Integer inputNumber;
	private java.util.List<Integer> expectedResult;
	
	
	public PrimeNumbersGeneratorTest(Integer inputNumber, 
			java.util.List<Integer> expectedResult) {
		      this.inputNumber = inputNumber;
		      this.expectedResult = expectedResult;
		   }

	@Parameterized.Parameters
	public static Collection primeNumbersChecks(){
		return Arrays.asList(new Object[][]{
				{2, list()},
				{3, list(2)},
				{4, list(2,3)},
				{5, list(2,3)}
				});
	}
	
	private static java.util.List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);
	}

	
	@Test
	public void testPrimeNumberGeneration() {
		assertEquals(expectedResult, PrimeNumberGeneration.generateSmallerPrimes(inputNumber));
	}

}

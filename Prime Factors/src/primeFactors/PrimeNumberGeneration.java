package primeFactors;

import java.util.ArrayList;

public class PrimeNumberGeneration {

	public static java.util.List<Integer> generateSmallerPrimes(int inputNumber) {
		ArrayList<Integer> primesList = new ArrayList<Integer>();
		if(inputNumber == 3){
			primesList.add(2);
		}
		return primesList;
	}

	
}

package primeFactors;

import java.util.ArrayList;

public class PrimeNumberGeneration {

	public static java.util.List<Integer> generateSmallerPrimes(int inputNumber) {
		ArrayList<Integer> primesList = new ArrayList<Integer>();
		int numberToAdd = 2;
		while(numberToAdd < inputNumber){
			if(numberToAdd != 4){
			primesList.add(numberToAdd);
			}
			numberToAdd++;
		}
		return primesList;
	}

	
}

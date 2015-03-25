package primeFactors;

import java.util.ArrayList;

public class PrimeNumberGeneration {

	public static java.util.List<Integer> generateSmallerPrimes(int inputNumber) {
		ArrayList<Integer> primesList = new ArrayList<Integer>();
		int numberToAdd = 2;
		while(numberToAdd < inputNumber){
			boolean primeCheck = true;
			for(int i=2;i < numberToAdd; i++){
				if(numberToAdd%i == 0){
					primeCheck = false;
					break;
				}
			}
			if(primeCheck){
				primesList.add(numberToAdd);
			}
			numberToAdd++;
		}
		return primesList;
	}

	
}

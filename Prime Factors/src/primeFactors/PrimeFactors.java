package primeFactors;

import java.util.ArrayList;

public class PrimeFactors {

	/**
	 * Creates prime factor list for input integer
	 * 
	 * @param i
	 * @return
	 */
	public static java.util.List<Integer> generate (int number) {
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		while(number > 1){
			int factor = 2;
			while(number%factor != 0){
				factor++;
			}
			primeFactors.add(factor);
			number = number/factor;
		}
		return primeFactors;
	}

}
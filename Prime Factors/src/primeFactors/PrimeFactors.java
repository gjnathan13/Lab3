package primeFactors;

import java.util.ArrayList;

public class PrimeFactors {

	/**
	 * Creates prime factor list for input integer
	 * 
	 * @param i
	 * @return
	 */
	public static java.util.List<Integer> generate (int i) {
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		if(i > 1){
			primeFactors.add(i);
		}
		return primeFactors;
	}

	
}

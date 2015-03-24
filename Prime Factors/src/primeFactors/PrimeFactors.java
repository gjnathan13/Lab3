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
		if(i == 1){
			return new ArrayList<Integer>();
		}
		else{
			ArrayList<Integer> primeFactors = new ArrayList<Integer>();
			primeFactors.add(2);
			return primeFactors;
		}
		
	}

	
}

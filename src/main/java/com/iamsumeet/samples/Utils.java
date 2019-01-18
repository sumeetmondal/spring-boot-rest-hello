package com.iamsumeet.samples;

import java.math.BigInteger;
import java.util.Random;

public class Utils {

	public static BigInteger factorial(BigInteger number) {
	    BigInteger result = BigInteger.valueOf(1);

	    for (long factor = 2; factor <= number.longValue(); factor++) {
	        result = result.multiply(BigInteger.valueOf(factor));
	    }
	    return result;
	}
	
	public static BigInteger nextRandomBigInteger() {
		Random rand = new Random();
		BigInteger result = new BigInteger(15, rand); //¯\_(ツ)_/¯
		return result;

	}
	
}

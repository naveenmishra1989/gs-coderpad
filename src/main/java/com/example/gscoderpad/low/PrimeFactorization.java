package com.example.gscoderpad.low;

import java.util.*;

public class PrimeFactorization {
	/**
	   * Return an array containing prime numbers whose product is x
	   * Examples:
	   * primeFactorization( 6 ) == [2,3]
	   * primeFactorization( 5 ) == [5]
	   */
  public static ArrayList<Integer> primeFactorization(int x)
  {
  	ArrayList<Integer> primeFac = new ArrayList();
	if(x < 2) {return primeFac;}
	if(x == 2) {   //2 is only even prime starting number
		primeFac.add(2);
		return primeFac;
	}
	for(int i = 2; i <= x/2; i++) {
		if(x%i == 0) {
			primeFac.add(i);
			while(x % i == 0) {
				x = x/i;
			}	
		}
	}
	if(x > 2) { //for single digit input
		primeFac.add(x);
	}
	return primeFac;
  }

  public static void main(String args[])
  {
	
	System.out.println(primeFactorization(315) + " " + primeFactorization(5));
	if(primeFactorization(42).equals(Arrays.asList(2,3,7)) 
			&& 
			primeFactorization(5).equals(Arrays.asList(5))
			) {
		System.out.println("All passed");
	}else {
		System.out.println("Failed");
	}
  
  }
}
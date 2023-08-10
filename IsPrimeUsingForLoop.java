package com.java;

public class IsPrimeUsingForLoop {
	
     private int number;
	
	public IsPrimeUsingForLoop(int number) {
		this.number = number;
	}

	public static void main(String [] args) {
		IsPrimeUsingForLoop number = new IsPrimeUsingForLoop(8);
		boolean isprime = number.IsPrime();         //as it is non static method called by using object.
		System.out.println("IsPrime :" + isprime);
		
	}
	
	public boolean IsPrime() {   //non static method call it by using object
	if(number<2) {         //default condition is number must be positive exclude 0 and 1.
		return false;
	}
	for(int i=2; i<=number-1;i++) {
		if(number%i==0) {      // if a number is divisible by 2 and it is not a prime number..need to check this condition upto number -1.
			return false;      //returns false if it div by 2
		}
	}
	return true;
	}

}

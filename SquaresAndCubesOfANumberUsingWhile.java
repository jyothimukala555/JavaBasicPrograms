package com.java;

public class SquaresAndCubesOfANumberUsingWhile {
	
	
	private int limit;
	public SquaresAndCubesOfANumberUsingWhile(int limit) {
		this.limit=limit;
	}
	
	
	public static void main(String[]args) {
		SquaresAndCubesOfANumberUsingWhile squaresAndCubes = new SquaresAndCubesOfANumberUsingWhile(90);
		squaresAndCubes.SquaresUptoLimit();
		squaresAndCubes.CubesUptoLimit();
		
	}
	
	public void SquaresUptoLimit() {
		int i=1;
		while(i*i < limit ) {
			System.out.print(i*i + " ");
			i++;	
		}
		System.out.println();
		
	}
	public void CubesUptoLimit() {
		int i=1;
		while(i*i*i <limit) {
			System.out.print(i*i*i + " ");
			i++;
		}
		
	}

}

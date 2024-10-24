package com.coding.example;

interface Calculator{
	//void switchOn();
	//void sum(int num);
	int subtract(int i1, int i2);
}

public class CalculatorImpl{
	
	public static void main(String[] args) {

		//Calculator calculator = () -> System.out.println("Calculator is switched ON");
		//calculator.switchOn();
		
		//Calculator calculator = (sum) -> System.out.println("Sum : "+sum);
		//calculator.sum(234);
		
		Calculator calculator = (i1, i2) -> i2-i1;
		System.out.println("Subtracted value : "+calculator.subtract(4, 7));
	}

	

}

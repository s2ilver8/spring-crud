package com.example.board;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calculator = new Calculator();
		
		int resultAdd = calculator.add(5,5);
		int resultSub = calculator.sub(5, 5);
		int resultMul = calculator.mul(5, 5);
		int resultDiv = calculator.div(5, 5);
		System.out.println("resultAdd : " + resultAdd);
		System.out.println("resultSub : " + resultSub);
		System.out.println("resultMul : " + resultMul);
		System.out.println("resultDiv : " + resultDiv);
	}

}

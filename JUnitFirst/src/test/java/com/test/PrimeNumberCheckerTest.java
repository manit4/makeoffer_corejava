package com.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
	
	private int inputNumber;
	private boolean expectedResult;
	private PrimeNumberChecker checker;

	public PrimeNumberCheckerTest(int inputNumber, boolean expectedResult) {
		
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	
	@Before
	public void initialize() {
		
		checker = new PrimeNumberChecker();
	}
	
	@Parameterized.Parameters
	public static Collection primeNumberInputs() {
		
		return Arrays.asList(new Object[][] {
			{6, false}, {2, true}, {22, false}, {23, true} 
		});
	}
	
	
	@Test
	public void test() {
		
		assertEquals(expectedResult, checker.validate(inputNumber));
	}

}

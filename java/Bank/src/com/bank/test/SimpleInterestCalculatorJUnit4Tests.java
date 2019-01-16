package com.bank.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bank.service.InterestCalculator;
import com.bank.service.SimpleInterestCalculator;

public class SimpleInterestCalculatorJUnit4Tests {

	private InterestCalculator interestCalculator;
	
	@Before
	public void init() {
		interestCalculator = new SimpleInterestCalculator();
		interestCalculator.setRate(0.05);
	}
	
	@Test
	public void testCalculate() {
		double interest = interestCalculator.calculate(10000, 2);
		assertEquals(1000.0, interest, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIllegalCalculate() {
		interestCalculator.calculate(-10000, 2);
	}
}

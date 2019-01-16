package com.bank.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.bank.exception.AmountExceededException;
import com.bank.exception.NotEnougthFeesException;
import com.bank.service.FlatInterestCalculator;
import com.bank.service.InterestCalculator;

public class FlatInterestCalculatorTest {
	private InterestCalculator interestCalculator;

	@Before
	public void init() {
		interestCalculator = new FlatInterestCalculator();
		interestCalculator.setRate(0.05);
		((FlatInterestCalculator) interestCalculator).setFees(20);
	}

	@Test
	public void testCalculateWithFees() {
		double interest = interestCalculator.calculate(10000, 2);
		assertEquals(1020.0, interest, 0);
	}

	@Test(expected = NotEnougthFeesException.class)
	public void testFeesInit() {
		((FlatInterestCalculator) interestCalculator).setFees(0);
		interestCalculator.calculate(10000, 2);
	}

	@Test(expected = AmountExceededException.class)
	public void testCalculateWithAmountExceeded() {
		interestCalculator.calculate(100000, 2);

	}

}

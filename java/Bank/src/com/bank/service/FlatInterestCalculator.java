package com.bank.service;

import com.bank.exception.AmountExceededException;
import com.bank.exception.NotEnougthFeesException;

public class FlatInterestCalculator implements InterestCalculator {

	private double rate;
	private double fees;
	
	@Override
	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public double calculate(double amount, double year) {
		setFees(fees);
		if (fees <= 0)
				throw new NotEnougthFeesException("Le montant des frais de dossier doit être supérieur à 0");
		double result = (amount * year * rate) + fees ;
		if(result >= 5000.0) {
			result = 5000.0;
			throw new AmountExceededException("montant plafonné à 5000");
		}	
		return result;
	}

}

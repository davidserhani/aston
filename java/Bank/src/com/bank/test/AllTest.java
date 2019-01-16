package com.bank.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(value = {SimpleInterestCalculatorJUnit4Tests.class, FlatInterestCalculatorTest.class})
public class AllTest {

}

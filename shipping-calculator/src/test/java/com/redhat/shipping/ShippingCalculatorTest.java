package com.redhat.shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {


    // @todo: add tests
	public void canCalculateTheCostForARegion() {
		ShippingCalculator calculator = new ShippingCalculator();
		assertEquals(0, calculator.costForRegion("A Region"));
           }
}

package com.capgemini.employee.tests;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import com.capgemini.employee.main.MarketingExecutive;

public class MarketingExcecutiveTest {

	@Test
	public void testDefaultConstructorIsCalled() {
		MarketingExecutive me=new MarketingExecutive();
		assertNotNull(me);
		
	}
	@Test
	public void testParametersConstructorIsCalled() {
		MarketingExecutive me=new MarketingExecutive(101,"RAM",20000,5000,150);
		assertNotNull(me);
		
	}
	@Test
	public void testGrossSalaryWithAllowances() {
		MarketingExecutive me=new MarketingExecutive(101,"RAM",20000,5000,150);
		assertEquals(37250,me.getGrossSalary(),0.01);
	}
	@Test
	public void testNetSalaryWithAllowances() {
		MarketingExecutive me=new MarketingExecutive(101,"RAM",20000,5000,150);
		assertEquals(34650,me.getNetSalary(),0.01);
	}
}

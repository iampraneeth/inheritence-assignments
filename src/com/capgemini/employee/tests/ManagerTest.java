package com.capgemini.employee.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.employee.main.Manager;

public class ManagerTest {
	
	@Test
	public void testObjectIsCreatedForDefaultConstructor() {
		Manager manager=new Manager();
		assertNotNull(manager);
		
	}
	@Test
	public void testObjectIsCreatedForParameterisedConstructor() {
		Manager manager=new Manager(101,"RAM",20000,5000);
		assertNotNull(manager);

	}
	@Test
	public void testEmployeeSalaryIncludingAllowance() {
		Manager manager=new Manager(101,"RAM",20000,5000);
		assertEquals(39800, manager.getGrossSalary());
	}
	@Test
	public void testNetEmployeeSalaryIncludingAllowance() {
		Manager manager=new Manager(101,"RAM",20000,5000);
		assertEquals(37200, manager.getNetSalary());
	}


}

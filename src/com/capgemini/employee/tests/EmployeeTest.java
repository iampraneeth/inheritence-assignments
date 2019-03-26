package com.capgemini.employee.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employee.main.Employee;

public class EmployeeTest {
	public Employee employee;

	@BeforeEach
	public void startUp() {
	//	Employee employee = new Employee(101, "RAM", 20000, 5000);

	}

	@Test
	public void testObjectIsCreatedForDefaultConstructor() {
		Employee employee = new Employee();
		assertNotNull(employee);

	}

	@Test
	public void testObjectIsCreatedForParameterisedConstructor() {
		Employee employee = new Employee(101, "RAM", 20000, 5000);
		assertNotNull(employee);
	}

	@Test
	public void testEmployeeId() {
		Employee employee = new Employee(101, "RAM", 20000, 5000);
		assertEquals(101, employee.getEmployeeId());
	}

	@Test
	public void testEmployeeName() {
		Employee employee = new Employee(101, "RAM", 20000, 5000);

		assertEquals("RAM", employee.getEmployeeName());
	}

	@Test
	public void testEmployeeBasicSalary() {
		Employee employee = new Employee(101, "RAM", 20000, 5000);

		assertEquals(20000, employee.getBasicSalary());
	}

	@Test
	public void testEmployeeGrossSalary() {
		Employee employee = new Employee(101, "RAM", 20000, 5000);

		assertEquals(35000, employee.getGrossSalary());

	}

	@Test
	public void testEmployeeNetSalary() {
		Employee employee = new Employee(101, "RAM", 20000, 5000);

		assertEquals(32400, employee.getNetSalary());
	}
}
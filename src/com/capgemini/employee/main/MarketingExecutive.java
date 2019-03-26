package com.capgemini.employee.main;

public class MarketingExecutive extends Employee {
	private double tourAllowance=5;
	private double kilometers;
	private double telephoneAllowance=1500;
	public MarketingExecutive() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MarketingExecutive(int employeeId, String employeeName, double basicSalary, double medical,double kilometers) {
		super(employeeId, employeeName, basicSalary, medical);
		this.kilometers=kilometers;
		
		
	}
	public double getGrossSalary() {
		
		return super.getGrossSalary()+kilometers*tourAllowance+telephoneAllowance;
	}
	


	
}

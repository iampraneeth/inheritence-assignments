package com.capgemini.employee.main;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	//private double hra;
	private double medical;
	//private double pf;
	//private double pt;
	private double netSalary;
	private double grossSalary;
	public Employee() {
		super();
		
	}
	public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getNetSalary() {
		netSalary=getGrossSalary()-(200+basicSalary*0.12);
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	public double getGrossSalary(){
		grossSalary=getBasicSalary()+(basicSalary/2)+getMedical();
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getMedical() {
		return medical;
	}
	public void setMedical(double medical) {
		this.medical = medical;
	}
	

	
	
	
	
}

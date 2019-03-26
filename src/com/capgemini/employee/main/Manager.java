package com.capgemini.employee.main;

public class Manager extends Employee {
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId, employeeName, basicSalary, medical);
		this.petrolAllowance = super.getBasicSalary()/100*8;
		this.foodAllowance = super.getBasicSalary()/100*13;
		this.otherAllowance = super.getBasicSalary()/100*3;	
		}
	public double getGrossSalary() {
		
		return super.getGrossSalary()+petrolAllowance+foodAllowance+otherAllowance;
	}
/*public double getNetSalaryWithAllowance() {
		
		return (getGrossSalary()+this.petrolAllowance+this.foodAllowance+this.otherAllowance)-(200+getBasicSalary()/100*12);
	}*/
	


}

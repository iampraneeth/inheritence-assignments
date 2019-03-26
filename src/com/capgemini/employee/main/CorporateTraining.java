package com.capgemini.employee.main;

public class CorporateTraining extends Training {

	private int days;
	
	public CorporateTraining(int id, String subject, double fees, int days) {
		super(id,subject,fees);
		this.days=days;
	}
	
	@Override
	public double getOrderValue() {
		
		
		return days*super.getFees();
		
	}

}
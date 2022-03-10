package com.cloudfactory.training;

public class Car extends Vehicle {
	Car()
	{
		super();
	}
	protected String licensePlate = null;
	
	@Override
	public void setLicensePlate(String license) {
		super.setLicensePlate(license);
	}
	
	@Override
	public String getLicensePlate() {
		return super.getLicensePlate();			
	}
	
	public void updateLicensePlate(String license) {
		this.licensePlate = license;
	}
}

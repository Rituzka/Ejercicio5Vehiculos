package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	public String printList() {
		return ("Marca: "+brand+", diámetro: "+diameter);
	}
	
	 @Override
	  public boolean equals(Object obj) {
	 
	    Wheel wheel = (Wheel)obj;

	    if (this.brand.equals(wheel.getBrand()) && this.diameter == wheel.getDiameter()) {
	      return true;
	    }
	    return false;
	 
	  }
}

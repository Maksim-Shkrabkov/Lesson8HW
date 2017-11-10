package by.htp.RentStation;

import by.htp.RentStation.RentUnit.RentUnit;

public class RentStation {
	
	private RentUnit[] rentUnits;
	private int count = 0;

	public RentStation(int x) {
		rentUnits = new RentUnit[x];
	}
	
	
	public RentUnit[] getRentUnits() {
		return rentUnits;
	}

	public void setRentUnits(RentUnit[] rentUnits) {
		this.rentUnits = rentUnits;
	}
	
	public void addItem(RentUnit rentUnits) {
		if(this.rentUnits.length > count) {
			this.rentUnits[count] = rentUnits;
			count++;
		} else {
			System.out.println("RentStation unit is full");
		}
		
	}
	
	

}

package by.htp.RentStation.RentUnit;

import by.htp.RentStation.Equipment;

public class RentUnit {
		
	private Equipment[] units;
	int countEq = 0;
	
	public RentUnit(int x) {
		units = new Equipment[x];
	}
	

	public Equipment[] getUnits() {
		return units;
	}

	public void setUnits(Equipment[] units) {
		this.units = units;
	}	
	
	public void addEquioment(Equipment units) {
		if(this.units.length > countEq) {
			this.units[countEq] = units;
			countEq++;
		} else {
			System.out.println("RentUnit unit is full");
	
		}
		
	}
	
}

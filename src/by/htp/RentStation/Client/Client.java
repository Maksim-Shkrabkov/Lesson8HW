package by.htp.RentStation.Client;

import java.util.Date;

import by.htp.RentStation.Cycle;
import by.htp.RentStation.Equipment;
import by.htp.RentStation.Skating;

public class Client {
		
	private String name;
	private int countUnits = 0;
	private Equipment[] equipmentOfClient;
	private int hours;
	private int costOfEquipment;
	
	public Client() {
		
	}
	
	public Client(String name) {
		super();
		this.name = name;
		this.equipmentOfClient = new  Equipment[2];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountUnits() {
		return countUnits;
	}

	public void setCountUnits(int countUnits) {
		this.countUnits = countUnits;
	}
	
	
	public Equipment[] getEquipmentOfClient() {
		return equipmentOfClient;
	}

	public void setEquipmentOfClient(Equipment[] equipmentOfClient) {
		this.equipmentOfClient = equipmentOfClient;
	}
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	

	public int getCostOfEquipment() {
		return costOfEquipment;
	}

	public void setCostOfEquipment() {
		
		for(Equipment equipment: equipmentOfClient) {
			if(equipment instanceof Cycle) {
				this.costOfEquipment = this.costOfEquipment + 1000;
			} else if (equipment instanceof Skating) {
				this.costOfEquipment = this.costOfEquipment + 1500;
			}
		}
		

	}
	
	//methods

	public void getÑheckWithTime() {
		
		System.out.println("-------");
		Date today = new Date();
		String hour = String.format("%tk", today);
		int hours = Integer.parseInt(hour);
		this.hours = hours;
		
	}

	public void addEquipment(Equipment eq) {
		if(equipmentOfClient.length > countUnits) {
			equipmentOfClient[countUnits] = eq;
			countUnits++;
		} else {
			System.out.println("Client massive equipmentOfClient is full");
		}
		
	}
	
	public void reportOfEquipment() {
		System.out.println("-------");
		int number = 0;
		for(Equipment eq: equipmentOfClient) {
			if(eq != null) {
				System.out.println("Category of equipment: " +  eq.getCategory() 
			+ "; Title of equipment: " + eq.getTitle() + "; Number of equipment: " + number);
			}
			number++;
		}
		
	} 
	
	
	public void remoteEquipment(int del) {
		System.out.println("-------");
		equipmentOfClient[del] = null;
		System.out.println("Equipment with number: " + del + 
				" was delete from massive equipmentOfClient");
	}
	
	
}

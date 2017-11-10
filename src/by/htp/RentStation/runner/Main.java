package by.htp.RentStation.runner;

import by.htp.RentStation.Assistant;
import by.htp.RentStation.Category;
import by.htp.RentStation.Cycle;
import by.htp.RentStation.JrAssistant;
import by.htp.RentStation.RentStation;
import by.htp.RentStation.Skating;
import by.htp.RentStation.Client.Client;
import by.htp.RentStation.RentUnit.RentUnit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Skating sk = new Skating(Category.ONE,  "skating" , "STELLS" );
		Cycle cycle = new Cycle(Category.ONE,  "cycle" , 3);
		
		RentUnit rentUnit = new RentUnit(1);
		RentUnit rentUnit1 = new RentUnit(1);
		
		rentUnit.addEquioment(cycle);
		rentUnit1.addEquioment(sk);
		
		RentStation rs = new RentStation(5);
		
		rs.addItem(rentUnit1);
		rs.addItem(rentUnit);
		
		Assistant assistant = new Assistant("Vasya", 10);
		assistant.addRenstation(rs);
		
		assistant.report();
		assistant.report(Category.ONE);
		
		Client client1 = new Client("Valera");
		
		client1.addEquipment(cycle);
		client1.addEquipment(sk);
		
		client1.reportOfEquipment();
		
		client1.remoteEquipment(1);
		
		client1.reportOfEquipment();
		
		
		assistant.createMasOfClient(1);
		assistant.addClient(client1);
		assistant.reportOfLendEquipment();
		
		
		Assistant.greeting();
		
		Assistant.setWelcome("this is the best rental equipment center");
		Assistant.greeting("Call me the boss of equipment and ");
		
		JrAssistant jrAssistant = new JrAssistant();
		
		JrAssistant.greeting();
		JrAssistant.greeting("Call me the small boss of equipment or ");
		
		sk.infoAboutEquipment();
		
		
		client1.setCostOfEquipment();
		client1.get—heckWithTime();
		System.out.println("-------");
		System.out.println("Cost of equipment: " + client1.getCostOfEquipment());
		assistant.getClientCostOfRent(0);

	}

}

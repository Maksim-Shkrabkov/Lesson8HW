package by.htp.RentStation;

import java.util.Date;

import by.htp.RentStation.Client.Client;
import by.htp.RentStation.RentUnit.RentUnit;

public class Assistant implements Administration, HeadMethods {
		
	private String name;
	private int age;
	private RentStation rs;
	private Client[] clients;
	private int countOfClients;
	private static String welcome;
	
	//constructors
	
	public Assistant() {
		
	}
	
	public Assistant(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//Getters and setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public RentStation getRs() {
		return rs;
	}
	
	public void setRs(RentStation rs) {
		this.rs = rs;
	}
	
	
	public Client[] getClients() {
		return clients;
	}

	public void setClients(Client[] clients) {
		this.clients = clients;
	}
	

	public static String getWelcome() {
		return welcome;
	}

	public static void setWelcome(String welcome) {
		Assistant.welcome = welcome;
	}
	
	//methods

	@Override
	public void addRenstation(RentStation rs) {
		
		this.rs = rs;
		
	}
	
	@Override
	public String info() {
		return "Assistant " + getName();
	}
	
	//static methods of Assistant
	
	public static final void greeting() {
		System.out.println("--------");
		System.out.println("I am your assistant and we welcome you");
	}
	
	public static void greeting(String welcome) {
		System.out.println("--------");
		System.out.println(welcome + Assistant.welcome);
	}
	
	
	//methods for client about time check
	
	public void getClientCostOfRent(int numOfClient) {
		
		System.out.println("-------");
		Date today = new Date();
		String hour = String.format("%tk", today);
		int hoursOfAssistant = Integer.parseInt(hour);
		int hoursOfClient = (int) clients[numOfClient].getHours();		
		int hoursDifference = hoursOfAssistant - hoursOfClient;
		
		int costOfRent;
		
		if (hoursDifference == 0) {
			costOfRent = clients[numOfClient].getCostOfEquipment();
			System.out.println("The total cost of rent of client: " + costOfRent);
		} else if(hoursDifference == 1) {
			costOfRent = (int) (clients[numOfClient].getCostOfEquipment() * 1.2);
			System.out.println("The total cost of rent of client: " + costOfRent);
		} else if(hoursDifference == 2) {
			costOfRent = (int) (clients[numOfClient].getCostOfEquipment() * 1.4);
			System.out.println("The total cost of rent of client: " + costOfRent);
		} else if(hoursDifference == 3) {
			costOfRent = (int) (clients[numOfClient].getCostOfEquipment() * 1.8);
			System.out.println("The total cost of rent of client: " + costOfRent);
		} else if(hoursDifference == 4) {
			costOfRent = (int) (clients[numOfClient].getCostOfEquipment() * 2);
			System.out.println("The total cost of rent of client: " + costOfRent);
		} else if(hoursDifference > 4) {
			costOfRent = (int) (clients[numOfClient].getCostOfEquipment() * 3);
			System.out.println("The total cost of rent of client: " + costOfRent);
		}
		
	} 
	
	//methods for clients	
	
	public void createMasOfClient(int number) {
		this.clients = new Client[number];
	}
	
	public void addClient(Client client){
		clients[countOfClients] = client;
		countOfClients++;
	}
	
	public void reportOfLendEquipment() {
		
		System.out.println("--------");
		
		int numOfClients = 0;
		for(Client cl : clients) {
			if(cl != null) {
				numOfClients++;
			}
		}
		
		
		System.out.println("Quantity of clients: " + numOfClients);
		
		int countEq= 0;
		for(int i = 0; i < numOfClients; i++) {
			countEq = clients[i].getEquipmentOfClient().length;
			for(int j = 0; j < countEq; j++) {
				if(clients[i].getEquipmentOfClient()[j] != null) {
				System.out.println("Title of lend equipment for client: " + 
						clients[i].getEquipmentOfClient()[j].getTitle() + 
						"; Category of lend equipment for client: " + 
						clients[i].getEquipmentOfClient()[j].getCategory() +";" );
				}
			}
			
		}
		
	}
	
	
	//report methods
	
	public void report() {
		
		int rentStlen = 0;
		for(RentUnit ru: rs.getRentUnits()) {
			if(ru != null) {
				rentStlen++;
			}
		}
		
		
		int countEq= 0;
		System.out.println("Quantity rentUnits in rentStation: " + rs.getRentUnits().length); 
		for(int i = 0; i < rentStlen; i++) {
			countEq = rs.getRentUnits()[i].getUnits().length;
			 	for(int j = 0; j < countEq; j++) {
			 		System.out.println("RentUnits ["+ i+"]  Equipment ["+j+"] Title - " 
			 	+ rs.getRentUnits()[i].getUnits()[j].getTitle() + " Category - " 
			 				+ rs.getRentUnits()[i].getUnits()[j].getCategory());
			 	}
		}
	}
	
		public void report(Category cat) {
		
		System.out.println("------");	
			
		int rentStlen = 0;
		for(RentUnit ru: rs.getRentUnits()) {
			if(ru != null) {
				rentStlen++;
			}
		}
		
		
		int countEq= 0;
		System.out.println("Quantity rentUnits in rentStation: " + rs.getRentUnits().length); 
		for(int i = 0; i < rentStlen; i++) {
			countEq = rs.getRentUnits()[i].getUnits().length;
			 	for(int j = 0; j < countEq; j++) {
			 		
			 		if(cat.equals(rs.getRentUnits()[i].getUnits()[j].getCategory()))
			 		
			 		System.out.println("RentUnits ["+ i +"]  Equipment [" + j + "] Title - " 
			 		+ rs.getRentUnits()[i].getUnits()[j].getTitle() + " Category - " 
			 				+ rs.getRentUnits()[i].getUnits()[j].getCategory());
			 	}
		}
	}
			
}

package by.htp.RentStation;

public final class Cycle extends Equipment implements Administration {
	
	private int countWheels;
	private int cost = 1000;
	
	public Cycle(Category category, String title, int countWheels) {
		super(category, title);
		// TODO Auto-generated constructor stub
		this.countWheels = countWheels;
	}

	public int getCountWheels() {
		return countWheels;
	}

	public void setCountWheels(int countWheels) {
		this.countWheels = countWheels;
	}
	
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String info() {
		return "title" + getTitle() + " Category " + getCategory() + " Count of wheels " + getCountWheels();
	}
	
	

	

}

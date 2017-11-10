package by.htp.RentStation;

public final class Skating extends Equipment implements Administration {
	
	private String brand;
	private int cost;
	
	public Skating(Category category, String title, String brand) {
		super(category, title);
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String info() {
		return "title" + getTitle() + " Category " + getCategory() + " Brand " + getBrand();
	}
	
	
	
}

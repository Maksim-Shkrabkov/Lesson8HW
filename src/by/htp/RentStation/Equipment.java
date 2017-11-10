package by.htp.RentStation;

public abstract class Equipment {
		
		private Category category;
		private String title;
		
		
		public Equipment(Category category, String title) {
			super();
			this.category = category;
			this.title = title;
		}


		public Category getCategory() {
			return category;
		}


		public void setCategory(Category category) {
			this.category = category;
		}


		public String getTitle() {
			return title;
		}


		public void setTitle(String title) {
			this.title = title;
		}
		
		public final void infoAboutEquipment() {
			System.out.println("------");
			System.out.println("Info about equipment: " + "1. Category: "  + this.getCategory() + "; 2. Title: " + this.getTitle());
		}
		
		
		
		
}

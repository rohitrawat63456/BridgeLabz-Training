package generics;

public class SmartWareHouseManagementSystem {
	public static void main(String args[]) {
		Electronics e = new Electronics("I phone", 56000);
		//e.display();

		Furniture f = new Furniture("Aalmirah", 6000);

		Groceries g = new Groceries("Rice", 120);

		Storage<Electronics> electronicStore = new Storage<>();
		Storage<Groceries> groceryStore = new Storage<>();
		Storage<Furniture> furnitureStore = new Storage<>();
		electronicStore.addItem(e);
		groceryStore.addItem(g);
		furnitureStore.addItem(f);

		electronicStore.display(electronicStore.store);
	}

}
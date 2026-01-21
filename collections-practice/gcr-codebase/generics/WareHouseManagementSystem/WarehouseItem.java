package generics;

public abstract class WarehouseItem {
	String itemName;
	int itemPrice;

	WarehouseItem(String itemName, int itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return this.itemName + " " + this.itemPrice + "\n";
	}
}

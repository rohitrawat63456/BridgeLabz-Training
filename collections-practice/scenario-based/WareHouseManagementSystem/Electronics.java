package generics;

public class Electronics extends WarehouseItem {

	Electronics(String itemName, int itemPrice) {
		super(itemName, itemPrice);
	}

	public void display() {
		System.out.print(super.itemName + " " + super.itemPrice);
	}
}

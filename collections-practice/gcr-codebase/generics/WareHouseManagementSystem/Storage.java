package generics;

import java.util.ArrayList;

public class Storage<T extends WarehouseItem> {
	ArrayList<T> store;

	Storage() {
		store = new ArrayList<>();
	}

	public void addItem(T item) {
		store.add(item);
	}

	public void display(ArrayList<? extends WarehouseItem> items) {
		for (WarehouseItem item : items) {
			System.out.print(item);
		}
	}

}

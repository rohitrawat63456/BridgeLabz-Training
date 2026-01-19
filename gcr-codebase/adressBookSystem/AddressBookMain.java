package adressBookSystem;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		Contact c = new Contact("Rohit", "Rawat", "Omaxe City", "Palwal", "Harayana", 200100, "9588556618",
				"rohit@gmail.com");
		AddressBook book = new AddressBook();
		book.addNewContact(c);
		book.display();
		book.editContact();
		book.display();
	}
}

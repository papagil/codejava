import java.util.*;

class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void updatePhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void updateEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nPhone: " + phoneNumber + "\nEmail: " + email;
    }
}

public class AddressBook {
    private Map<String, Contact> contacts;

    public AddressBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber, String email) {
        Contact newContact = new Contact(name, phoneNumber, email);
        contacts.put(name, newContact);
    }

    public Contact getContact(String name) {
        return contacts.get(name);
    }

    public void updateContactPhoneNumber(String name, String newPhoneNumber) {
        Contact contact = contacts.get(name);
        if (contact != null) {
            contact.updatePhoneNumber(newPhoneNumber);
        }
    }

    public void updateContactEmail(String name, String newEmail) {
        Contact contact = contacts.get(name);
        if (contact != null) {
            contact.updateEmail(newEmail);
        }
    }

    public void deleteContact(String name) {
        contacts.remove(name);
    }

    public void listAllContacts() {
        for (Contact contact : contacts.values()) {
            System.out.println(contact);
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        addressBook.addContact("John Doe", "123-456-7890", "john@example.com");
        addressBook.addContact("Jane Smith", "987-654-3210", "jane@example.com");

        System.out.println("Listing all contacts:");
        addressBook.listAllContacts();

        System.out.println("\nUpdating contact details:");
        addressBook.updateContactPhoneNumber("John Doe", "555-555-5555");
        addressBook.updateContactEmail("Jane Smith", "jane.new@example.com");

        System.out.println("\nListing all contacts after update:");
        addressBook.listAllContacts();

        System.out.println("\nDeleting a contact:");
        addressBook.deleteContact("John Doe");

        System.out.println("\nListing all contacts after deletion:");
        addressBook.listAllContacts();
    }
}

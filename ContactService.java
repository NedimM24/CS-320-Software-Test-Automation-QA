package org.example.CS320ProjectOne;
import java.util.ArrayList;

public class ContactService {
	 //Create contact list array to store contacts
    private ArrayList<Contact> contactList = new ArrayList<>();

    //addContact method with contact parameters
    //Include conditional to make sure uniqueID is actually unique
    public void addContact(String contactID, String firstName, String lastName, String number, String address) {
        for (Contact contact : contactList) {
            if (contact.getContactID().equals(contactID)) {
                throw new IllegalArgumentException("ContactID already exists");
            }
        }
        Contact newContact = new Contact(contactID, firstName, lastName, number, address);
        contactList.add(newContact);
    }

    //Deletes contact if user provided contactID matches contactID in contactList
    public boolean deleteContact(String contactID) {
        return contactList.removeIf(contact -> contact.getContactID().equals(contactID));
    }

    //Helper method needed for Junit tests
    public Contact get(String contactID) {
        for (Contact contact : contactList) {
            if (contact.getContactID().equals(contactID)) {
                return contact;
            }
        }
        throw new IllegalArgumentException("Contact ID not found");
    }

    /*
    * Update contact method with 3 parameters. Parameter input will be handled in the main function
    * Switch added for ease of use that finds what field the user wants updated
    * Throws exception if field or contact id not found
    * */
    public void updateContact(String contactID, String whatField, String userUpdate) {
        for (Contact contact : contactList) {
            if (contact.getContactID().equals(contactID)) {
                switch (whatField) {
                    case "firstName":
                        contact.setFirstName(userUpdate);
                        break;

                    case "lastName":
                        contact.setLastName(userUpdate);
                        break;

                    case "phone":
                        contact.setPhone(userUpdate);
                        break;

                    case "address":
                        contact.setAddress(userUpdate);
                        break;

                    default:
                        throw new IllegalArgumentException("Field not found");
                }
                return;

            }
        }
        throw new IllegalArgumentException("Contact ID: " + contactID + " not found");
    }

}

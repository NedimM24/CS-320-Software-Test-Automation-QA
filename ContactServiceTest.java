package org.example.CS320ProjectOne;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {

    ContactService service;


    @Test
    void addContactUniqueID() {
        service = new ContactService();
        service.addContact("4100", "Nedim", "Mulahusic", "6020000000", "300 N 300 Ave");
        assertThrows(IllegalArgumentException.class, ()-> service.addContact("4100", "test", "tester", "0000000000", "000 Test St"), "ERROR: contactID must be unique");
    }

    @Test
    void deleteContact() {
        service = new ContactService();
        service.addContact("400", "Nedim", "Mulahusic", "6020000000", "300 N 300 Ave");
        assertTrue(service.deleteContact("400"), "Contact deleted");
        assertFalse(service.deleteContact("400"), "Contact deleted");

    }

    @Test
    void updateFirstName() {
        service = new ContactService();
        service.addContact("300", "Nedim", "Mulahusic", "6020000000", "300 N 300 Ave");
        service.updateContact("300", "firstName", "Ned");

        Contact updatedContact = service.get("300");
        assertEquals("Ned", updatedContact.getFirstName());

    }

    @Test
    void updateLastName()
    {
        service = new ContactService();
        service.addContact("300", "Nedim", "Mulahusic", "6020000000", "300 N 300 Ave");
        service.updateContact("300", "lastName", "Mula");

        Contact updatedContact = service.get("300");
        assertEquals("Mula", updatedContact.getLastName());
    }

    @Test
    void updatePhone() {
        service = new ContactService();
        service.addContact("300", "Nedim", "Mulahusic", "6020000000", "300 N 300 Ave");
        service.updateContact("300", "phone", "4800000000");

        Contact updatedContact = service.get("300");
        assertEquals("4800000000", updatedContact.getPhone());
    }

    @Test
    void updateAddress() {
        service = new ContactService();
        service.addContact("300", "Nedim", "Mulahusic", "6020000000", "300 N 300 Ave");
        service.updateContact("300", "address", "301 N 301 Ave");

        Contact updatedContact = service.get("300");
        assertEquals("301 N 301 Ave", updatedContact.getAddress());
    }
}

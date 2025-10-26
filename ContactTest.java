package org.example.CS320ProjectOne;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    //2 Tests for each method. One test that checks for null and another that makes sure length doesn't exceed character limit
    //Both tests will be nested inside a class to improve readability and scalability

    @Nested
    class contactIDTests {

        @Test
        void nullTest() {
            Contact contact = new Contact("1234567890", "Nedim", "Mulahusic", "6026940431", "111 N Phoenix ave");
            assertNotNull(contact.getContactID(), "Contact id must not be null");
        }

        @Test
        void lengthTest() {
            Contact contact = new Contact("336465", "Nedim", "Mulahusic", "6026940431", "111 N Phoenix ave");
            assertTrue(contact.getContactID().length() <= 10, "Contact ID must not exceed 10 characters in length");
        }
    }

    @Nested
    class firstNameTests {

        @Test
        void nullTest() {
            Contact contact = new Contact("44010", "Nedim", "Mulahusic", "6026940431", "111 N Phoenix ave");
            assertNotNull(contact.getFirstName(), "First name must not be null");
        }

        @Test
        void lengthTest() {
            Contact contact = new Contact("336465", "Nedim", "Mulahusic", "6026940431", "111 N Phoenix ave");
            assertTrue(contact.getFirstName().length() <= 10, "First name must not exceed 10 characters in length");
        }
    }

    @Nested
    class lastNameTests {

        @Test
        void nullTest() {
            Contact contact = new Contact("44010", "Nedim", "Mulahusic", "6026940431", "111 N Phoenix ave");
            assertNotNull(contact.getLastName(), "Last name must not be null");
        }

        @Test
        void lengthTest() {
            Contact contact = new Contact("336465", "Nedim", "Mulahusic", "6026940431", "111 N Phoenix ave");
            assertTrue(contact.getLastName().length() <= 10, "Last must not exceed 10 characters in length");
        }
    }

    @Nested
    class phoneTests {

        @Test
        void nullTest() {
            Contact contact = new Contact("44010", "Nedim", "Mulahusic", "6020000000", "111 N Phoenix ave");
            assertNotNull(contact.getPhone(), "Phone must not be null");
        }

        @Test
        void lengthTest() {
            Contact contact = new Contact("336465", "Nedim", "Mulahusic", "6020000000", "111 N Phoenix ave");
            assertFalse(contact.getPhone().length() != 10, "Phone must be 10 characters in length");
        }
    }

    @Nested
    class addressTests {

        @Test
        void nullTests() {
            Contact contact = new Contact("44010", "Nedim", "Mulahusic", "6020000000", "111 N Phoenix ave");
            assertNotNull(contact.getAddress(), "Address must not be null");
        }


        @Test
        void lengthTests() {
            Contact contact = new Contact("336465", "Nedim", "Mulahusic", "6020000000", "111 N Phoenix ave");
            assertFalse(contact.getAddress().length() >= 30, "Address must be less than 30 characters in length");
        }
    }

}

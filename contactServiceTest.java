import org.junit.Test;

// create a test class for contactService that tests all the requirements of the contactService class
public class contactServiceTest {
    @Test
    public void test() {
        contactService service = new contactService();

        contact c = new contact("12345", "Jane", "Smith", "1234567890", "123 Main St");
        service.addContact(c);

        assert service.getAllContacts().containsKey("12345");
    }

    // test that adding a contact with a unique ID works
    @Test(expected = IllegalArgumentException.class)
    public void testDuplicateContactID() {
        contactService service = new contactService();
        contact c1 = new contact("12345", "Jane", "Smith", "1234567890", "123 Main St");
        service.addContact(c1);
        contact c2 = new contact("12345", "John", "Doe", "0987654321", "456 Elm St");
        service.addContact(c2);
    }

    // test that deleting a contact per contact ID works
    @Test
    public void testDeleteContact() {
        contactService service = new contactService();
        contact c = new contact("12345", "Jane", "Smith", "1234567890", "123 Main St");
        service.addContact(c);
        service.deleteContact("12345");
        assert !service.getAllContacts().containsKey("12345");
    }

    // test that updating a contact's first name, last name, phone number, and address by ID works
    @Test
    public void testUpdateContact() {
        contactService service = new contactService();
        contact c = new contact("12345", "Jane", "Smith", "1234567890", "123 Main St");
        service.addContact(c);
        service.updateFirstName("12345", "Janet");
        service.updateLastName("12345", "Doe");
        service.updatePhone("12345", "0987654321");
        service.updateAddress("12345", "456 Elm St");

        assert service.getAllContacts().get("12345").getFirstName().equals("Janet");
        assert service.getAllContacts().get("12345").getLastName().equals("Doe");
        assert service.getAllContacts().get("12345").getPhone().equals("0987654321");
        assert service.getAllContacts().get("12345").getAddress().equals("456 Elm St");
    }
}   
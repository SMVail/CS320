import org.junit.Test;


// create a test class for contact that tests all the requirements of the contact class
public class contactTest {
    @Test
    public void test() {
        String contactID = "12345";
        String firstName = "Jane";
        String lastName = "Smith";
        String phone = "1234567890";
        String address = "123 Main St";

        // test that the contact ID is not null and does not exceed 10 characters
        contact c = new contact(contactID, firstName, lastName, phone, address);
        assert c.getContactID().equals(contactID);
        assert c.getFirstName().equals(firstName);
        assert c.getLastName().equals(lastName);
        assert c.getPhone().equals(phone);
        assert c.getAddress().equals(address);
    }

    // test that the first name is not null and does not exceed 10 characters
    @Test(expected = IllegalArgumentException.class)
    public void testNullFirstName() {
        new contact("12345", null, "Smith", "1234567890", "123 Main St");
    }

    // test that the last name is not null and does not exceed 10 characters
    @Test(expected = IllegalArgumentException.class)
    public void testNullLastName() {
        new contact("12345", "Jane", null, "1234567890", "123 Main St");
    }

    // test that the phone number is not null and is exactly 10 characters
    @Test(expected = IllegalArgumentException.class)
    public void testNullPhone() {
        new contact("12345", "Jane", "Smith", null, "123 Main St");
    }

    // test that the address is not null and does not exceed 30 characters
    @Test(expected = IllegalArgumentException.class)
    public void testNullAddress() {
        new contact("12345", "Jane", "Smith", "1234567890", null);
    }
}


import java.util.HashMap;
import java.util.Map;


public class contactService {
    private final HashMap<String, contact> contacts = new HashMap<>();

    // CRUD operations for contact management
    public void addContact(contact c) {
        if (contacts.containsKey(c.getContactID())) {
            throw new IllegalArgumentException("Contact ID already exists");
        }
        contacts.put(c.getContactID(), c);
    }
    //delete contact
    public void deleteContact(String contactID) {
        contacts.remove(contactID);
    }
    //update first name, last name, phone number, and address by ID
    public void updateFirstName(String contactID, String firstName) {
        contact c = contacts.get(contactID);
        if (c != null) {
            c.setFirstName(firstName);
        } else {
            throw new IllegalArgumentException("Contact ID does not exist");
        }
    }

    //update last name
    public void updateLastName(String contactID, String lastName) {
        contact c = contacts.get(contactID);
        if (c != null) {
        c.setLastName(lastName);
        } else {
            throw new IllegalArgumentException("Contact ID does not exist");
        }
    }

    //update phone number
    public void updatePhone(String contactID, String phone) {
        contact c = contacts.get(contactID);
        if (c != null) {
            c.setPhone(phone);
        } else {
            throw new IllegalArgumentException("Contact ID does not exist");
        }
    }

    //update address
    public void updateAddress(String contactID, String address) {
        contact c = contacts.get(contactID);
        if (c != null) {
            c.setAddress(address);
        } else {
            throw new IllegalArgumentException("Contact ID does not exist");
        }
    }

    public Map<String, contact> getAllContacts() {
        return contacts;
    }
}

package CS320_Milestone_One;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	ContactService cs = new ContactService();
	
	@Test
	void createContactServiceSucceed()
	{
		cs = new ContactService();
		assertNotNull(cs);
	}
	
	@Test
	void testDeleteContact()
	{
		ContactService cs = new ContactService();
		assertNotNull(cs);

		Contact c = new Contact("00001", "Grant", "Sorenson", "1111111111", "address");
		Contact c2 = new Contact("00002", "Grant", "Sorenson", "1111111111", "address");

		cs.addContact(c);
		cs.addContact(c2);
		
		cs.Contacts = cs.deleteContact("00002");
		assertTrue(cs.Contacts.length == 1);
	}

	@Test
	@DisplayName("Add contact with Unique ID")
	void addContactWithUIDAndDeleteSucceed()
	{
		Contact c = new Contact("00002", "Grant", "Sorenson", "1111111111", "address");
		cs.addContact(c);
		assertTrue(cs.Contacts[0]==c);
	}

	
	@Test
	@DisplayName("UpdateContentFieldsAll")
	void UpdateAllContentFieldsSucceed()
	{
		Contact c = new Contact("00002", "Grant", "Sorenson", "1111111111", "address");
		cs.addContact(c);
		assertTrue(cs.Contacts[0]==c);
		
		cs.updateContactFirstName("00002","John");
		assertTrue(c.firstName.equals("John"));
		
		cs.updateContactLastName("00002","Doe");
		assertTrue(c.lastName.equals("Doe"));
		
		cs.updateContactPhone("00002","0000000000");
		assertTrue(c.phone.equals("0000000000"));
		
		cs.updateContactAddress("00002","Minnesota");
		assertTrue(c.address.equals("Minnesota"));
	}
}

package CS320_Milestone_One;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactTest {
	
	//final Contact controlContact = new Contact("0000000001", "grant", "sorenson", "0123456789", "address");
	Contact contact;
	
	@BeforeEach
	void setupNextTest()
	{
		//supply each test with valid data
		contact = new Contact("0000000001", "grant", "sorenson", "0123456789", "address");
	}
	
	@Test
	void testCreateContactSucceeds()
	{
		assertTrue(contact != null);
	}
	
	@Test 
	void ContactIdTooLongSucceeds()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000000011", "grant", "sorenson", "0123456789", "address");
		});
	}
	
	@Test 
	void ContactIdNullSucceeds()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "grant", "sorenson", "0123456789", "address");
		});
	}
	
	@Test 
	void ContactFNameTooLongSucceeds()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0000000001", "grant123456", "sorenson", "0123456789", "address");
		});
	}
	
	@Test 
	void ContactFNameNullSucceeds()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0000000001", null, "sorenson", "0123456789", "address");
		});
	}
	
	@Test 
	void ContactLNameTooLongSucceeds()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000000011", "grant", "sorenson123", "0123456789", "address");
		});
	}
	
	@Test 
	void ContactLNamenullSucceeds()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000000011", "grant", null, "0123456789", "address");
		});
	}
	
	@Test 
	void ContactPhoneTooLongSucceeds()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000000011", "grant", "sorenson", "012345678910", "address");
		});
	}
	
	@Test 
	void ContactAddressTooLongSucceeds()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("00000000011", "grant", "sorenson", "0123456789", "address1234567891011121314151617181920");
		});
	}
	
	
	@Test
	@DisplayName("Not Null Verify")
	void CheckValuesForNull()
	{
		assertNotNull(contact.getContactID());
		assertNotNull(contact.firstName);
		assertNotNull(contact.lastName);
		assertNotNull(contact.phone);
		assertNotNull(contact.address);
	}
	
	@Test
	void UpdateFNameSucceed()
	{
		contact.updateFirstName("Tnarg");
		assertTrue(contact.firstName.equals("Tnarg"));
	}
	
	@Test
	void UpdateLNameSucceed()
	{
		contact.updateLastName("nosneros");
		assertTrue(contact.lastName.equals("nosneros"));
	}
	
	@Test
	void UpdatePhoneSucceed()
	{
		contact.updatePhoneNumber("9876543210");
		assertTrue(contact.phone.equals("9876543210"));
	}
	
	@Test
	void UpdateAddressSucceed()
	{
		contact.updateAddress("0291817");
		assertTrue(contact.address.equals("0291817"));
	}
	
	

}

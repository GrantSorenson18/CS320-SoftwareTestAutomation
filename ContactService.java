package	CS320_Milestone_One;

public class ContactService {
	
	//Array to hold our contacts, init'ed in constructor
	public Contact[] Contacts;
	
	//constructor
	public ContactService()
	{
		Contacts = new Contact[0];
	}
	
	public boolean addContact(Contact contact)
	{
		
		//first lets make sure were not duplicating any entries and if we have any entries
		if (Contacts.length > 0)
		{
			for (Contact c: Contacts )
			{
				if (c.getContactID().equals(contact.getContactID()))
				{
					//if our contact ID are the same, fail with a warning.
					throw new IllegalArgumentException("Duplicate Contact ID");
				}
			}
		}
		
		// add the new contact with the specified id, all other values will be default
		//depending on future implementation this may have to optimized or made more private, but for now ill
		//do everything by hand as its exposed and sending arrays gets expensive
		
		Contact[] newContacts = new Contact[Contacts.length + 1];
		
		for (int x = 0; x < Contacts.length; x++)
		{
			newContacts[x] = Contacts[x];
		}
		
		//create and add our new contact
		Contact newContact = contact;
		newContacts[Contacts.length] = newContact;
		
		//replace our Contact lists
		Contacts = newContacts;
		return true;
	}
	
	public Contact[] deleteContact(String contactID)
	{
		int ind = 0;
		Contact[] newContacts = new Contact[Contacts.length-1];
		
		
		for (int x = 0; x <= Contacts.length-1; x++)
		{
			if (Contacts[x].getContactID().equals(contactID))
			{
				if (x == Contacts.length) 
				{
					//Contacts = newContacts;
					return newContacts; //its our last element, so just omit and reassign
				}
				ind = x;
				break;
			}
			
			newContacts[x] = Contacts[x];
		}
		
		
		for(int i = ind+1; i <= newContacts.length; i++)//assign the rest of the values besides removed one
		{
			newContacts[i-1] = Contacts[i];
		}
		
		//Contacts = newContacts;
		return newContacts;
	}
	
	public void updateContactFirstName(String ContactID, String firstName)
	{
		for(Contact c : Contacts)
		{
			if(c.getContactID().equals(ContactID))
			{
				c.updateFirstName(firstName);
			}
		}
		
	}
	
	public void updateContactLastName(String ContactID, String lastName)
	{
		for(Contact c :Contacts)
		{
			if(c.getContactID().equals(ContactID))
			{
				c.updateLastName(lastName);
			}
		}
	}
	
	public void updateContactPhone(String ContactID, String phone)
	{
		for(Contact c :Contacts)
		{
			if(c.getContactID().equals(ContactID))
			{
				c.updatePhoneNumber(phone);
			}
		}
	}
	
	public void updateContactAddress(String ContactID, String address)
	{
		for(Contact c :Contacts)
		{
			if(c.getContactID().equals(ContactID))
			{
				c.updateAddress(address);
			}
		}
	}

}

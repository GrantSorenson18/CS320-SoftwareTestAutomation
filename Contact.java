package	CS320_Milestone_One;

public class Contact {
	
	//declare our class variables, declare contactID with final to make it unchangeable. nothing noting other values require hiding
	private final String contactID;
	public String firstName;
	public String lastName;
	public String phone;
	public String address;
	
	public Contact(String ID, String firstName, String lastName, String phone, String address)
	{
		//constructor where we assign  ALL our passed values, all of which must have a value, we should also do
		//validity checking here to make sure each entry is within the character requirements
		if (ID == null || ID.length() > 10)
		{
			throw new IllegalArgumentException("Invalid Contact ID");
		}
		
		if (firstName == null || firstName.length() > 10)
		{
			throw new IllegalArgumentException("Invalid first name please have smaller first name");

		}
		
		if (lastName == null || lastName.length() > 10)
		{
			throw new IllegalArgumentException("Invalid last name please have smaller last name");

		}
		
		if (phone == null || phone.length() != 10 && !phone.matches("\\d{10}"))
		{
			throw new IllegalArgumentException("Invalid phone please buy new phone");

		}
		
		if (address == null || address.length() > 30)
		{
			throw new IllegalArgumentException("Invalid address please move closer");
		}
		
		this.contactID = ID;
		this.firstName = firstName;
		this.lastName=lastName;
		this.phone=phone;
		this.address=address;
	}
	
	//getter for contact id, prevent overriding
	public final String getContactID() {return contactID;}
	
	// We should also do error checking on the following getters so each entry is within character requirements
	public void updateFirstName(String firstName)
	{
		if (firstName == null || firstName.length() > 10)
		{
			throw new IllegalArgumentException("Invalid first name please have smaller first name");
		}
		this.firstName = firstName;
	}
	public void updateLastName(String lastName)	
	{
		if (lastName == null || lastName.length() > 10)
		{
			throw new IllegalArgumentException("Invalid last name please have smaller last name");

		}
		this.lastName = lastName;
	}
	public void updatePhoneNumber(String phone)
	{
		if (phone == null || phone.length() != 10 && !phone.matches("\\d{10}"))
		{
			throw new IllegalArgumentException("Invalid phone please buy new phone");

		}
		this.phone = phone;
	}
	public void updateAddress(String address)
	{
		if (address == null || address.length() > 30)
		{
			throw new IllegalArgumentException("Invalid address please move closer");
		}
		this.address = address;
	}
	
}

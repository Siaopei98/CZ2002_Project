package Package;

public class Customer {
	private String Name;
	private int Gender, Contact;
	private boolean Membership;
	public Customer(String name, int gender, int contact, boolean membership) {
		super();
		this.Name = name;
		this.Gender = gender;
		this.Contact = contact;
		this.Membership = membership;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getGender() {
		return Gender;
	}
	public void setGender(int gender) {
		Gender = gender;
	}
	public int getContact() {
		return Contact;
	}
	public void setContact(int contact) {
		Contact = contact;
	}
	public boolean isMembership() {
		return Membership;
	}
	public void setMembership(boolean membership) {
		Membership = membership;
	}
	
}

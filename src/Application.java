
public class Application {
	private String name;
	private String address;
	private Email email;
	private Phone phone;
	private Qualification qualification;
	private int experience;
	public Application(String name, String address, Email email, Phone phone, Qualification qualification,
			int experience) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.experience = experience;
		
		this.qualification=qualification;
		//System.out.println("Created");
		//viewApplicantDetail();
	}
	public void viewApplicantDetail(){
		System.out.println("\nName: "+this.name+"\nAddress: "+this.address+"\nEmail: "+this.email.getEmailAddress()+"\nPhone: "+this.phone.getNumber()+"\nExperience: "+this.experience);
		qualification.viewQualification();
	}
	public Email getEmail() {
		return email;
	}
	public Phone getPhone() {
		return phone;
	}
	public int getExperience() {
		return experience;
	}
	
	
}

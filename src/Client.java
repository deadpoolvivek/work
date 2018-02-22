
public class Client {
	public static void main(String[] args){
		try{
		OnlinePortal portal=new OnlinePortal();
		Email emailOne = new Email("reshakunkalekar@gmail.com");
		Email emailTwo = new Email("reenakunkalekar@gmail.com");
		
		Phone phoneOne = new Phone(9049638);
		Phone phoneTwo = new Phone(75073705);
		
		
		Qualification qualione=new Qualification();
		qualione.addQualification("Hssc");
		qualione.addQualification("Graduate");
		qualione.addQualification("SSC");
		
		Qualification qualitwo=new Qualification();
		qualitwo.addQualification("Graduate");
		qualitwo.addQualification("SSC");
		qualitwo.addQualification("Hssc");
		qualitwo.addQualification("PG");
		
		Application applicant = new Application("Resha", "Panaji", emailOne, phoneOne, qualitwo, 2);
		Application applicant2=new Application("Reena", "Mapusa", emailTwo, phoneTwo, qualione, 0);
		Application applicant3=new Application("Ritik", "Vasco", emailOne, phoneOne, qualitwo, 2);
		
		portal.addApplicatio(applicant);
		portal.addApplicatio(applicant2);
		portal.viewAppliction();
		
		//Display Mail and phone message
		applicant.getEmail().viewMailaBox();
		applicant.getPhone().viewMessages();
		applicant2.getEmail().viewMailaBox();
		applicant2.getPhone().viewMessages();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Application");
		}
		}
}

import java.util.LinkedList;
import java.util.Random;

public class OnlinePortal {
	public LinkedList<AcceptedApplication> applicant=new LinkedList<AcceptedApplication>();
	private Message message;
	
	
	public void addApplicatio(Application applicants){
		try{
		applicant.add(new AcceptedApplication(applicants, sendmessage(applicants) ));
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	private String sendmessage(Application aplic){
		Random r=new Random();
		
		if(aplic.getExperience()==0){
			message=new Message("Application Accepted", "OnlineJobPortal");
			String k=" X"+r.nextInt(1000);
			message.text=message.text+" This is ur id "+k;
			aplic.getPhone().getMessages(message);
			message=new Message("Application Accepted", "OnlineJobPortal");
			message.text=message.text+" This is ur id "+k;
			aplic.getEmail().getMessage(message);
			return k;
		
		
		}else{
			message=new Message("Application Accepted", "OnlineJobPortal");
			String k=" EX"+r.nextInt(1000);
			message.text=message.text+" This is ur id "+k;
			aplic.getPhone().getMessages(message);
			message=new Message("Application Accepted", "OnlineJobPortal");
			message.text=message.text+" This is ur id "+k;
			aplic.getEmail().getMessage(message);
			return k;
		}
		
	}
	
	public void viewAppliction(){
		for(int i=0;i<applicant.size();i++){
			AcceptedApplication temp=applicant.get(i);
			temp.getAplicant().viewApplicantDetail();
			System.out.println("ID: "+temp.getId());
		}
	}
	
}

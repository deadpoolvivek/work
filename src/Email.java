import java.util.LinkedList;

public class Email {
	private String emailAddress;
	private LinkedList<Message> mails=new LinkedList<Message>();
	
	public Email(String emailAddress) {
		super();
		if(validateEmail(emailAddress)){
			this.emailAddress = emailAddress;
		}
		else{
			System.out.println("Not valid Email ");
		}
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void viewMailaBox(){
		System.out.println("Sender\t\t\tMessage");
		for(int i=0;i<mails.size();i++){
			Message temp=mails.get(i);
			System.out.println(temp.from+"\t\t\t"+temp.text);
		}
	}
	public Boolean validateEmail(String emailAddress){
		  String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	      Boolean b = emailAddress.matches(EMAIL_REGEX);
	      if(b){
	    	  return b;
	      }
	      
		return b;
	}
	public void getMessage(Message mail){
		mails.add(mail);
	}
} 

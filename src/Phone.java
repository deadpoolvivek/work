import java.util.LinkedList;

public class Phone {
	private int number;
	private LinkedList<Message> messages=new LinkedList<Message>();
	
	public Phone(int number) {
		super();
		this.number = number;
		
	}
	public int getNumber() {
		return number;
	}
	public void viewMessages(){
		System.out.println("Sender\t\t\tMessage");
		for(int i=0;i<messages.size();i++){
			Message text= messages.get(i);
			System.out.println(text.from+"\t\t\t"+text.text);
		}
	}
	public void getMessages(Message message){
		messages.add(message);
	}
	
}

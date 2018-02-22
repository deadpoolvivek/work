import java.util.LinkedList;

public class Qualification {
	LinkedList<String> qualification=new LinkedList<String>();
	public void addQualification(String quali){
		qualification.add(quali);
	
	}
	public void viewQualification(){
		for(int i=0;i<qualification.size();i++){
			String temp=qualification.get(i);
			System.out.println(temp);
		}
	}
}

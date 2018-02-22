
public class AcceptedApplication {
	private Application aplicant;
	private String id;
	public AcceptedApplication(Application aplicant, String id) {
		super();
		this.aplicant = aplicant;
		this.id = id;
	}
	public Application getAplicant() {
		return aplicant;
	}
	public String getId() {
		return id;
	}
	
}

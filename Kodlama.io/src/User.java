
public class User {
	
	private int id;
	private String email;
	
	 public  User() {
		
	}
	 
	public User(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}
	

}

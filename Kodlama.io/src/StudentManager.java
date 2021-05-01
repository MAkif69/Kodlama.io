
public class StudentManager extends UserManager {
	
	
	
	
	public void add(User user) {
		System.out.println(user.firstName+ " Student added");
	}
	
	
	public void delete(User user) {
		System.out.println(user.firstName+ " Student deleted");
	}
	
	
	public void update(User user) {
		System.out.println(user.firstName+ " Student updated");
	}

}


public class InstructorManager extends UserManager{

	
	
	
	public void add(User user) {
		System.out.println(user.firstName+ " Instructor added");
	}
	

	public void delete(User user) {
		System.out.println(user.firstName+ " Instructor deleted");
	}
	
	
	public void update(User user) {
		System.out.println(user.firstName+ " Instructor updated");
	}
}

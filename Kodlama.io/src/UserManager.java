
public class UserManager {
 
	public void add(User user) {
		System.out.println(user.firstName+ " User'ı extend eden sınıf added");
	}
	
	public void delete(User user) {
		System.out.println(user.firstName+ " User deleted");
	}
	
	public void update(User user) {
		System.out.println(user.firstName+ " User updated");
	}
}

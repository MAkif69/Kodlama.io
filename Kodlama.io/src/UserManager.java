
public class UserManager {
 
	public void add(User user) {
		System.out.println(user.getEmail() + " Email eklendi");
	}
	
	public void delete(User user) {
		System.out.println(user.getEmail() + " email deleted");
	}
	
	public void update(User user) {
		System.out.println(user.getEmail()+ " email updated");
	}
}

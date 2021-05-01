
public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.firstName = "Akif";
		
		Instructor instructor = new Instructor();
		instructor.firstName = "Engin";
		
		UserManager userManager = new UserManager();
		userManager.add(student);
	    userManager.add(instructor);
		
	    
		StudentManager sM = new StudentManager();
		sM.add(student);
		
		
	}

}

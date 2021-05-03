
public class Main {

	public static void main(String[] args) {
		
		
		Student student = new Student();
		student.setFirstName("Akif");
		student.setLastName("Hslk");
		student.setEmail("abcdef@falan.com");
		student.setNationalityNumber("111111111112");
		student.setPassword("000000");
		student.setStudentNumber("1");
	
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroð");
		instructor.setCoursePrice("Ücretsiz");
		instructor.setCourseName("Java");
		instructor.setEmail("abcdefg@falan.com");
		instructor.setNationalityNumber("99999999999");
		instructor.setPassword("123");
		
		UserManager userManager = new UserManager();
		userManager.add(student);
	    userManager.add(instructor);
		
	   
		
	}

}

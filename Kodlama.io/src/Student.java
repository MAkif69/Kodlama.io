
public class Student extends User {

	//String courseDetail;
	//String completeHomework;
	private String studentId;
	private String firstName;
	private String lastName;
	private String nationalityNumber;
	private String password;
	private String studentNumber;
	
	public  Student() {
		
	}
	
	
	public Student(String studentId, String firstName, String lastName, String nationalityNumber, String password,
			String studentNumber) {
	    super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityNumber = nationalityNumber;
		this.password = password;
		this.studentNumber = studentNumber;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNationalityNumber() {
		return nationalityNumber;
	}


	public void setNationalityNumber(String nationalityNumber) {
		this.nationalityNumber = nationalityNumber;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getStudentNumber() {
		return studentNumber;
	}


	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}


	public String getStudentId() {
		return studentId;
	}	
	
	
}

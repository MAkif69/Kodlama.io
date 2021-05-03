
public class Instructor extends User {
	
	private String ýnstructorId;
	private String firstName;
	private String lastName;
	private String nationalityNumber;
	private String courseName;
	private String password;
	private String coursePrice;
	
	public  Instructor() {
		
	}
	
	public Instructor(String email, String instructorId, String firstName, String lastName, String nationalityNumber,
			String courseName, String password, String coursePrice) {
		super(email);
		ýnstructorId = instructorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityNumber = nationalityNumber;
		this.courseName = courseName;
		this.password = password;
		this.coursePrice = coursePrice;
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

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(String coursePrice) {
		this.coursePrice = coursePrice;
	}

	public String getInstructorId() {
		return ýnstructorId;
	}

}

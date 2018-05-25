
public class Student {
	
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private int age;
	private int[] grades;
	
	//Constructor
	public Student(String id, String firstName, String lastName,
			 		String email, int age, int[] grades) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setAge(age);
		setGrades(grades);
	}
	
	//Accessors
	public String getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getAge() {
		return age;
	}
	
	public int[] getGrades() {
		return grades;
	}
	
	//Mutators
	public void setId(String id) {
		this.id = id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGrades(int[] grades) {
		 this.grades = grades;
	 }

	//Print method
	public void print() {
		System.out.println("ID:\t" + getId() + 
						"\tFirst Name:\t" + getFirstName() +
						"\tLast Name:\t" + getLastName() +
						"\tE-mail Address:\t" + getEmail() +
						"\tAge:\t" + getAge() +
						"\tGrade 1:\t" + getGrades()[0] +
						"\tGrade 2:\t" + getGrades()[1] +
						"\tGrade 3:\t" + getGrades()[2]);
	}

}

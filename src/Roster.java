import java.util.ArrayList;

public class Roster {

	private static ArrayList<Student> myRoster = new ArrayList<>();

	public static void main(String[] args) {
		//Add student data
		Roster.add("1", "John", "Smith", "John1989@gmail.com", 20, 88, 79, 59);
		add("2", "Suzan", "Erickson", "Erickson_1990@gmailcom", 19, 91, 72, 85);
		add("3", "Jack", "Napoli", "The_lawyer99yahoo.com", 19, 85, 84, 87);
		add("4", "Erin", "Black", "Erin.black@comcast.net", 22, 91, 98, 82);
		add("5", "Sinjin", "Cooper", "scoop81@my.wgu.edu", 27, 98, 99, 100);
		
		print_all();
		print_invalid_emails();
		print_average_grade("4");
		remove("3");
		remove("3");
	}

	public static void add(String id, String firstName, String lastName,
						String email, int age, int grade1, int grade2, int grade3) {
		int[] grades = {grade1, grade2, grade3};
		Student newStudent = new Student(id, firstName, lastName, email, age, grades);
		myRoster.add(newStudent);
	}
	
	//Requirement B.3.a - remove student from roster by ID
	public static void remove(String id) {
		for (Student a : myRoster) {
			if (id == a.getId()) {
				myRoster.remove(a);
				System.out.println("Record deleted for Student ID:\t" + id);
				return;
			}
		}
		System.out.println("No record for Student ID:\t" + id);
	}
	
	//Requirement B.3.b - print a complete list of student data
	public static void print_all() {
		System.out.println("Students:\t");
		for (Student a : myRoster) {
			a.print();
		}
	}
	
	//Requirement B.3.c - print student's average grade by ID
	public static void print_average_grade(String id) {
		for (Student a : myRoster) {
			if (id == a.getId()) {
				double average = (a.getGrades()[0] + a.getGrades()[1] + a.getGrades()[2]) / 3;
				System.out.println("ID:\t" + a.getId() + "\tAvg Grade:\t" + average);
			}
		}
	}
	
	//Requirement B.3.d - verify email address validity and print invalid entry if necessary
	public static void print_invalid_emails() {
		for (Student a : myRoster) {
			String email = a.getEmail();
			if (!email.contains("@") || !email.contains(".") || email.contains(" ")) {
				System.out.println("Invalid E-mail:\t" + email);
			}
		}
	}
}

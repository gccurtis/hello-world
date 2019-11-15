import java.util.Calendar;

/**
 * This class is the representation of the student.
 * @author Gabriel Curtis
 */

//Etra comment
public class Student {
	String firstName;
	String lastName;
	String department;
	int yearOfBirth;
	float cumulativeGPA;
	static int counter=0;

	//This static block keeps track of objects when instantiated
	static{
		counter++;
	}

	//Constructor given data

	/**
	 * This is the constructor of the student given there information.
	 * @param fName
	 * @param lName
	 * @param dept
	 * @param yOB
	 * @param cgpa
	 */
	public Student(String fName, String lName, String dept, int yOB, float cgpa){
		this.firstName = fName;
		this.lastName = lName;
		this.department = dept;
		this.yearOfBirth = yOB;
		if(cgpa > 4 || cgpa < 0) {
			this.cumulativeGPA = 0;
		}
		else{
			this.cumulativeGPA = cgpa;
		}
	}

	public static void main(String[] args){
		if args.length == 0{
			Student s = new Student();
			System.out.println(s);
		}
		else if args.length == 5{

		}
		else{
			throw "Student:Student(): The Student class requires at least five parameters: First name, Last name, Department, Year of Birth and CGPA."
		}
	}
	//Default constructor

	/**
	 * This is the default constructor
	 */
	public Student(){
		this("","","",1900,0);
	}

	//Returns number of objects instantiated

	/**
	 * This returns the number of objects created
	 * @return number of objects created
	 */
	public static int numberOfObjects(){
		return counter;
	}

	//Returns a string representing the object

	/**
	 * This creates and returns a string version of the object
	 * @return a string representation of the Student
	 */
	public String toString(){
		return this.firstName+" "+this.lastName+" "+this.department+" "+this.yearOfBirth+" "+this.cumulativeGPA;
	}

	//Calculates the age of the Student given their birth year
	//Use java.util.Calendar to get current year

	/**
	 * Calculates the students approximate age given there current year
	 * @return the approximate student age
	 */
	public int calcAge(){
		int current_year = Calendar.getInstance().get(Calendar.YEAR);
		if (this.yearOfBirth > current_year || this.yearOfBirth < 0){
			return -1;
		}
		return current_year-this.yearOfBirth;
	}
}

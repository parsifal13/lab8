package lab8;
/**
 * <p> Title: Student Class </p>
 *
 * <p>Description: This calss gets student Id, firstName, lastName
 * and grades data. Also this class calculates exam average and
 * able to drop the lowestscore to maximize the average </p>
 *
 * @author Hamin Choi Student (N00765091@students.ncc.edu)
 */

public class Student {
	
	// instance variables
	private String studentId;
	private String firstName;
	private String lastName;
	private double[] grades;

	/** 
	 * default constructor
	 * the id, first and last names are initialized to "none"
	 * the array is created with 4 elements - each element is
	 * initialized to 0
	 */
	public Student() {
		studentId = "none";
		firstName = "none";
		lastName = "none";
		grades = new double[] {0, 0, 0, 0};

	}
	
	/** 
	 * parameterized constructor
	 * stores the parameters into the appropriate instance variables
	 * @param theId the value to be stored in studentId
	 * @param theFirstName the value to be stored in firstName
	 * @param theLastName the value to be stored in lastName
	 * @param theExams the value to be stored in grades
	 */
	public Student(String theId, String theFirstName, String theLastName,
				   double[] theExams)   {
		studentId = theId;
		firstName = theFirstName;
		lastName = theLastName;
		grades = theExams;
	}
	
	/**
	 * setStudentId - mutator method for studentId
	 * stores the parameter into the instance variable
	 * @param theId the value to be stored in the instance variable studentId
	 */
	public void setStudentId(String theId) {
		studentId = theId;
	}
	/**
	 * setGrades - mutator method for grades
	 * stores the parameter into the instance variable
	 * @param theGrades a reference to an array containing the new grades
	 */
	public void setGrades(double[] theGrades) {
		grades = theGrades;
	}
	/**
	 * getFirstName - accessor method for firstName
	 * @return a reference to the instance variable firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * getLastName - accessor method for lastName
	 * @return a reference to the instance variable lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * getStudentId - accessor method for id
	 * @return a reference to the instance variable id
	 */
	public String getStudentId() {
		return studentId;
	}
	/**
	 * getGrades - accessor method for exams
	 * @return a reference to the instance variable exams
	 */
	public String getGrades() {
		String returnMe = "";
		for (int i = 0; i < grades.length; i++) {
			returnMe += grades[i] + " ";
		}
		return returnMe;

	}
	/**
	 * findLowestExam - find the lowest exam score in the array and
	 * return its location in the array
	 * @return the position of the lowest exam grade in the array
	 */
	public int findLowestExam() {
		int lowest = 0;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < grades[lowest])
				lowest = i;
		}
		return lowest;
	}
	/**
	 * calcExamAverage - calculates the average of the exams in one of two ways 
	 * if the parameter is true, the lowest exam score is dropped in 
	 * calculating the average
	 * if the parameter is false, no exams are dropped in the calculating
	 * the average
	 * @param drop should the lowest grade be dropped from the average?
	 * @return the average of the exams
	 */
	public double calcExamAverage(boolean drop) {
		double sum = 0;
		double average = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		if (drop) {
			average = (sum - grades[findLowestExam()]) / (grades.length - 1);
		}
		else average = sum / grades.length;
		return average;
	}
	/**
	 * toString - create and return a String with the instance variable values
	 * @return a reference to a String containing the id, first and last names
	 * and the exam grades
	 */
	public String toString() {
		String stringGrades = "";
		for (int i = 0; i < grades.length; i++) {
			stringGrades += grades[i] + " ";
		}
		return new String("Id: " + studentId + "\n" + "Name: " +
				lastName + ", " + firstName + "\n" + "Grades: " + stringGrades);

	}
}

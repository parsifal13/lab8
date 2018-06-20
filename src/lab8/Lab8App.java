package lab8;
/**
 * <p> Title: Lab Assignment #8: Writing the Student Class </p>
 *
 * <p> Description: This program tests programmer-defined
 * class Student.java </p>
 *
 * <p> Due 20 June 10:05 am </p>
 *
 * @author Hamin Choi Student (N00765091@students.ncc.edu)
 */
public class Lab8App {
    /**
     * <p>
     * Name: main method
     * </p>
     *
     * @param args
     *            values to be sent to the method
     */
    public static void main(String[] args) {
        Student theStudent = new Student();
        System.out.println("Testing default constructor: " + "\n" +
            theStudent.toString() + "\n");
        Student theStudent1 = new Student("123456789", "Jane", "Doe",
            new double[] {98.5, 76.5, 79.0, 84.0});
        System.out.println("Testing parameterized constructor: " + "\n" +
            theStudent1.toString() + "\n");
        theStudent1.setStudentId("987654321");
        System.out.println("Setting Jane Doe's id: " + "\n" + theStudent1.toString() + "\n");
        theStudent1.setGrades(new double[] {98.5, 95.0, 79.0, 84.0});
        System.out.println("Setting Jane Doe's second exam: " + "\n" +
            theStudent1.toString() + "\n");
        System.out.println("Getting the student id for Jane Doe: " + "\n" +
            "Id is " + theStudent1.getStudentId());
        System.out.println("Getting the first name for Jane Doe: " + "\n" + "First name is " +
            theStudent1.getFirstName());
        System.out.println("Getting the last name for Jane Doe:" + "\n" + "Last name is " +
            theStudent1.getLastName());
        System.out.println("Getting Jane Doe's grades: ");
        System.out.println(theStudent1.getGrades());
        System.out.println("Getting the array position of the lowest exam:" + "\n" +
            "Lowest exam is at position " + theStudent1.findLowestExam());
        System.out.println("Calculating the average without dropping the lowest exam:" + "\n"
            + theStudent1.calcExamAverage(false));
        System.out.println("Calculating the average after dropping the lowest exam:" + "\n"
            + theStudent1.calcExamAverage(true));
    }
}

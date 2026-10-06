
/**
 * Milind Tuladhar
 * October 2
 * The purpose of the program is to calculate the total points and average points student_graded by
 * a student as new test student_grades are added.
 */
public class GradesV2
{
    public static void main(String[] args)
    {
        //local variables
        int test_number = 0;        //counts the number of tests
        int student_grade = 0;      //individual test grade
        int total_grade = 0;        //total points for all tests
        double average = 0.0;       //average grade

        System.out.println("TestNo.   StudentGrade    TotalGrade    Average");

        //test number1
        test_number++;
        student_grade = 95;
        total_grade += student_grade;
        average = (double) total_grade / test_number;
        System.out.println(test_number + "         " + student_grade + "              " + total_grade + "            " + average);

        //test number2
        test_number++;
        student_grade = 73;
        total_grade += student_grade;
        average = (double) total_grade / test_number;
        System.out.println(test_number + "         " + student_grade + "              " + total_grade + "            " + average);

        //test number3
        test_number++;
        student_grade = 91;
        total_grade += student_grade;
        average = (double) total_grade / test_number;
        System.out.println(test_number + "         " + student_grade + "              " + total_grade + "            " + average);

        //test number4
        test_number++;
        student_grade = 82;
        total_grade += student_grade;
        average = (double) total_grade / test_number;
        System.out.println(test_number + "         " + student_grade + "              " + total_grade + "            " + average);

        //test number5
        test_number++;
        student_grade = 88;
        total_grade += student_grade;
        average = (double) total_grade / test_number;
        System.out.println(test_number + "         " + student_grade + "              " + total_grade + "            " + average);

        //test number6
        test_number++;
        student_grade = 76;
        total_grade += student_grade;
        average = (double) total_grade / test_number;
        System.out.println(test_number + "         " + student_grade + "              " + total_grade + "            " + average);

        //test number7
        test_number++;
        student_grade = 94;
        total_grade += student_grade;
        average = (double) total_grade / test_number;
        System.out.println(test_number + "         " + student_grade + "              " + total_grade + "            " + average);

        //test number8
        test_number++;
        student_grade = 85;
        total_grade += student_grade;
        average = (double) total_grade / test_number;
        System.out.println(test_number + "         " + student_grade + "              " + total_grade + "            " + average);

        //test number9
        test_number++;
        student_grade = 90;
        total_grade += student_grade;
        average = (double) total_grade / test_number;
        System.out.println(test_number + "         " + student_grade + "              " + total_grade + "            " + average);
    }
}
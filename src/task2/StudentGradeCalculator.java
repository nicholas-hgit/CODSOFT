package task2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter total number of subjects");

        int numberOfSubjects = getNumberOfSubjects();

        double totalMarks = 0;
        double mark;
        for(int subjectNumber = 1; subjectNumber <= numberOfSubjects;) {
            System.out.printf("Enter mark for subject %d out of 100 %n", subjectNumber);

            try {
                mark = input.nextDouble();
                if(isValidMark(mark)){
                    totalMarks += mark;
                    ++subjectNumber;
                }
                else {
                    System.out.println("Invalid mark");
                }

            }catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Invalid mark");
            }
        }

        double studentAverage = calculateStudentAverage(totalMarks,numberOfSubjects);
        char studentGrade = getStudentGradeFromAverage(studentAverage);

        printStudentMarks(totalMarks);
        printStudentAverage(studentAverage);
        printStudentGrade(studentGrade);

    }

    public static int getNumberOfSubjects () {
        Scanner input = new Scanner(System.in);

        int numberOfSubjects = 0;
        boolean isValidInput = false;

        do {
            try {
                numberOfSubjects = input.nextInt();
                isValidInput = true;
            }catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("number of subjects must be an integer");
            }

        }while (!isValidInput);

        return  numberOfSubjects;
    }

    public static boolean isValidMark(double mark) {
        return mark >= 0 && mark <= 100;
    }

    public static  double calculateStudentAverage(double totalMarks, int numberOfSubjects) {
        return totalMarks / numberOfSubjects;
    }

    public static char getStudentGradeFromAverage(double average) {
        char grade;

        if(average > 75) {
            grade = 'A';
        } else if (average > 70) {
            grade = 'B';
        } else if (average > 65) {
            grade = 'C';
        } else if (average > 60) {
            grade = 'D';
        } else if (average >= 50) {
            grade = 'E';
        }
        else {
            grade = 'F';
        }

        return grade;
    }

    public static void printStudentMarks(double marks){
        System.out.printf("Total marks: %s%n",marks);
    }

    public static void printStudentAverage(double average) {
        System.out.printf("Average percentage: %s%n", average);
    }

    public static void printStudentGrade(char grade) {
        System.out.printf("Grade: %s%n", grade);
    }
}



package task2;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter total number of subjects");
        int numberOfSubjects = input.nextInt();

        double totalMarks = 0;
        double mark;

        for (int subjectNumber = 1; subjectNumber <= numberOfSubjects; ) {
            System.out.printf("Enter mark for subject %d out of 100 %n", subjectNumber);

                mark = input.nextDouble();

                if (isValidMark(mark)) {

                    totalMarks += mark;
                    ++subjectNumber;

                } else {
                    System.out.println("Invalid mark");
                }

        }

        double studentAverage = calculateStudentAverage(totalMarks, numberOfSubjects);
        char studentGrade = getStudentGradeFromAverage(studentAverage);

        System.out.printf("Total marks: %s%n", totalMarks);
        System.out.printf("Average percentage: %s%n", studentAverage);
        System.out.printf("Grade: %s%n", studentGrade);

    }


    public static boolean isValidMark(double mark) {
        return mark >= 0 && mark <= 100;
    }

    public static double calculateStudentAverage(double totalMarks, int numberOfSubjects) {
        return totalMarks / numberOfSubjects;
    }

    public static char getStudentGradeFromAverage(double average) {
        char grade;

        if (average > 75) {
            grade = 'A';
        } else if (average > 70) {
            grade = 'B';
        } else if (average > 65) {
            grade = 'C';
        } else if (average > 60) {
            grade = 'D';
        } else if (average >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        return grade;
    }
}
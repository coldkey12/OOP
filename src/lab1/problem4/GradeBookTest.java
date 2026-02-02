package lab1.problem4;

import lab1.problem2.GenderEnum;
import lab1.problem2.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GradeBook gradeBook = new GradeBook();
        List<Student> students = new ArrayList<>();
        List<Grade> grades = new ArrayList<>();
        Course course = new Course("CS101", "OOP", 3, new ArrayList<>());

        students.add(new Student("A", GenderEnum.MALE));
        students.add(new Student("B", GenderEnum.MALE));
        students.add(new Student("C", GenderEnum.FEMALE));
        students.add(new Student("D", GenderEnum.FEMALE));
        students.add(new Student("E", GenderEnum.FEMALE));
        students.add(new Student("F", GenderEnum.FEMALE));
        students.add(new Student("G", GenderEnum.FEMALE));
        students.add(new Student("H", GenderEnum.FEMALE));
        students.add(new Student("I", GenderEnum.FEMALE));
        students.add(new Student("J", GenderEnum.FEMALE));

        System.out.println("Welcome to the grade book for " + course.getName() + " " + course.getDescription());
        System.out.println();

        for (int i = 0; i < students.size(); i++) {
            System.out.print("Student " + students.get(i).getName() + ":");
            Grade grade = new Grade(students.get(i), course, input.nextDouble());
            grades.add(grade);
        }

        gradeBook.setCourse(course);
        gradeBook.setStudents(students);
        gradeBook.setGrades(grades);

        gradeBook.displayGradeReport();
    }

}

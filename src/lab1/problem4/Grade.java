package lab1.problem4;

import lab1.problem2.Student;

public class Grade {
    private Student student;
    private Course course;
    private Double score;

    public Grade(Student student, Course course, Double score) {
        this.student = student;
        this.course = course;
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Grade() {
    }
}

package lab1.problem4;

import lab1.problem2.Student;

import java.util.List;

public class GradeBook {
    private Course course;
    private List<Student> students;
    private List<Grade> grades;

    public void displayMessage() {
        System.out.println("Welcome to the grade book instructor.");
    }

    public void displayGradeReport() {
        Grade worstGrade = determineWorst();
        Grade bestGrade = determineBest();

        System.out.println(
                        "\nClass average: " + determineClassAvg() +
                        ". Lowest grade is " + worstGrade.getScore() + " (Student " + worstGrade.getStudent().getName() + ", id:" + worstGrade.getStudent().getId() + ")" +
                        "\nHighest grade is " + bestGrade.getScore() + " (Student " + bestGrade.getStudent().getName() + ", id:" + bestGrade.getStudent().getId() + ")" +
                        "\n" + outputBarChart()
        );
    }

    public String outputBarChart() {
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int ten = 0;
        int eleven = 0;

        for (Grade grade : grades) {
            if (grade.getScore() > 99.0) {
                one++;
            } else if (grade.getScore() < 100.0 && grade.getScore() >= 90.0) {
                two++;
            } else if (grade.getScore() < 90.0 && grade.getScore() >= 80.0) {
                three++;
            } else if (grade.getScore() < 80.0 && grade.getScore() >= 70.0) {
                four++;
            } else if (grade.getScore() < 70.0 && grade.getScore() >= 60.0) {
                five++;
            } else if (grade.getScore() < 60.0 && grade.getScore() >= 50.0) {
                six++;
            } else if (grade.getScore() < 50.0 && grade.getScore() >= 40.0) {
                seven++;
            } else if (grade.getScore() < 40.0 && grade.getScore() >= 30.0) {
                eight++;
            } else if (grade.getScore() < 30.0 && grade.getScore() >= 20.0) {
                nine++;
            } else if (grade.getScore() < 20.0 && grade.getScore() >= 10.0) {
                ten++;
            } else {
                eleven++;
            }
        }

        return "Grade distribution:\n" +
                "00-09: " + "*".repeat(eleven) + "\n" +
                "10-19: " + "*".repeat(ten) + "\n" +
                "20-29: " + "*".repeat(nine) + "\n" +
                "30-39: " + "*".repeat(eight) + "\n" +
                "40-49: " + "*".repeat(seven) + "\n" +
                "50-59: " + "*".repeat(six) + "\n" +
                "60-69: " + "*".repeat(five) + "\n" +
                "70-79: " + "*".repeat(four) + "\n" +
                "80-89: " + "*".repeat(three) + "\n" +
                "90-99: " + "*".repeat(two) + "\n" +
                "100 : " + "*".repeat(one);
    }

    public double determineClassAvg() {
        double avg = 0;
        for (Grade grade : grades) {
            avg += grade.getScore();
        }
        return avg / grades.size();
    }

    public Grade determineWorst() {
        Grade worstGrade = null;
        double min = 101;
        for (Grade grade : grades) {
            if (grade.getScore() < min) {
                min = grade.getScore();
                worstGrade = grade;
            }
        }
        return worstGrade;
    }

    public Grade determineBest() {
        Grade bestGrade = null;
        double max = 0;
        for (Grade grade : grades) {
            if (grade.getScore() > max) {
                max = grade.getScore();
                bestGrade = grade;
            }
        }
        return bestGrade;
    }

    public GradeBook(Course course, List<Student> students, List<Grade> grades) {
        this.course = course;
        this.students = students;
        this.grades = grades;
    }

    public GradeBook() {
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}

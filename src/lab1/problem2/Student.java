package lab1.problem2;

public class Student {
    private static Long studentCount;
    private final String university;

    private Long id;
    private String name;
    private GenderEnum gender;

    {
        studentCount = 0L;
        university = "KBTU";
    }

    public Student() {
        studentCount++;
    }

    public Student(String name, GenderEnum gender) {
        this(); // Increment student count
        this.id = studentCount;
        this.name = name;
        this.gender = gender;
    }

    // Overloading
    public void setName(String name) { this.name = name; }

    public void setName(Student student) {
        this.name = student.getName();
    }

    public String getName() {
        return name;
    }

    public Long getId() { return id; }

    public static Long getStudentCount() {
        return studentCount;
    }
}

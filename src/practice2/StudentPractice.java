package practice2;

public class StudentPractice {
    private Long id = (long) Math.random();
    private String name;
    private int yearOfStudy;

    public StudentPractice() {
    }

    public StudentPractice(String name, int yearOfStudy) {
        this.name = name;
        this.yearOfStudy = yearOfStudy;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void incrementYearOfStudy() {
        this.yearOfStudy++;
    }
}

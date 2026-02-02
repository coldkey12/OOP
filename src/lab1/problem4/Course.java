package lab1.problem4;

import java.util.List;

public class Course {
    private String name;
    private String description;
    private Integer numOfCredits;
    private List<Course> prerequisites;

    public Course() {
    }

    public Course(String name, String description, Integer numOfCredits, List<Course> prerequisites) {
        this.name = name;
        this.description = description;
        this.numOfCredits = numOfCredits;
        this.prerequisites = prerequisites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumOfCredits() {
        return numOfCredits;
    }

    public void setNumOfCredits(Integer numOfCredits) {
        this.numOfCredits = numOfCredits;
    }

    public List<Course> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(List<Course> prerequisites) {
        this.prerequisites = prerequisites;
    }
}

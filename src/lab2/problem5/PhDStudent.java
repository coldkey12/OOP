package lab2.problem5;

public class PhDStudent extends Student {
    private String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            System.out.println("Error: PhD students cannot have dogs as pets!");
            return;
        }
        super.assignPet(pet);
    }

    @Override
    public String getOccupation() {
        return "PhD Student - " + getMajor() + ", Research: " + researchTopic;
    }
}

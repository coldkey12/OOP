package lab1.problem5;

import lab1.problem2.GenderEnum;

public class Person {
    private GenderEnum genderEnum;

    public Person(GenderEnum genderEnum) {
        this.genderEnum = genderEnum;
    }

    public Person() {
    }

    public GenderEnum getGenderEnum() {
        return genderEnum;
    }

    public void setGenderEnum(GenderEnum genderEnum) {
        this.genderEnum = genderEnum;
    }

    public String toString() {
        return "Person{" + "genderEnum=" + genderEnum + '}';
    }
}

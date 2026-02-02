package lab1.problem5;

import lab1.problem2.GenderEnum;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> kidnapped = new Vector<>();

    public void kidnap(Person person) {
        kidnapped.add(person);
    }

    public boolean willDragonEatOrNot() {
        int boysToMatch = 0;
        for (Person person : kidnapped) {
            if (person.getGenderEnum() == GenderEnum.MALE) {
                boysToMatch++;
            } else {
                if (boysToMatch > 0) {
                    boysToMatch--;
                } else {
                    return true;
                }
            }
        }
        return boysToMatch != 0;
    }
}

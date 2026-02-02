package lab1.problem5;

import lab1.problem2.GenderEnum;

public class DragonMain {
    public static void main(String[] args) {
        DragonLaunch dragonLaunch = new DragonLaunch();

//        dragonLaunch.kidnap(new Person(GenderEnum.FEMALE));
//        dragonLaunch.kidnap(new Person(GenderEnum.MALE));
//        dragonLaunch.kidnap(new Person(GenderEnum.FEMALE));
//        dragonLaunch.kidnap(new Person(GenderEnum.MALE));

        dragonLaunch.kidnap(new Person(GenderEnum.MALE));
        dragonLaunch.kidnap(new Person(GenderEnum.FEMALE));
        dragonLaunch.kidnap(new Person(GenderEnum.MALE));
        dragonLaunch.kidnap(new Person(GenderEnum.FEMALE));

        System.out.println("Will the dragon eat the people? " + dragonLaunch.willDragonEatOrNot());
    }
}

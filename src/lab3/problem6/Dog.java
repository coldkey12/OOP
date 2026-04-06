package lab3.problem6;

import java.util.ArrayList;

// Dog implements Trainable (custom interface) in addition to what Animal provides.
public class Dog extends Animal implements Trainable {
    private ArrayList<String> tricks;

    public Dog(String name, int age) {
        super(name, age);
        this.tricks = new ArrayList<>();
    }

    @Override
    public String getSound() { return "Woof"; }

    @Override
    public void learnTrick(String trick) {
        tricks.add(trick);
        System.out.println(getName() + " learned: " + trick);
    }

    @Override
    public String[] getTricks() {
        return tricks.toArray(new String[0]);
    }

    @Override
    public void performTrick(String trick) {
        if (tricks.contains(trick)) {
            System.out.println(getName() + " performs: " + trick);
        } else {
            System.out.println(getName() + " doesn't know: " + trick);
        }
    }
}

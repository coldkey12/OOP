package lab3.problem6;

public class Dog extends Animal implements Trainable {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() { return "Woof"; }

    @Override
    public void train(String command) {
        System.out.println(getName() + " learned: " + command);
    }
}

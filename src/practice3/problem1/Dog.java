package practice3.problem1;

public class Dog extends Animal {
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        super(name, "Dog");
        this.breed = breed;
        this.age = age;
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }

    @Override
    public String introduce() {
        String baseIntro = super.introduce();
        return baseIntro + ". I am a " + breed + " breed and I am " + age + " years old.";
    }

    @Override
    public String move() {
        return "I run on four legs. Because I am a dog oh yeah";
    }

    public String fetch() {
        return getName() + "I am fetching the ball!";
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}

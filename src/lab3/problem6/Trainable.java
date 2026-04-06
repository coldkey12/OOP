package lab3.problem6;

// Custom interface: represents anything that can learn tricks/skills.
public interface Trainable {
    void learnTrick(String trick);
    String[] getTricks();
    void performTrick(String trick);
}

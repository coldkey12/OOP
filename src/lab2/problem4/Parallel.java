package lab2.problem4;

public class Parallel extends Circuit {

    private Circuit first;
    private Circuit second;
    private double potentialDifference;

    public Parallel(Circuit first, Circuit second) {
        this.first = first;
        this.second = second;
        this.potentialDifference = 0;
    }

    @Override
    public double getResistance() {
        double R1 = first.getResistance();
        double R2 = second.getResistance();
        return (R1 * R2) / (R1 + R2);
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
        first.applyPotentialDiff(V);
        second.applyPotentialDiff(V);
    }

    @Override
    public String toString() {
        return "Parallel(" + first + " || " + second + ")";
    }
}

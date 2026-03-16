package lab2.problem4;

public class Series extends Circuit {

    private Circuit first;
    private Circuit second;
    private double potentialDifference;

    public Series(Circuit first, Circuit second) {
        this.first = first;
        this.second = second;
        this.potentialDifference = 0;
    }

    @Override
    public double getResistance() {
        return first.getResistance() + second.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
        double totalResistance = getResistance();
        double I = V / totalResistance;
        double V1 = I * first.getResistance();
        double V2 = I * second.getResistance();
        first.applyPotentialDiff(V1);
        second.applyPotentialDiff(V2);
    }

    @Override
    public String toString() {
        return "Series(" + first + " -- " + second + ")";
    }
}

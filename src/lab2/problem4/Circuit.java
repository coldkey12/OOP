package lab2.problem4;

public abstract class Circuit {

    public abstract double getResistance();

    public abstract double getPotentialDiff();

    public abstract void applyPotentialDiff(double V);

    public double getPower() {
        double V = getPotentialDiff();
        double R = getResistance();
        return (V * V) / R;
    }

    public double getCurrent() {
        double V = getPotentialDiff();
        double R = getResistance();
        return V / R;
    }
}

package lab2.problem4;

public class Resistor extends Circuit {

    private double resistance;
    private double potentialDifference;

    public Resistor(double resistance) {
        this.resistance = resistance;
        this.potentialDifference = 0;
    }

    @Override
    public double getResistance() {
        return resistance;
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        this.potentialDifference = V;
    }

    @Override
    public String toString() {
        return "Resistor(R=" + resistance + " ohms, V=" + potentialDifference + " V)";
    }
}

package lab2.problem4;

public class CircuitTest {

    public static void main(String[] args) {
        // Build individual resistors
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        // Combine into sub-circuits
        Circuit f = new Series(a, b);       // a and b in series: 3 + 3 = 6 ohms
        Circuit g = new Parallel(c, d);     // c and d in parallel: (6*3)/(6+3) = 2 ohms
        Circuit h = new Series(g, e);       // g and e in series: 2 + 2 = 4 ohms
        Circuit circuit = new Parallel(h, f); // h and f in parallel: (4*6)/(4+6) = 2.4 ohms

        // Calculate and display total resistance
        double R = circuit.getResistance();
        System.out.println("=== Electrical Circuit System ===");
        System.out.println();
        System.out.println("Circuit structure: " + circuit);
        System.out.println();
        System.out.println("Total resistance: " + R + " ohms");

        // Apply a potential difference of 12V
        double V = 12.0;
        circuit.applyPotentialDiff(V);

        System.out.println();
        System.out.println("Applied potential difference: " + V + " V");
        System.out.println("Total current: " + circuit.getCurrent() + " A");
        System.out.println("Total power: " + circuit.getPower() + " W");

        // Display potential differences across individual resistors
        System.out.println();
        System.out.println("=== Potential Differences Across Components ===");
        System.out.println("Resistor a (3 ohms): V = " + a.getPotentialDiff() + " V, I = " + a.getCurrent() + " A");
        System.out.println("Resistor b (3 ohms): V = " + b.getPotentialDiff() + " V, I = " + b.getCurrent() + " A");
        System.out.println("Resistor c (6 ohms): V = " + c.getPotentialDiff() + " V, I = " + c.getCurrent() + " A");
        System.out.println("Resistor d (3 ohms): V = " + d.getPotentialDiff() + " V, I = " + d.getCurrent() + " A");
        System.out.println("Resistor e (2 ohms): V = " + e.getPotentialDiff() + " V, I = " + e.getCurrent() + " A");

        System.out.println();
        System.out.println("=== Sub-circuit Details ===");
        System.out.println("Series f (a+b): R = " + f.getResistance() + " ohms, V = " + f.getPotentialDiff() + " V, I = " + f.getCurrent() + " A");
        System.out.println("Parallel g (c||d): R = " + g.getResistance() + " ohms, V = " + g.getPotentialDiff() + " V, I = " + g.getCurrent() + " A");
        System.out.println("Series h (g+e): R = " + h.getResistance() + " ohms, V = " + h.getPotentialDiff() + " V, I = " + h.getCurrent() + " A");
        System.out.println("Parallel circuit (h||f): R = " + circuit.getResistance() + " ohms, V = " + circuit.getPotentialDiff() + " V, I = " + circuit.getCurrent() + " A");
    }
}

package lab1.problem1;

public class Data {

    private double avg;
    private double max;
    private int count;

    public Data() {
        avg = 0;
        max = 0;
        count = 0;
    }

    public void add(double value) {
        if (count == 0) {
            avg = value;
            max = value;
        } else {
            avg = (avg * count + value) / (count + 1);
            if (value > max) max = value;
        }
        count++;
    }

    public double getAverage() {
        return count == 0 ? 0 : avg;
    }

    public double getMax() {
        return count == 0 ? 0 : max;
    }
}

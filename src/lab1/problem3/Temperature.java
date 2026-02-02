package lab1.problem3;

public class Temperature {
    private double value;
    private char scale;

    public Temperature() {
        this(0, 'C');
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public Temperature(double value) {
        this(value, 'C');
    }

    public Temperature(char scale) {
        this(0, scale);
    }

    public double getInCelsius() {
        if (scale == 'C') {
            return value;
        } else {
            return (5 * (value - 32)) / 9;
        }
    }

    public double getInFahrenheit() {
        if (scale == 'F') {
            return value;
        } else {
            return (9 * (value/5)) + 32;
        }
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setBoth(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public char getScale() {
        return scale;
    }
}

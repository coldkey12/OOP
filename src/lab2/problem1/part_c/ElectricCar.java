package lab2.problem1.part_c;

import java.util.Objects;

public class ElectricCar extends Vehicle {
    private double batteryCapacity;

    public ElectricCar(String make, int year, double batteryCapacity) {
        super(make, year);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElectricCar that = (ElectricCar) o;
        return Double.compare(that.batteryCapacity, batteryCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryCapacity);
    }

    @Override
    public String toString() {
        return "ElectricCar{make='" + getMake() + "', year=" + getYear()
                + ", batteryCapacity=" + batteryCapacity + " kWh}";
    }
}

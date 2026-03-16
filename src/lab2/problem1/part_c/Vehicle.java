package lab2.problem1.part_c;

import java.util.Objects;

public class Vehicle {
    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return year == vehicle.year && Objects.equals(make, vehicle.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, year);
    }

    @Override
    public String toString() {
        return "Vehicle{make='" + make + "', year=" + year + "}";
    }
}

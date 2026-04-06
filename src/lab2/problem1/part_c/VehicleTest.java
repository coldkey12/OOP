package lab2.problem1.part_c;

import java.util.HashSet;
import java.util.Set;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Toyota", 2020);
        Vehicle v2 = new Vehicle("Toyota", 2020);
        Vehicle v3 = new Vehicle("Honda", 2022);

        ElectricCar ec1 = new ElectricCar("Tesla", 2023, 75.0);
        ElectricCar ec2 = new ElectricCar("Tesla", 2023, 75.0);
        ElectricCar ec3 = new ElectricCar("Tesla", 2023, 100.0);

        System.out.println("=== Testing equals ===");
        System.out.println("v1.equals(v2): " + v1.equals(v2));
        System.out.println("v1.equals(v3): " + v1.equals(v3));
        System.out.println("ec1.equals(ec2): " + ec1.equals(ec2));
        System.out.println("ec1.equals(ec3): " + ec1.equals(ec3));

        System.out.println("\n=== Testing hashCode ===");
        System.out.println("v1.hashCode() == v2.hashCode(): " + (v1.hashCode() == v2.hashCode()));     // true
        System.out.println("ec1.hashCode() == ec2.hashCode(): " + (ec1.hashCode() == ec2.hashCode())); // true

        Set<Vehicle> vehicleSet = new HashSet<>();
        vehicleSet.add(v1);
        vehicleSet.add(v2);
        vehicleSet.add(v3);
        vehicleSet.add(ec1);
        vehicleSet.add(ec2);
        vehicleSet.add(ec3);

        System.out.println("\n=== HashSet Contents (expected 4 unique entries) ===");
        System.out.println("Set size: " + vehicleSet.size());
        for (Vehicle v : vehicleSet) {
            System.out.println("  " + v);
        }
    }
}

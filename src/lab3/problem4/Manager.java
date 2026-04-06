package lab3.problem4;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String nin, double bonus) {
        super(name, salary, hireDate, nin);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public void addEmployee(Employee e) { team.add(e); }
    public Vector<Employee> getTeam() { return team; }
    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    @Override
    public int compareTo(Employee other) {
        int result = super.compareTo(other);
        if (result == 0 && other instanceof Manager) {
            result = Double.compare(this.bonus, ((Manager) other).bonus);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Manager: " + getName() + ", Salary: " + getSalary() + ", Bonus: " + bonus + ", Team size: " + team.size();
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Manager)) return false;
        Manager m = (Manager) o;
        return Double.compare(m.bonus, bonus) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus);
    }

    @Override
    public Manager clone() {
        Manager copy = (Manager) super.clone();
        copy.team = new Vector<>(this.team);
        return copy;
    }
}

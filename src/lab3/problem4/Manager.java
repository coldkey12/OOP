package lab3.problem4;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String nin, double bonus) {
        super(name, salary, hireDate, nin);
        this.team = new Vector<>();
        this.bonus = bonus;
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.team = new Vector<>();
        this.bonus = bonus;
    }

    public Vector<Employee> getTeam() { return team; }

    public void addEmployee(Employee e) { team.add(e); }

    public void removeEmployee(Employee e) { team.remove(e); }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    @Override
    public int compareTo(Employee other) {
        int salaryCompare = super.compareTo(other);
        if (salaryCompare != 0) return salaryCompare;
        if (other instanceof Manager) {
            return Double.compare(this.bonus, ((Manager) other).bonus);
        }
        return 0;
    }

    @Override
    public Manager clone() {
        Manager copy = (Manager) super.clone();
        copy.team = new Vector<>();
        for (Employee e : this.team) {
            copy.team.add(e.clone());
        }
        return copy;
    }

    @Override
    public String toString() {
        return "Manager{name='" + getName() + "', salary=" + getSalary() +
               ", bonus=" + bonus + ", teamSize=" + team.size() + "}";
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
}

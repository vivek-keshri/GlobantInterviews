package varsions.java8;

import lombok.Data;

import java.util.Objects;

@Data
public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salery) {
        this.id = id;
        this.name = name;
        this.salary = salery;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(employee.salary, salary) == 0 && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }
}

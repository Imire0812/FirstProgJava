package hw41.addition;

import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee (String name, double salary, String department){
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(department, employee.department);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, salary, department);
    }
}

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    Department department;

    Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Department that = (Department) obj;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {
        Department hr = new Department("HR");
        Department it = new Department("IT");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", hr));
        employees.add(new Employee("Bob", it));
        employees.add(new Employee("Carol", hr));

        Map<Department, List<Employee>> groupedByDepartment = groupEmployeesByDepartment(employees);

        groupedByDepartment.forEach((department, employeeList) -> 
            System.out.println(department + ": " + employeeList));
    }

    public static Map<Department, List<Employee>> groupEmployeesByDepartment(List<Employee> employees) {
        return employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));
    }
}

import java.util.*;

public class VecTor {
    public static void main(String[] args) {
        // Create a Vector of Employee objects
        Vector<Employee> employees = new Vector<>();

        // Add Employee objects to the Vector
        employees.add(new Employee(1, "Alice", 50000));
        employees.add(new Employee(2, "Bob", 60000));
        employees.add(new Employee(3, "Charlie", 40000));

        // Sort the Vector by salary in ascending order
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.esal, e2.esal);  // Compare using esal
            }
        });

        // Print the sorted list
        for (Employee emp : employees) {
            emp.printEmpDetails();  // Print details using your method
        }
    }
}

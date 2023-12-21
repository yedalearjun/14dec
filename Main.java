class Employee {
    private String name;
    private int employeeId;

    // Constructor
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

// Main class
public class Main {
    // Swap method to interchange information of two employees
    public static void swap(Employee emp1, Employee emp2) {
        // Temporarily store the information of emp1
        String tempName = emp1.getName();
        int tempEmployeeId = emp1.getEmployeeId();

        // Copy information from emp2 to emp1
        emp1.setName(emp2.getName());
        emp1.setEmployeeId(emp2.getEmployeeId());

        // Copy information from temp to emp2
        emp2.setName(tempName);
        emp2.setEmployeeId(tempEmployeeId);
    }

    public static void main(String[] args) {
        // Create two employee objects
        Employee employee1 = new Employee("John Doe", 101);
        Employee employee2 = new Employee("Jane Smith", 102);

        // Display original information
        System.out.println("Original Information:");
        System.out.println("Employee 1:");
        employee1.displayInfo();
        System.out.println("Employee 2:");
        employee2.displayInfo();

        // Swap the information
        swap(employee1, employee2);

        // Display swapped information
        System.out.println("\nAfter Swapping:");
        System.out.println("Employee 1:");
        employee1.displayInfo();
        System.out.println("Employee 2:");
        employee2.displayInfo();
    }
}
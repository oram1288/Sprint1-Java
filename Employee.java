package Sprint1_Java;

public class Employee extends Patron {
    private String employeeID;
    private String department;

    public Employee(String name, String address, String phoneNumber, String employeeID, String department) {
        super(name, address, phoneNumber);
        this.employeeID = employeeID;
        this.department = department;
    }

    // Getters
    public String getEmployeeID() {
        return employeeID;
    }

    public String getDepartment() {
        return department;
    }

    // Setters
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                ", employeeID='" + this.employeeID + '\'' +
                ", department='" + this.department + '\'' +
                '}';
    }
}

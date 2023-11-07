package tema7.Person;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("John", "Doe", 12345, "Software Engineer");

        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Full Name: " + employee.getFirstName() + " " + employee.getLastName());
    }
}

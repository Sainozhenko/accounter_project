package accounter_project;

public abstract class Employee {

    // Define the globally minimum salary
    protected double minSalary = 1200.00;
    protected String firstName;
    protected String lastName;

    abstract double calculateSalary();
    public abstract String getPosition();

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



}

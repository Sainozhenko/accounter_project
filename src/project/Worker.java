package project;
//public class Worker extends Employee {
//
//    private static double salaryPerHour = 14.50;
//    protected double hoursWorked;
//    protected double minSalary = 1200.00;
//
//    public Worker(String firstName, String lastName, double hoursWorked) {
//        super(firstName, lastName);
//        this.hoursWorked = hoursWorked;
//    }
//
//    public double getHoursWorked() {
//        return hoursWorked;
//    }
//
//    @Override
//    public double calculateSalary() {
//        double salary = salaryPerHour * hoursWorked;
//
//        if (hoursWorked < 160.00) {
//            return salary;
//        }
//
//        if (salary < minSalary) {
//            return minSalary;
//        }
//
//        return salary;
//    }
//
//    @Override
//    public String getPosition() {
//        return "Worker";
//    }
//}
public class Worker extends Employee {

    private double salaryPerHour = 14.50;
    protected double hoursWorked;
    private double minSalary = 1200.00;

    public Worker(String firstName, String lastName, double hoursWorked) {
        super(firstName, lastName);
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double calculateSalary() {
        double salary = salaryPerHour * hoursWorked;

        if (hoursWorked < 160.00) {
            return salary;
        }

        if (salary < minSalary) {
            return minSalary;
        }

        return salary;
    }

    @Override
    public String getPosition() {
        return "Worker";
    }
}

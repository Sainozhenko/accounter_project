package project;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Company company = new Company(employeeList);

        company.addEmployee(new Worker("Jode", "Smith", 20));
        company.addEmployee(new Worker("Jones", "Smith", 190));
        company.addEmployee(new Worker("Jamie", "Smith", 180.25));
        company.addEmployee(new SalesManager("John", "Smith", 20));
        company.addEmployee(new SalesManager("Jane", "Smith", 32));
        company.addEmployee(new Worker("Jones", "Smith", 190));
        company.addEmployee(new Worker("Jamie", "Smith", 180));
        company.addEmployee(new SalesManager("John", "Smith", 20));
        company.addEmployee(new SalesManager("Jane", "Smith", 32));
        company.displayEmployees();
        System.out.println("Total salary: " + company.calculateTotalSalary());
        System.out.println("Removing James Smith");
        company.removeEmployee(employeeList.get(0));
        System.out.println("Removing Jode Smith");
        company.removeEmployee(employeeList.get(0));
        System.out.println("Removing Jane Smith");
        // company.removeEmployee(employeeList.get(employeeList.size() - 1));

    }
}

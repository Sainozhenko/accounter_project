package new_project;

import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();

        company.addEmployee(new Worker("James", "Smith", 100));
        company.addEmployee(new Worker("Jode", "Smith", 20));
        company.addEmployee(new Worker("Jones", "Smith", 190));
        company.addEmployee(new Worker("Jamie", "Smith", 180.25));
        company.addEmployee(new SaleManager("John", "Smith", 20));
        company.addEmployee(new SaleManager("Jane", "Smith", 32));

        company.displayEmployees();
        System.out.println("Total salary: " + company.calculateTotalSalary());

        System.out.println("Removing James Smith");
        company.removeEmployee(company.employeeList.get(0));
        System.out.println("Removing Jode Smith");
        company.removeEmployee(company.employeeList.get(0));
        System.out.println("Removing Jane Smith");
        company.removeEmployee(company.employeeList.get(company.employeeList.size() - 1));

        company.displayEmployees();
        System.out.println("Total salary: " + company.calculateTotalSalary());
    }
}

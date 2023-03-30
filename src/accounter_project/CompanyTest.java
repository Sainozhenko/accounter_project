package accounter_project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompanyTest {

    @Test
    void test_calculate_totalSalary() {
        Company company = new Company();
        company.addEmployee(new Worker("Johanna", "Cameron", 150));
        company.addEmployee(new SaleManager("John", "John", 11));
        assertEquals(4375, company.calculateTotalSalary());
    }

    @Test
    void test_addEmployee_false() {
        Company company = new Company();
        company.addEmployee(new SaleManager("John", "John", 11));
        company.addEmployee(new SaleManager("John", "John", 11));
        company.addEmployee(new SaleManager("John", "John", 11));
        company.addEmployee(new SaleManager("John", "John", 11));
        company.addEmployee(new SaleManager("John", "John", 11));
        company.addEmployee(new SaleManager("John", "John", 11));
        company.addEmployee(new SaleManager("John", "John", 11));
        company.addEmployee(new SaleManager("John", "John", 11));
        boolean add = company.addEmployee(new SaleManager("John", "John", 11));
        assertFalse(add);
    }

    @Test
    void test_addEmployee_true() {
        Company company = new Company();
        boolean add = company.addEmployee(new SaleManager("John", "John", 11));
        assertTrue(add);
    }

    @Test
    void test_removeEmployee_true() {
        Company company = new Company();
        SaleManager employee = new SaleManager("John", "John", 11);
        boolean add = company.addEmployee(employee);
        boolean remove = company.removeEmployee(employee);
        assertTrue(remove);
    }


    @Test
    void test_removeEmployee_false() {
        Company company = new Company();
        SaleManager employee = new SaleManager("John", "John", 11);
        SaleManager employee1 = new SaleManager("John", "Marok", 11);
        boolean add = company.addEmployee(employee);
        boolean remove = company.removeEmployee(employee1);
        assertFalse(remove);
    }

    @Test
    void test_displayRuns() {
        Company company = new Company();
        SaleManager employee = new SaleManager("John", "Johnson", 11);
        boolean add = company.addEmployee(employee);
        company.displayEmployees();
    }

}

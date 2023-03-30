package project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CompanyTest {


    @Test
    @DisplayName("First testing")
    void test_calculate_total_salary() {
        List<Employee> employeeList = Arrays.asList(new Worker("John", "Cameron", 20),
                new SalesManager("Jarik", "John", 11));
        Company company = new Company(employeeList);
        assertEquals(2490, company.calculateTotalSalary());

    }

    @Test
    @DisplayName("Second testing")
    void test_calculate_total_salary_with_zero() {
        List<Employee> employeeList = Arrays.asList(new Worker("John", "Cameron", 0),
                new SalesManager("Jarik", "John", 0));
        Company company = new Company(employeeList);
        assertEquals(1200, company.calculateTotalSalary());
    }

    @Test
    @DisplayName("Third testing")
    void test_calculate_total_salary_with_max_values() {
        List<Employee> actual = Arrays.asList(new Worker("John", "Cameron", 240),
                new SalesManager("Jarik", "John", 77));
        Company company = new Company(actual);
        assertEquals(18880, company.calculateTotalSalary());
    }

}
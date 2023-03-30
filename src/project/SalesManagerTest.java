package project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesManagerTest {

    SalesManager sl = new SalesManager("James", "Smith", 20);
    @Test
    @DisplayName("First testing")
    void test_calculate_salary_sample() {
        sl = new SalesManager("James", "Smith", 20);
        assertEquals(4000, sl.calculateSalary());
    }
    @Test
    @DisplayName("Second testing")
    void test_calculate_salesVolume_zero() {
        sl = new SalesManager("James", "Smith", 0);
        assertEquals(1200, sl.calculateSalary());
    }

}
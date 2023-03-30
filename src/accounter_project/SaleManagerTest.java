package accounter_project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SaleManagerTest {

    @Test
    void test_calculateSalary_normal() {
        SaleManager sl = new SaleManager("James", "Smith", 20);
        assertEquals(4000, sl.calculateSalary());
    }

    @Test
    void test_calculateSalary_minSalary() {
        SaleManager sl = new SaleManager("James", "Smith", 0);
        assertEquals(1200, sl.calculateSalary());
    }

}

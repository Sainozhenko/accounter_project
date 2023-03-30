package accounter_project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkerTest {

    @Test
    void test_calculateSalary_minSalary() {
        Worker worker = new Worker("James", "Smith", 20);
        assertEquals(290, worker.calculateSalary());
    }

    @Test
    void test_calculateSalary_normal() {
        Worker worker = new Worker("James", "Smith", 180);
        assertEquals(2610, worker.calculateSalary());
    }

}


package project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {
    Worker worker = new Worker("James", "Smith", 100);


        @Test
        @DisplayName("First testing")
        void test_calculate_salary() {
            worker = new Worker("James", "Smith", 20);
            assertEquals(290, worker.calculateSalary());
        }
    @Test
    @DisplayName("Second test method calculateSalary")
    void test_calculate_salary1() {
        worker = new Worker("James", "Smith", 170);
        assertEquals(2465, worker.calculateSalary());
    }


}
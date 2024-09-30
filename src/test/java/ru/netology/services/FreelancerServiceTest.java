package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FreelancerServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/fst.csv")
    public void testCalculateMonthsOfRest(int income, int expenses, int threshold, int expectedMonths) {
        FreelancerService service = new FreelancerService();
        int actualMonths = service.calculate(income, expenses, threshold);
        assertEquals(expectedMonths, actualMonths);
    }
}
//    @Test
//    void testCalculateMonthsOfRestExample1() {
//        FreelancerService service = new FreelancerService();
//        int result = service.calculate(10000, 3000, 20000);
//        assertEquals(4, result); // Ожидаем 4 месяца отдыха
//    }
//
//    @Test
//     void testCalculateMonthsOfRestExample2() {
//        FreelancerService service = new FreelancerService();
//        int result = service.calculate(100000, 60000, 150000);
//        assertEquals(3, result); // Ожидаем 3 месяца отдыха
//    }


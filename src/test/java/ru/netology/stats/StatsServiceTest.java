package ru.netology.stats;

import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};   // Набор данных о продажах  по месяцам
    StatsService service = new StatsService();

    @Test
    void shouldCalculateSumAllSales() {
        int expected = 180;
        int actual = service.sumAllSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSales() {
        int expected = 15;
        int actual = service.averageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSalesMonth() {
        int expected = 8;
        int actual = service.maximumSalesAmount(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinSalesMonth() {
        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsBelowAverageSales() {
        int expected = 5;
        int actual = service.monthsBelowAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsAboveAverageSales() {
        int expected = 5;
        int actual = service.monthsAboveAverageSales(sales);
        assertEquals(expected, actual);
    }

}
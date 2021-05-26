package ru.netology.stats;

import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSumAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};   // Набор данных о продажах  по месяцам
        int expected = 180;
        int actual = service.sumAllSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};   // Набор данных о продажах  по месяцам
        int expected = 15;
        int actual = service.averageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMaxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};   // Набор данных о продажах  по месяцам
        int expected = 8;
        int actual = service.maximumSalesAmount(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMinSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};   // Набор данных о продажах  по месяцам
        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsBelowAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};   // Набор данных о продажах  по месяцам
        int expected = 5;
        int actual = service.monthsBelowAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsAboveAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};   // Набор данных о продажах  по месяцам
        int expected = 5;
        int actual = service.monthsAboveAverageSales(sales);
        assertEquals(expected, actual);
    }

}
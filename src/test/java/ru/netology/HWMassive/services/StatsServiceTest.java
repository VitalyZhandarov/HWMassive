package ru.netology.HWMassive.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindMinMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMaxMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindTotalSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.totalSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageValueSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverage = 15;
        int actualAverage = service.averageValueSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindAmountMonthMinAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmount = 5;
        int actualAmount = service.amountMonthMinAverageSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void shouldFindAmountMonthMaxAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmount = 5;
        int actualAmount = service.amountMonthMinAverageSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }
}

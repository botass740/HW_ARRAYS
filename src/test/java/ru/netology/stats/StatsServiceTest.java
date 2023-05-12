package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldSum() {
        StatsService service = new StatsService();

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedSum = 180;
        int actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldAverageSalesAmount() {
        StatsService service = new StatsService();
        int[] sum = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedAverage = 15;
        int actualAverage = service.averageSalesAmount(sum);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldMaxSales() {
        StatsService service = new StatsService();
        int[] sum = { 8, 15, 13, 25, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedMaxMonth = 4;
        int actualMaxMonth = service.getMaxSales(sum);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }
    @Test
    public void shouldMinSales() {
        StatsService service = new StatsService();
        int[] sum = { 8, 15, 13, 25, 17, 20, 19, 20, 7, 14, 14, 18 };
        int expectedMinMonth = 9;
        int actualMinMonth = service.getMinSales(sum);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] sum = {8, 15, 13, 25, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowAverage = 5;
        int actualBelowAverage = service.getBelowAverage(sum);

        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }

    @Test
    public void shouldSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] sum = {8, 15, 13, 25, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveAverage = 6;
        int actualAboveAverage = service.getAboveAverage(sum);

        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);
    }
}
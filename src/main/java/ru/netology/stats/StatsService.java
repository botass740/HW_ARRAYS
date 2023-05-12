package ru.netology.stats;

public class StatsService {
    public int sumSales(int[] sales) {      // 1. Сумма всех продаж.
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSalesAmount(int[] average) {      // 2. Средняя сумма продаж в месяц
        int sum = sumSales(average);
        return sum / average.length;
    }

    public int getMaxSales(int[] sales) {       // 3. Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinSales(int[] sales) {       // 4. Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getBelowAverage(int[] sales) {       // 5. количество месяцев, в которых продажи были ниже среднего
        int belowAverage = averageSalesAmount(sales);
        int month = 0;
        for (int i : sales) {
            if (i < belowAverage) {
                month = month + 1;
            }
        }
        return month;
    }

    public int getAboveAverage(int[] sales) {       // 6. количество месяцев, в которых продажи были выше среднего
        int aboveAverage = averageSalesAmount(sales);
        int month = 0;
        for (int i : sales) {
            if (i > aboveAverage) {
                month = month + 1;
            }
        }
        return month;
    }
}
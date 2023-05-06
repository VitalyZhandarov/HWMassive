package ru.netology.HWMassive.services;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int totalSales(long[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int averageValueSales(long[] sales) {
        int sum = totalSales(sales);
        int average = 0;
        average = sum / sales.length;

        return average;
    }

    public int amountMonthMinAverageSales(long[] sales) {
        int average = averageValueSales(sales);
        int amount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                amount += 1;
            }
        }
        return amount;
    }

    public int amountMonthMaxAverageSales(long[] sales) {
        int average = averageValueSales(sales);
        int amount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                amount += 1;
            }
        }
        return amount;
    }
}

package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            // аналог sum = sum + purchase;
            sum += sale;
        }
        return sum;
    }

    public long findAverageSum(long[] sales) {
        long sum = calculateSum(sales);
        long averageSum = sum / sales.length;
        return averageSum;
    }

    public long findIndexOfMaxMonth(long[] sales) {

        long currentMaxIndex = 0;
        long currentMax = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (currentMax <= sales[i]) {
                currentMax = sales[i];
                currentMaxIndex = i + 1;
            }
        }
        return currentMaxIndex;
    }

    public long findIndexOfMinMonth(long[] sales) {

        long currentMinIndex = 0;
        long currentMin = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (currentMin >= sales[i]) {
                currentMin = sales[i];
                currentMinIndex = i + 1;
            }
        }
        return currentMinIndex;
    }

    public long countMonthsUnderAverage(long[] sales) {
        long averageSum = findAverageSum(sales);

        long monthsUnderAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum) {
                monthsUnderAverage++;
            }
        }
        return monthsUnderAverage;
    }

    public long countMonthsAboveAverage(long[] sales) {
        long averageSum = findAverageSum(sales);

        long monthsAboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum) {
                monthsAboveAverage++;
            }
        }
        return monthsAboveAverage;
    }
}
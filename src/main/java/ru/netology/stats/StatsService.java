package ru.netology.stats;

public class StatsService {
    public int sumAllSales(int[] sales) {    //Сумму всех продаж
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSales(int[] sales) {   //Среднюю сумму продаж в месяц
        int averageSales = sumAllSales(sales) / sales.length;
        return averageSales;

    }

    public int maximumSalesAmount(int[] sales) {  //Номер месяца, в котором был пик продаж
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {  //Номер месяца, в котором был минимум продаж
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthsBelowAverageSales(int[] sales) {  //Кол-во месяцев, в которых продажи были ниже среднего
        int belowAvgMonth = 0;
        int month = 0;
        int averageSales = sumAllSales(sales) / sales.length;
        for (int sale : sales) {
            if (sale < averageSales) {
                belowAvgMonth += 1;
            }
            month = month + 1;
        }
        return belowAvgMonth;
    }

    public int monthsAboveAverageSales(int[] sales) {   //Кол-во месяцев, в которых продажи были выше среднего
        int aboveAvgMonth = 0;
        int month = 0;
        int averageSales = sumAllSales(sales) / sales.length;
        for (int sale : sales) {
            if (sale > averageSales) {
                aboveAvgMonth += 1;
            }
            month = month + 1;
        }
        return aboveAvgMonth;
    }
}

package ru.netology.sqr.work6_1.services;

public class SQRService {

    public int calcQuantitiesSquaresInRangeNumbers(int startInterval, int theEndInterval) {
        int result = 0;
        for (int i = 10; i < 99; i++) {
            if (i * i >= startInterval && i * i <= theEndInterval) {
                result++;
            }
        }
        return result;
    }

}

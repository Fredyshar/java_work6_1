package ru.netology.sqr.work6_1.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/ranges.csv")
    public void correctResult(int expected, int startInterval, int theEndInterval) {
        SQRService service = new SQRService();
        //int expected = 3;
        int actual = service.calcQuantitiesSquaresInRangeNumbers(startInterval, theEndInterval);

        Assertions.assertEquals(expected, actual);
    }
}

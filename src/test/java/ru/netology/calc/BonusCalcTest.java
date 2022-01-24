package ru.netology.calc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class BonusCalcTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", delimiter = '|')
    void shouldCalculate(long expected, long amount, boolean registered) {

        assertEquals(expected, BonusCalc.calculate(amount, registered));
    }
}
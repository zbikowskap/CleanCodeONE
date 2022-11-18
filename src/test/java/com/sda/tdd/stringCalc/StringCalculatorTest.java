package com.sda.tdd.stringCalc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

/**
 * Testy w stylu TDD - Test Driven Development
 * 1. Red - napisz test do kodu który jeszcze nie powstał
 * 2. Green - napisz kod który spowoduje że test przejdzie
 * 3. Refactor - sprawdź możliwość refactoru / optymalizacji kodu
 */

class StringCalculatorTest {

    StringCalculator stringCalculator;

    @BeforeEach
    public void setup() {
        stringCalculator = new StringCalculator();
    }

    /**
     * Test 1 - dla pustego stringa zwracamy 0
     */
    @Test
    public void testEmptyStringReturnsZero() {
        //given
        String check = "";

        //when
        int result = stringCalculator.add(check);

        //then
        //asercja JUNIT
        assertEquals(0, result, "Expected 0 was not provided by test result");

        //asercje AssertJ
        assertThat(result)
                .as("Expected 0 when empty string passed")
                .isEqualTo(0);

        assertThat(result)
                .as("Expected 0 when empty string passed")
                .isLessThan(5)
                .isGreaterThan(-3)
                .isNotEqualTo(1);
    }

    /**
     * Test 2 - dla pojedynczej wpisanej cyfry zwracamy ją
     */
    @Test
    public void testOneNumberPassedGetsReturned() {
        //given
        String oneNumber = "4";

        //when
        int result = stringCalculator.add(oneNumber);

        //then
        assertThat(result)
                .as("Should return 4 when passed 4")
                .isEqualTo(4);
    }

    /**
     * Test 3 - przekazanie 2 liczb przedzielonych przecinkiem powoduje zwrócenie ich sumy
     * czyli 3,4 -> 7
     */
    @Test
    public void testReturnsSumOfTwoPassedNumbers() {
        //given
        String params = "3,4";

        //when
        int result = stringCalculator.add(params);

        //then
        assertThat(result)
                .as("Expected 7 but that was not provided")
                .isEqualTo(7);
    }

    /**
     * Test 4 - przekazanie kilku stringów przedzielonych przecinkami ma zwrócić ich sumę
     * 3,4,5,6 -> 18
     */
    @Test
    public void testReturnsSumOfAllPassedNumbers() {
        //given
        String params = "3,4,5,6";

        //when
        int result = stringCalculator.add(params);

        //then
        assertThat(result)
                .as("Expected 18 but that was not provided")
                .isEqualTo(18);
    }

    /**
     * Test 5 - String może być wieloliniowy, czyli między liczbami mogą występować przecinki
     * lub znaki nowej linii
     * 3,4\n5,6 -> 18
     */
    @Test
    public void testReturnsSumOfAllPassedNumbersFromAllLines() {
        //given
        String params = "3,4\n5,6";

        //when
        int result = stringCalculator.add(params);

        //then
        assertThat(result)
                .as("Expected 18 but that was not provided")
                .isEqualTo(18);
    }
}
package com.sda.tdd.stringCalc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Klasa będzie mieć jedną metodę: add przyjmującą String, zwracającą int
 * W kolejnych iteracjach będziemy rozszerzać możliwości metody, po uprzednim
 * dodaniu kolejnych metod testowych
 */

public class StringCalculator {

    public int add(String values) {
        if(values.isEmpty()) {
            return 0;
        }

        if(values.length() == 1) {
            return Integer.parseInt(values);
        }

        String[] linesSplit = values.split("\n");

        List<String> valuesSplit = Arrays.stream(linesSplit)
                .map(each -> each.split(","))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        return valuesSplit.stream()
                .map(Integer::valueOf)
                .reduce(0, Integer::sum);
    }
}

package com.codurance.string_calculator;

public class StringCalculator {

    public int add(String s) {
        if (s.isEmpty()) return 0;

        String[] numbers = s.split(",");
        int sum = 0;
        for (String n : numbers) {
            sum += Integer.parseInt(n);
        }
        return sum;
    }
}

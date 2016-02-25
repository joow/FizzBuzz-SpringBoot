package org.fizzbuzz;

import org.springframework.stereotype.Component;

@Component
public class FizzBuzz {
    public String toFizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }

        if (n % 3 == 0) {
            return "Fizz";
        }

        if (n % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(n);
    }
}

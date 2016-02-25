package org.fizzbuzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan
public class FizzBuzzController {
    private final FizzBuzz fizzBuzz;

    public static void main(String[] args) {
        SpringApplication.run(FizzBuzzController.class, args);
    }

    @Autowired
    public FizzBuzzController(FizzBuzz fizzBuzz) {
        this.fizzBuzz = fizzBuzz;
    }

    @RequestMapping("/{number}")
    public String fizzBuzz(@PathVariable("number") int number) {
        return fizzBuzz.toFizzBuzz(number);
    }
}

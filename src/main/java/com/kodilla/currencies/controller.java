package com.kodilla.currencies;

import com.kodilla.currencies.calculate.Calculator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/currencies")
@RequiredArgsConstructor
@Slf4j
public class controller {

    private final Calculator calculator;

    @GetMapping("/euro/{amount}")
    public ResponseEntity<Double> eurToPln(@RequestParam double amount){
        return ResponseEntity.ok(calculator.eurToPln(amount));
    }

}

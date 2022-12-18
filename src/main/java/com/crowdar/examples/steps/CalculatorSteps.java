package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CalculatorService;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps extends PageSteps {

    @When("Seven Plus Eight")
    public void plus() {
    	CalculatorService.plus();
    }
    
    @Then("Result is Fifteen")
    public void result() {
    	CalculatorService.result();
    }

    @Given("Calculator is open")
    public void calculatorIsOpen() {
        CalculatorService.openAppAndDriver();
    }
}
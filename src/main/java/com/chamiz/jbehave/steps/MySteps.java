package com.chamiz.jbehave.steps;

/**
 * Chamila Ambahera
 * 25/8/16
 * chamila.ambahera@gmail.com
 * JBehave Sample
 */

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class MySteps {
    int result = 0;

    @Given("As a user")
    public void myFirstGivenStep(){
        System.out.println("This is your first given step");
    }

    @When("I will add $number1 and $number2")
    public void myFirstWhenStep(String number1, String number2) {
        System.out.println("Number 1 -->" + number1);
        System.out.println("Number 2 -->" + number2);
        result = Integer.parseInt(number1) + Integer.parseInt(number2);
    }

    @Then("Results should be $result")
    public void myFirstThenStep(String expectedResult) {
        Assert.assertEquals("Error", Integer.valueOf(expectedResult), Integer.valueOf(result));
        System.out.println("Results validated");
    }

    
}

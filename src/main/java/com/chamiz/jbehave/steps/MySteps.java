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

public class MySteps {

    @Given("I am your first step")
    public void myFirstGivenStep(){
        System.out.println("This is your first given step");
    }

    @When("I will learn JBehave")
    public void myFirstWhenStep(){
        System.out.println("This is your first when step");
    }

    @Then("I shall be happy")
    public void myFirstThenStep(){
        System.out.println("This is your first then step");
    }

    
}

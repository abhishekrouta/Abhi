package Cucumber.dta_driven;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {
	
	
	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
	  
		System.out.println(" Steps");
		}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1)
	{
	System.out.println("data");  
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
		
		System.out.println("its done");
	    
	}
	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
	    
		System.out.println(" Step2");
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
	   
		
		System.out.println("its Fail");
	}
	@Given("I want to write a step with name3")
	public void i_want_to_write_a_step_with_name3() {
		System.out.println(" Step-3");
	  
	}

	@Then("I verify the dont know in step")
	public void i_verify_the_dont_know_in_step() {
		System.out.println("don't know");
	}
}

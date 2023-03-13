package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test1
{
	int a,b, sum;
	
	@Given("Read A and B values")
	public void read_a_and_b_values() {
	   a=20;
	   b=30;
	}
	@When("calculate sum of A and B")
	public void calculate_sum_of_a_and_b() {
	   sum=a+b;
	}
	@Then("Display the results")
	public void display_the_results() 
	{
	System.out.println(sum);   
	}

	
	
}

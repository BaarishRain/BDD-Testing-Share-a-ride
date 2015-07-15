package com.test;

import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RideSteps extends TestCase {

	Ride ride = new Ride();
	
	@Given("^user enters \"([^\"]*)\" as source  and \"([^\"]*)\" as destination$")
	public void user_enters_as_source_and_as_destination(String src, String dest) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		ride.setSrc(src);
		ride.setDest(dest);
	}

	@When("^click search$")
	public void click_search() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		
	}

	@Then("^user should get \"([^\"]*)\" message$")
	public void user_should_get_message(String msg) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		RideBLL rideBLL = new RideBLL();
		String message = rideBLL.validate(ride);
		assertEquals(msg, message);
	}
}

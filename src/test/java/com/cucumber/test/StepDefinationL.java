package com.cucumber.test;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.drivermanager.DriverManager;
import com.selenium.pagefactory.SeleniumPageFactory;
import com.util.Constants;
import com.util.HighLighter;
import com.util.ScreenShot;
import com.util.SeleniumWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationL {
	WebDriver driver;
	SeleniumPageFactory pf;
	
	
	@Given("Open the Browser")
	public void open_the_Browser() {
    driver= DriverManager.getBrowser("chrome");
		
		driver.manage().window().maximize();
		SeleniumWait.getImplicitWait(driver, 5);;
	    
	}

	@Given("Go to the application URL")
	public void go_to_the_application_URL() {
		
		driver.get(Constants.URL);
		ScreenShot.getScreenShot(driver, "Home page");
	    
		 pf = new SeleniumPageFactory(driver);
		
		
	    
	}

	@When("Click the Sign in button")
	public void click_the_Sign_in_button() {
		
		HighLighter.getColor(driver, pf.getSigninBtn().get(0), "black");
		pf.getSigninBtn().get(0).click();
		ScreenShot.getScreenShot(driver, "Login Page");
	    
	}

	@When("Put Valid Email")
	public void put_Valid_Email() {
	  
		HighLighter.getColor(driver, pf.getEmail(), "white");
		pf.getEmail().sendKeys(Constants.user); 
	}

	@When("Put Valid Password")
	public void put_Valid_Password() {
		HighLighter.getColor(driver, pf.getPassword(), "yellow");
		pf.getPassword().sendKeys(Constants.password);
	    
	}

	@When("Click the Second Sign In Button")
	public void click_the_Second_Sign_In_Button() {
		HighLighter.getColor(driver, pf.getSecondSigninBtn(), "green");
		pf.getSecondSigninBtn().click();
		ScreenShot.getScreenShot(driver, "Login validation");
	    
	}

	@Then("Validate The Login Was Successfu.")
	public void validate_The_Login_Was_Successfu() {
	  
		SoftAssert sf = new SoftAssert();
		sf.assertTrue(pf.getWelcome().get(0).isDisplayed());
		sf.assertAll();
	}



}

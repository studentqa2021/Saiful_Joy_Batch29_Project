package com.generic;



import org.openqa.selenium.WebDriver;

import org.testng.asserts.SoftAssert;

import com.drivermanager.DriverManager;
import com.selenium.pagefactory.SeleniumPageFactory;
import com.util.Constants;
import com.util.HighLighter;
import com.util.ScreenShot;
import com.util.SeleniumWait;



public class BaseLogin {
	
	public void getLogin() {
		
		WebDriver driver =DriverManager.getBrowser("chrome");
		driver.manage().window().maximize();
		SeleniumWait.getImplicitWait(driver,3);
	
		SeleniumPageFactory pf = new SeleniumPageFactory(driver);
		driver.navigate().to(Constants.URL);
		ScreenShot.getScreenShot(driver, "HomePage");
		
		SeleniumWait.getExplicitWait(driver, pf.getSigninBtn().get(0), 3);
		
		HighLighter.getColor(driver, pf.getSigninBtn().get(0),"green");
		pf.getSigninBtn().get(0).click();
		HighLighter.getColor(driver, pf.getEmail(),"blue");
		
		ScreenShot.getScreenShot(driver, "LoginPage");
		pf.getEmail().click();
		pf.getEmail().sendKeys(Constants.user);
		
		HighLighter.getColor(driver, pf.getPassword(),"yellow");
		pf.getPassword().click();
		pf.getPassword().sendKeys(Constants.password);
		HighLighter.getColor(driver, pf.getSecondSigninBtn(),"red");
		
		
		pf.getSecondSigninBtn().click();
		HighLighter.getColor(driver, pf.getWelcome().get(0), "green");
		ScreenShot.getScreenShot(driver, "LoginValidation");
		boolean status = pf.getWelcome().get(0).isDisplayed();
		
		
//		1)	Go to the application product and select the woman’s section
//		(URL =https://magento.softwaretestingboard.com/)
		pf.getWoman().click();
		HighLighter.getColor(driver, pf.getWoman(), "black");
		
//		2)	Find out all prices and all product names in the hot seller section
		pf.getHotSeller().click();
		HighLighter.getColor(driver, pf.getHotSeller(), "green");
//		3)	Go to hot sellers and find out the highest & lowest prices with the dress name
		
		
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(status);
		sa.assertAll();
		
	
	}                 

}

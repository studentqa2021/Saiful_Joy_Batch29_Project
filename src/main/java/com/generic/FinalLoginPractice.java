package com.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.drivermanager.DriverManager;
import com.selenium.pagefactory.SeleniumPageFactory;
import com.util.Constants;
import com.util.HighLighter;
import com.util.ScreenShot;
import com.util.SeleniumWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FinalLoginPractice {
	
	
	public static void getFinalLogin() {
//		WebDriver driver =DriverManager.getBrowser("chrome");
//		driver.manage().window().maximize();
//		SeleniumWait.getImplicitWait(driver,3);
//	
//		SeleniumPageFactory pf = new SeleniumPageFactory(driver);
//		driver.navigate().to(Constants.URL);
//		ScreenShot.getScreenShot(driver, "HomePage");
//		
//      SeleniumWait.getExplicitWait(driver, pf.getSigninBtn().get(0), 3);
//		
//		HighLighter.getColor(driver, pf.getSigninBtn().get(0),"red");
//		pf.getSigninBtn().get(0).click();
//		HighLighter.getColor(driver, pf.getEmail(),"blue");
//		
//		ScreenShot.getScreenShot(driver, "LoginPage");
//		pf.getEmail().click();
//		pf.getEmail().sendKeys(Constants.user);
//		
//		HighLighter.getColor(driver, pf.getPassword(),"white");
//		pf.getPassword().click();
//		pf.getPassword().sendKeys(Constants.password);
//		HighLighter.getColor(driver, pf.getSecondSigninBtn(),"black");
//		
//		pf.getSecondSigninBtn().click();
//		HighLighter.getColor(driver, pf.getWelcome().get(0), "green");
//		ScreenShot.getScreenShot(driver, "LoginValidation");
//		boolean status = pf.getWelcome().get(0).isDisplayed();
		
		//System.exit(0);
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
//		driver.get("https://magento.softwaretestingboard.com/");
//		driver.findElement(By.xpath("//*[@class='authorization-link']")).click();
//		
//		driver.findElement(By.xpath("//*[@id='email']")).click();
//		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sarowerny@gmail.com");
//		
//		driver.findElement(By.xpath("//*[@title='Password']")).click();
//		driver.findElement(By.xpath("//*[@title='Password']")).sendKeys("Student123$");
//		
//		driver.findElement(By.xpath("//*[@class='action login primary']")).click();
//		
//		//validate = welcome sarower =xpath ==> is displayed = true = passed
//		
//		
//				if(driver.findElement(By.xpath("(//*[contains(text(),'Welcome')])[1]")).isDisplayed()) {//true
//					
//					System.out.println("Test passed");
//				}else {// not true
//					System.out.println("Test failed");
//				}
//				// never tell test passed ==> but always told when test fail
//				Assert.assertTrue(driver.findElement(By.xpath("(//*[contains(text(),'Welcome')])[1]")).isDisplayed());
//				
//				SoftAssert sf = new SoftAssert();
//				sf.assertTrue(driver.findElement(By.xpath("(//*[contains(text(),'Welcome')])[1]")).isDisplayed());
//				sf.assertAll();
		
		
		
		WebDriver driver= DriverManager.getBrowser("chrome");
		
		driver.manage().window().maximize();
		SeleniumWait.getImplicitWait(driver, 5);;
		
		driver.get(Constants.URL);
		ScreenShot.getScreenShot(driver, "Home page");
	    
		SeleniumPageFactory pf = new SeleniumPageFactory(driver);
		
		HighLighter.getColor(driver, pf.getSigninBtn().get(0), "black");
		pf.getSigninBtn().get(0).click();
		ScreenShot.getScreenShot(driver, "Login Page");
		
		HighLighter.getColor(driver, pf.getEmail(), "white");
		pf.getEmail().sendKeys(Constants.user);
		
		HighLighter.getColor(driver, pf.getPassword(), "yellow");
		pf.getPassword().sendKeys(Constants.password);
		
		HighLighter.getColor(driver, pf.getSecondSigninBtn(), "green");
		pf.getSecondSigninBtn().click();
		ScreenShot.getScreenShot(driver, "Login validation");
		
		SoftAssert sf = new SoftAssert();
		sf.assertTrue(pf.getWelcome().get(0).isDisplayed());
		sf.assertAll();
	
			driver.quit();	

			}
			
			


	public static void main(String[] args) {
		getFinalLogin();
	 

	}

}
		
		
//		//Login ==>https://magento.softwaretestingboard.com/
//				//open browser
//				WebDriver driver =DriverManager.getBrowser("chrome");
//				driver.manage().window().maximize();
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//				// got to Application
//				driver.navigate().to(Constants.URL);
//				//Home page
//				ScreenShot.getScreenShot(driver, "Home Page");
//				//click sign in button
//				SeleniumPageFactory pf = new SeleniumPageFactory(driver);
//				HighLighter.getColor(driver, pf.getSigninBtn().get(0), "red");
//				pf.getSigninBtn().get(0).click();
//				//Login page
//				ScreenShot.getScreenShot(driver, "Login Page");
//				//put email
//				HighLighter.getColor(driver, pf.getEmail(), "green");
//				pf.getEmail().sendKeys(Constants.user);
//				//out password
//				HighLighter.getColor(driver, pf.getPassword(), "blue");
//				pf.getPassword().sendKeys(Constants.password);
//				//click 2nd sign in
//				HighLighter.getColor(driver, pf.getSecondSigninBtn(), "yellow");
//				pf.getSecondSigninBtn().click();
//				//login validation
//				ScreenShot.getScreenShot(driver, "Login validation");
//				//validate = welcome sarower =xpath ==> is displayed = true = passed
//				SoftAssert sf = new SoftAssert();
//				sf.assertTrue(pf.getWelcome().get(0).isDisplayed());
//				sf.assertAll();
//				
//				
//
//			}
//			
//			
//			public static void main(String[] args) {
//				getFinalLogin();
//			}
//
//		}
//		

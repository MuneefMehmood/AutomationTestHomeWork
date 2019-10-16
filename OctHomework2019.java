package TestUtilities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class OctHomework2019 {
	
	@Before
	public void beforeMethod() {
		
		//Navigate and Maximize the Web

		Driver.getDriver().get(ConfigurationReader.getProperty("HomePage"));
		Driver.getDriver().manage().window().maximize();
		BrowserUtils.waitFor(3);
	}
	
	@Test
	public void loginMethod() {
		
		// Login using valid Credentials provided
		
		Driver.getDriver().findElement(By.id("txtUsername")).sendKeys("opensourcecms");
		Driver.getDriver().findElement(By.id("txtPassword")).sendKeys("opensourcecms");
		BrowserUtils.waitFor(3);
		
		Driver.getDriver().findElement(By.id("btnLogin")).click();
		
		//Verifying Welcome Admin
		
		Driver.getDriver().findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).isDisplayed();
		BrowserUtils.waitFor(3);
		
		//Click On Admin to Navigate to the Page
		
		Driver.getDriver().findElement(By.xpath("//*[@id=\"admin\"]/a/span")).click();
		
		//Verify General Information
		
		BrowserUtils.waitFor(3);
		Driver.getDriver().switchTo().frame("rightMenu");
		Assert.assertTrue(Driver.getDriver().findElement(By.xpath("\"//*[@id=\\\"genInfoHeading\\\"]\"))")).isDisplayed());
		BrowserUtils.waitFor(3);
		
		//Navigate back to previousPage
		
		
		Driver.getDriver().navigate().back();
		
		//LogOut
		
		Driver.getDriver().findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a")).click();
		
		
		
		
	}

}

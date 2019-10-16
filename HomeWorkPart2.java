package TestUtilities;

import java.util.Iterator;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class HomeWorkPart2 {
	@Before
	public void beforeMethod() {
		
		//Navigate and Maximize the Web

		Driver.getDriver().get(ConfigurationReader.getProperty("WebPage"));
		Driver.getDriver().manage().window().maximize();
		BrowserUtils.waitFor(3);

}
	@Test
	public void clickMethod() {
		//Click tab 'Demo' and Navigate to the page
		
		Driver.getDriver().findElement(By.xpath("//*[@id=\"ShopifyMainNav\"]/ul[1]/li[1]/a")).click();
		
		//Capute the UserName and Password of 'Homepage Front-End'
		
		Driver.getDriver().findElement(By.xpath("//*[@id=\"Main\"]/section[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div[3]")).isDisplayed();
		 //Navigate to 'https://www.phptravels.net/' by clicking on the button
		
		Driver.getDriver().findElement(By.xpath("//*[@id=\"Main\"]/section[2]/div/div/div[2]/div/div/div[2]/div[2]/div/div[1]/div/a/small")).click();
		
		//switch your window to the childWindow
		
		BrowserUtils.waitFor(3);
		System.out.println("Before Switching");
        System.out.println(Driver.getDriver().getTitle());
        
        Set<String>ids=Driver.getDriver().getWindowHandles();
        Iterator<String> it = ids.iterator();
       String parentId = it.next();
       String childID = it.next();
        Driver.getDriver().switchTo().window(parentId);
        
        System.out.println("After Switching");
      System.out.println(Driver.getDriver().getTitle());
        
        Driver.getDriver().switchTo().window(childID);
       System.out.println("Switching Back To child");
        System.out.println(Driver.getDriver().getTitle());
        
        //click on "MY ACCOUNT" and click on 'login'
        
        Driver.getDriver().findElement(By.id(ConfigurationReader.getProperty("My Account"))).click();
      
       BrowserUtils.waitFor(2);
      
      Driver.getDriver().findElement(By.xpath("//*[@id=\"li_myaccount\"]/a")).click();
        
		
		
	}
}

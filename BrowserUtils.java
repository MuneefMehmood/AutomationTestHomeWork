package TestUtilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {
	
	
	
	public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static WebElement waitForVisibility(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    public static void waitFor(int sec) {
    	try {
    		Thread.sleep(sec * 1000);
    	} catch (InterruptedException e) {
    		e.printStackTrace();}
    	}
    	public static void hover(WebElement element) {
            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(element).perform();
        }
    	public static List<String> getElementsText(List<WebElement> list) {
            List<String> elemTexts = new ArrayList<>();
            for (WebElement el : list) {
                if (!el.getText().isEmpty()) {
                    elemTexts.add(el.getText());
                }
            }
            return elemTexts;
            
            }public static void dragAndDrop(WebElement source, WebElement target) {
                Actions actions = new Actions(Driver.getDriver());
                actions.dragAndDrop(source, target).perform();
            }
            
            public static void doubleClick(WebElement source) {
                Actions actions = new Actions(Driver.getDriver());
                actions.doubleClick(source).perform();
            }
}


    
    
            
        
        
    



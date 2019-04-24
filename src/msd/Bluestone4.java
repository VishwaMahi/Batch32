package msd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bluestone4 {
	 @Test
	    public void test() throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.bluestone.com/");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    
	    driver.findElement(By.xpath("//a[@title='Gold Mine 10+1 Monthly Scheme']")).click();
	    driver.findElement(By.id("tahLpSubmit")).click();
	    
	  WebElement wb=driver.findElement(By.id("Email_error"));
	    boolean status=wb.isDisplayed();
	    if(status) {
	    	System.out.println("PAss");
	    }
	  
}
}
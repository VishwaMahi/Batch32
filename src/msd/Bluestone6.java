package msd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bluestone6 {
	
    @Test
    public void test() {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.bluestone.com/");
    driver.findElement(By.linkText("Visit Our Stores")).click();
    
    
 List<WebElement> lst = driver.findElements(By.xpath("//div[@class='map-info-text']"));
    System.out.println(lst.size());
    
}
}
package msd ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bluestone1 {

	
    @Test
    public void test() throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.bluestone.com/");
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.findElement(By.id("search_query_top_elastic_search")).sendKeys(Keys.chord("rings",Keys.ENTER));
  
    driver.findElement(By.xpath("//span[text()='More Filters']")).click();
   WebElement count= driver.findElement(By.xpath("//span[text()=' 22k ']/child::span[@class='items-count']"));
    System.out.println(count.getText());
    driver.close();
}

}

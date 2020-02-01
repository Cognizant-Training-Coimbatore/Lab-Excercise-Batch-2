package webDriverDemo;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("file:///C:/Users/Admin/Downloads/sample.html");
	       Select product=new Select(driver.findElement(By.xpath("//select"))) ;
	       product.selectByVisibleText("Mango");
	      int size=product.getOptions().size();
	      String y=Integer.toString(size);
	      
	      WebElement x;
	       x=driver.findElement(By.id("txt1"));
	      
	       x.sendKeys(y);
	       java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
	       int sz=links.size();
	       String z=Integer.toString(sz);
	       List<WebElement> boxes=driver.findElements(By.cssSelector("input[type='checkboxes']"));
	       int n=boxes.size();
	       WebElement a;
	       a=driver.findElement(By.id("t2"));
	       String nm=Integer.toString(n);
	       a.sendKeys(z);
	       a.sendKeys(nm);
	      Random read=new Random();
	      int h=read.nextInt(2);
	      if(h==0) {
	    	  driver.findElement(By.id("check1")).click();
	    	  System.out.println("music,spiritual");
	      }
	      if(h==1) {
	    	  driver.findElement(By.id("check2")).click();
	    	  System.out.println("sports,spiritual");
	      }
	      if(h==2) {
	    	  driver.findElement(By.id("check3")).click();
	    	  System.out.println("sports,music");
	      }
	        Thread.sleep(5000);
	       driver.quit();
	       
		

	}

}

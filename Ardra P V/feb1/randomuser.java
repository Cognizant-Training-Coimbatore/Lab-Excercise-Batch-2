package webDriverDemo;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class randomuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("http://demowebshop.tricentis.com");
	       int i;
	       for(i=0;i<5;i++) {
	    	   String username;
	    	   Random rand=new Random();
	    	   int randomnumber=rand.nextInt(1000);
	    	   username="user"+randomnumber+"@gmail.com";
	    	   System.out.println(username);
	    	   driver.findElement(By.linkText("Register")).click();
	    	   driver.findElement(By.linkText("gender-male")).click();
	    	   driver.findElement(By.id("FirstName")).sendKeys("firstname1");
	    	   driver.findElement(By.id("Lastname")).sendKeys("lastname1");
	    	   driver.findElement(By.id("Email")).sendKeys("username");
	    	   driver.findElement(By.id("password")).sendKeys("12345@3");
	    	   driver.findElement(By.id("Confirm Password")).sendKeys("12345@3");
	    	   driver.findElement(By.id("register-button")).click();
	    	   driver.findElement(By.id("Log out")).click();
	    	   
	       }

	}

}

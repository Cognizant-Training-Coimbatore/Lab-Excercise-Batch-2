package webDriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://jpetstore.cfapps.io/");
	       WebElement  login=driver.findElement(By.linkText("Enter the Store"));
	       login.click();
	      
	       String s=driver.getTitle();
	       System.out.println(s);
	       driver.quit();
	       

	}

}

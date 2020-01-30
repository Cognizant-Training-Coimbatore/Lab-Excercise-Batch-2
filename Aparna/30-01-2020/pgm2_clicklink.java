package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm2_clicklink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); //which browser to use
		WebDriver driver=new ChromeDriver();     
		driver.get("http://demowebshop.tricentis.com");//open webpage
		WebElement login=driver.findElement(By.linkText("Log in"));  //to give link
		login.click();   //open page  and will click on login on next page
		String s=driver.getTitle();
		System.out.println(s);
		driver.quit();
	}

}

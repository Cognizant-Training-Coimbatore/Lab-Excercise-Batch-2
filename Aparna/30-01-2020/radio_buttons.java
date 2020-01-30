package webdriverdemo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_buttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); //which browser to use
		WebDriver driver=new ChromeDriver();   
		driver.get("http://demowebshop.tricentis.com");
		WebElement register=driver.findElement(By.linkText("Register"));
		register.click();
		List<WebElement>gender=driver.findElements(By.name("Gender"));
		gender.get(1).click();
		Thread.sleep(2000);
		
		String s=driver.getTitle();
		System.out.println(s); 
		driver.quit();
	}

}

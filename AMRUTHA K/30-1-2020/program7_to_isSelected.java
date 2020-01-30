package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program7_to_isSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");//which browser using//chrome//explorer
		WebDriver driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");//to open the web page
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click();
		Thread.sleep(1000);
		WebElement remember=driver.findElement(By.name("RememberMe"));
		boolean res=remember.isSelected();
		if(res==true)
		{
			System.out.println("already selected");
		}
		else {
			System.out.println("not selected");
			Thread.sleep(5000);
			remember.click();
			Thread.sleep(5000);
		}
		driver.quit();

	}

}

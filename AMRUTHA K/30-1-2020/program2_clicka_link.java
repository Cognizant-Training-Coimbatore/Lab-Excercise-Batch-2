package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program2_clicka_link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");//which browser using//chrome//explorer
		WebDriver driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");//to open the web page
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click();
		String s=driver.getTitle();
		System.out.println(s);
		driver.quit();
		

	}

}

package webdriverdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");//which browser using//chrome//explorer
		WebDriver driver =new ChromeDriver();
		driver.get("http://jpetstore.cfapps.io/");//to open the web page
		WebElement login=driver.findElement(By.linkText("Enter the Store"));
		login.click();
		
		String s=driver.getTitle();
		System.out.println(s);
		driver.quit();


	}

}

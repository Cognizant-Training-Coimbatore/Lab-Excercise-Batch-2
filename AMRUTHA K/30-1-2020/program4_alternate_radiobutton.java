package webdriverdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program4_alternate_radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");//which browser using//chrome//explorer
		WebDriver driver =new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement reg=driver.findElement(By.linkText("Register"));//to open the web page
		reg.click();
		List<WebElement>gender=driver.findElements(By.name("Gender"));
		gender.get(0).click();
		Thread.sleep(4000);
		
		
		String s=driver.getTitle();
		System.out.println(s);
		driver.quit();

	}

}

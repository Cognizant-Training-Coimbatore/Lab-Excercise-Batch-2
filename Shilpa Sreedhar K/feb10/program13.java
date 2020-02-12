package webDriverDemo;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class program13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_example\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement computers=driver.findElement(By.linkText("COMPUTERS"));
		Actions actions=new Actions(driver);
		actions.moveToElement(computers).build().perform();
		driver.findElement(By.linkText("Notebooks")).click();
		
		Thread.sleep(5000);
		driver.quit();
		
}}

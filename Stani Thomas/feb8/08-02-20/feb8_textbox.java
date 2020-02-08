package selenium_examples;

import java.security.KeyStore.Entry.Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb9_textbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\stani/selenium.html");
		driver.findElement(By.id("txt1")).sendKeys("stani");
		Thread.sleep(5000);
		String s=driver.findElement(By.id("txt1")).getAttribute(("value"));
		System.out.println(s.length());
		driver.quit();
	}

}

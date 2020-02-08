package selenium_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb8_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\stani/selenium.html");
		WebElement link1=driver.findElement(By.linkText("Google"));
		link1.click();
		System.out.println(driver.getTitle());
		driver.quit();
	}

}

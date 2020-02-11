package seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\java pgmng\\SeleniumEx\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com/");
		driver.findElement(By.name("q")).sendKeys("Nature images");
		driver.findElement(By.name("q")).submit();
	}

}

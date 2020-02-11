package seleniumeg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm5_radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file://E:/exp.html");
		driver.findElement(By.id("txt1")).sendKeys("Shilpa");
		Thread.sleep(5000);
		List<WebElement> radio1=driver.findElements(By.name("gender"));
	    radio1.get(1).click();
		Thread.sleep(5000);
		System.out.println(radio1.get(1).isSelected());
		driver.quit();


	}

}

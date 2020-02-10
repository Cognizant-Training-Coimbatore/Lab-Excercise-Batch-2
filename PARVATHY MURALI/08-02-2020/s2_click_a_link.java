import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s2_click_a_link {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/parvathy_m/s_1.html");
		//WebElement link=(WebElement) driver.findElements(By.linkText("google"));
		//((WebElement) link).click();
		((WebElement) driver.findElements(By.id("txt1"))).sendKeys("paru");
		System.out.println(driver.getTitle());
		String s=((WebElement) driver.findElements(By.id("txt1"))).getAttribute("value");
		System.out.println(s);
		driver.quit();

	}

}

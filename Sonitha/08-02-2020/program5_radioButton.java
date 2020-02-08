import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program5_radioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/Sonitha/seleniumnew/seleniumcts.html");
		List<WebElement> radio = driver.findElements(By.name("gender"));
		System.out.println(radio.get(0).isSelected());
		System.out.println(radio.get(1).isSelected());
        Thread.sleep(5000);
        radio.get(0).click();
        System.out.println(radio.get(0).isSelected());
		driver.quit();
	}

}

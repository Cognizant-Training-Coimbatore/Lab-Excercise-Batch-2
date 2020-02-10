import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class program_5_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java Programing Class\\selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/asha/selenium.html");
		List<WebElement>radio1.findElements(By.name("gender"));
		System.out.println(radio1.get(0).isSelected());
		System.out.println(radio1.get(1).isSelected());
		radio1.get(0).click();
		
		
Thread.sleep(5000);

		
		driver.quit();
		
	}

}

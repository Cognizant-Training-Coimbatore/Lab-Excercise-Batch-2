

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s3_radio {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/parvathy_m/s_1.html");
		List<WebElement> radio1=driver.findElements(By.name("gender"));
		System.out.println(radio1.get(0).isSelected());
		System.out.println(radio1.get(1).isSelected());
		
		
	}

}

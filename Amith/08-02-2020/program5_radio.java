import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program5_radio {

	public static void main(String[] args) throws InterruptedException 
	{
		System.getProperty("webdriver.chrome.driver", "\"C:\\\\Users\\\\Admin\\\\Desktop\\\\java_programs\\\\selenium examples\\\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/amith/app.html");
		List<WebElement> radio1=driver.findElements(By.name("sex"));
		System.out.println(radio1.get(0).isSelected());
		System.out.println(radio1.get(1).isSelected());;
		Thread.sleep(3000);
		driver.quit();
		
	}

}

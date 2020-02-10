import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_select {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/chrome.html");
		List<WebElement>radio1=(List<WebElement>) driver.findElement(By.name("ender"));
		System.out.println(radio1.get(0).isSelected());
		System.out.println(radio1.get(1).isSelected());
		Thread.sleep(3000);
		radio1.get(0).click();
		System.out.println(radio1.get(0).isSelected());
		driver.quit();
		
		

	}

}

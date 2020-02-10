import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java programs\\Selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Mariya/eg4.html");
		List<WebElement>radio1=driver.findElements(By.name("gender"));
		System.out.println(radio1.get(0).isSelected());
        System.out.println(radio1.get(1).isSelected());
        radio1.get(0).click();
       
        Thread.sleep(5000);
		driver.quit();
		
	}

}

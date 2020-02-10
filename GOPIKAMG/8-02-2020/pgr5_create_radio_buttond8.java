import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgr5_create_radio_buttond8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("file:///E:/app.html ");
		   List<WebElement> radio1=driver.findElements(By.name("gender"));
		   System.out.println(radio1.get(0).isSelected());
		   System.out.println(radio1.get(1).isSelected());
		   Thread.sleep(5000);
		   radio1.get(1).click();
		   System.out.println(radio1.get(1).isSelected());
		   driver.quit();
	}

}

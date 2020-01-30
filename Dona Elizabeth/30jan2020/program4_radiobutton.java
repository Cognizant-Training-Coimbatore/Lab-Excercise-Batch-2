import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program4_radiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement reg=driver.findElement(By.linkText("Register"));
		reg.click();
		List<WebElement> gender=driver.findElements(By.name("Gender"));
		gender.get(1).click();//to select male give get(0) since the elements starts with 0
		Thread.sleep(5000);
		driver.quit();
	}

}

package feb12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Downloads/testcase2.html.htm");
		Select combo = new Select(driver.findElement(By.id("country")));
		int s = combo.getOptions().size();
		driver.findElement(By.id("t1")).sendKeys(String.valueOf(s));
		Thread.sleep(3000);
		driver.quit();

	}

}

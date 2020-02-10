package basicCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program8_tableColumns {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver.exe", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("C:\\Users\\jomon\\Desktop\\CTS\\Training\\Selenium\\table.html");
		
		WebElement table =driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> rows = table.findElements(By.tagName("td"));
		System.out.println(rows.size());
		
		Thread.sleep(5000);
		driver.quit();

	}

}

package ABC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prgm7_tablerow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/Admin/Desktop/Selenium/sample12.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[1]"));
		List <WebElement> rows= table.findElements(By.tagName("td"));
		System.out.println(rows.size());
		driver.quit();
	}

}

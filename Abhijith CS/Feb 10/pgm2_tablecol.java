package webdriverdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm2_tablecol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\sample.html");
		WebElement table = driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> cols = table.findElements(By.tagName("td"));
		System.out.println(cols.size());
		driver.quit();
	}

}

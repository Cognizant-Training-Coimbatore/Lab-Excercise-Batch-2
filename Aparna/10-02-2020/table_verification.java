package selenium_new;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_verification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\java\\selenium_new\\src\\selenium_new\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("file:///D:/table1.html");
WebElement  table=driver.findElement(By.xpath("/html/body/table/tbody"));
List<WebElement>rows=table.findElements(By.tagName("tr"));
System.out.println(rows.size());
driver.quit();
	}

}

package feb10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/html/selenium2.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> column=table.findElements(By.tagName("td"));
		System.out.println(column.size());
		
		Thread.sleep(2000);
		driver.quit();
	}

}

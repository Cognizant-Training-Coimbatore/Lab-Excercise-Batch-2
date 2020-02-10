import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program7_table_verification {

	public static void main(String[] args) 
	{
		System.getProperty("webdriver.chrome.driver", "\"C:\\\\Users\\\\Admin\\\\Desktop\\\\java_programs\\\\selenium examples\\\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/amith/app.html");
		WebElement table= driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
				
		driver.quit();
	}

}

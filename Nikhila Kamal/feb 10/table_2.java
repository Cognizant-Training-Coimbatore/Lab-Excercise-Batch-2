package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\java programs\\\\selenium exampls\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		open the url "https://www.selenium.dev/"
		driver.get("file:///C:/Users/Admin/Desktop/tableexp.html");
		WebElement table=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
		List<WebElement> column=table.findElements(By.tagName("td"));
		System.out.println(column.size());
		driver.quit();
	}

}

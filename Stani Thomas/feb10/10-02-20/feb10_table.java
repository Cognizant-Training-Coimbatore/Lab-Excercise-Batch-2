package selenium_examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb10_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("D:\\stani\\sel.html");
WebElement table=driver.findElement(By.xpath("/html/body/table/tbody"));
List<WebElement>rows=table.findElements(By.tagName("tr"));
System.out.println(rows.size());
WebElement table1=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]"));
List<WebElement>columns=table1.findElements(By.tagName("td"));
System.out.println(columns.size());
driver.quit();

	}

}

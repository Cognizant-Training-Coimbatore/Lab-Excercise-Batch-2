package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb10_ques1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://html.com/tables/#Table_Code_Sample_Simple_Table");
		WebElement table = driver.findElement(By.xpath("//*[@id=\"post-382\"]/div/div[4]"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("The no of rows are : "+rows.size());
		driver.quit();

	}

}

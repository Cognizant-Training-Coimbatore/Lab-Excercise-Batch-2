package webdriverdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgmex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/tables/#Table_Code_Sample_Simple_Table");
		WebElement table = driver.findElement(By.xpath("//*[@id=\"post-382\"]/div/div[4]/table/tbody"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("Number of rows : "+rows.size());
		driver.quit();
	}

}

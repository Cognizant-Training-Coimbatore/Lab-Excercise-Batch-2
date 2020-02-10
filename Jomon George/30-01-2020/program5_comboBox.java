package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program5_comboBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String inputURL = "http://examples.codecharge.com/Store/Default.php";
		driver.get(inputURL);
		
		Select product = new Select(driver.findElement(By.name("category_id")));
		
		int total = product.getOptions().size();
		System.out.println(total);
		
		product.selectByVisibleText("Databases");
		
		Thread.sleep(5000);
		driver.quit();
	}

}

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class q30_1 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://examples.codecharge.com/Store/Default.php");
		Select product=new Select(driver.findElement(By.className("category_id")));
		int total=product.getOptions().size();
		System.out.println(total);
		
		driver.quit();
	}

}

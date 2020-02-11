package seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2_exercise_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Select combo1=new Select(driver.findElement(By.name("category_id")));
		combo1.selectByVisibleText("Databases");
		Thread.sleep(2000);
		driver.findElement(By.name("DoSearch")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}

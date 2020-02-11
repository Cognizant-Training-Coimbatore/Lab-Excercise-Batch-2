package seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2_exercise_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		driver.manage().window().maximize();
		Select combo1=new Select(driver.findElement(By.name("category_id")));
		int total=combo1.getOptions().size();
		System.out.println(total);
		Thread.sleep(4000);
		driver.quit();

	}

}

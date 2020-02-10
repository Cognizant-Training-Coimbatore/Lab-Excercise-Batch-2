import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p6_combobox {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\Selenium Examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:\\Shaheen/app.html");
		Select combo1 = new Select(driver.findElement(By.id("combo1")));
		combo1.selectByVisibleText("E");
		System.out.println(combo1.getOptions().size());
		Thread.sleep(2000);
		driver.quit();

	}

}

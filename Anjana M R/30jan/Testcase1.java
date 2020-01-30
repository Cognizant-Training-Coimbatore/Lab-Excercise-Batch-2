import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement Enter=driver.findElement(By.linkText("Enter the Store"));
		Enter.click();
		String s=driver.getTitle();
		System.out.println(s);
		driver.quit();
		

	}

}

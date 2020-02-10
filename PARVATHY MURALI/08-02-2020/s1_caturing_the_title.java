import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s1_caturing_the_title 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/parvathy_m/s_1.html");
		WebElement link=(WebElement) driver.findElements(By.linkText("google"));
		link.click();
				System.out.println();

	}

}

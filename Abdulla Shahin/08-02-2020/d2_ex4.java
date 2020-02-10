import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d2_ex4 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\java\\Selenium Examples\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Bookstore";
		if (actualTitle.equals(expectedTitle))
		{
			System.out.println("Title is True");
		}
		else
		{
			System.out.println("Title is False");
		}
		WebElement link1 = driver.findElement(By.linkText("Databases"));
		link1.click();
		WebElement link2 = driver.findElement(By.name("DoSearch"));
		link2.click();
		WebElement link3 = driver.findElement(By.linkText("Web Database Development"));
		link3.click();
		String qty = driver.findElement(By.name("quantity")).getAttribute("value");
		System.out.println(qty);
		WebElement link4 = driver.findElement(By.name("Insert1"));
		link4.click();
		WebElement cb = driver.findElement(By.name("Delete1_1"));
		if(cb.isSelected() == true)
		{
			System.out.println("delete is on");
		}
		else
		{
			System.out.println("delete is off");
		}
		Thread.sleep(1000);
		driver.quit();


	}

}

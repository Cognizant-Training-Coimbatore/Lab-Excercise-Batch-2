import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class d2_ex3 {

	public static void main(String[] args) throws InterruptedException 
	{
		String s;
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
		Select combo1 = new Select(driver.findElement(By.name("category_id")));
		int size = combo1.getOptions().size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			combo1.selectByIndex(i);
			Thread.sleep(2000);
			s = combo1.getFirstSelectedOption().getText();
			System.out.println(s);
		}
		driver.quit();
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_attribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java programs\\Selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Mariya/eg3.html");
		driver.findElement(By.id("txt1")).sendKeys("mariya123");
		Thread.sleep(1000);
		String s=driver.findElement(By.id("txt1")).getAttribute("value");
		System.out.println(s.length());
		driver.quit();

	}

}

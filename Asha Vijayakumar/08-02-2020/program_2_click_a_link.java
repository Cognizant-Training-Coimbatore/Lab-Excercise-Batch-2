import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_2_click_a_link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java Programing Class\\selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/asha/selenium.html");
		WebElement link1=driver.findElement(By.linkText("Google"));
		link1.click();
		
		System.out.println(driver.getTitle());
		driver.quit();
		

	}

}

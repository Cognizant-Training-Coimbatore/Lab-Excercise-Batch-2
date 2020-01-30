import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pgm29_q1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.com.driver","chromedriver.exe");//to launch browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");//webpage to be opened
		WebElement login=driver.findElement(By.linkText("Enter the Store"));//for clicking link
		login.click();
		String s=driver.getTitle();
		System.out.println(s);
		driver.quit();
		
		
		
	}

}

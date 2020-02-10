package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex2_databse {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\JAVA PROGRAMS\\Selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		driver.getTitle();
		Select combo1=new Select(driver.findElement(By.name("category_id")));
		combo1.selectByVisibleText("Databases");
		WebElement login=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input"));
		login.click();
		Thread.sleep(5000);
		driver.quit();

		
		// TODO Auto-generated method stub

	}

}

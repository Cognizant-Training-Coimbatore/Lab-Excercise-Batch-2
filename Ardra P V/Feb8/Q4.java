package seleniumeg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium_example\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//open the url "https://www.selenium.dev/"
		driver.get("http://examples.codecharge.com/Store/Default.php");
		Select combo1=new Select(driver.findElement(By.name("category_id")));
		combo1.selectByVisibleText("Databases");
		driver.findElement(By.name("DoSearch")).click();
		WebElement link1=driver.findElement(By.linkText("Web Database Development"));
		link1.click();
		String sa=driver.findElement(By.name("quantity")).getAttribute("value");
		System.out.println(sa);
		
		
		driver.findElement(By.name("Insert1")).click();
		WebElement del=driver.findElement(By.name("Delete_1"));
		boolean x=del.isSelected();
		if(x==true) {
			System.out.println("ON");
		}
		else {
			System.out.println("OFF");
		}
		
		
		Thread.sleep(500);
		driver.quit();

	}

}

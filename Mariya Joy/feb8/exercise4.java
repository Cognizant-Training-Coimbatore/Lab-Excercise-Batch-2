package basic_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class exercise4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Desktop\\\\Java programs\\\\Selenium_examples\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		Select product=new Select(driver.findElement(By.name("category_id")));
		product.selectByVisibleText("Databases");
		WebElement login=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input"));
		login.click();
		WebElement login1=driver.findElement(By.linkText("Web Database Development"));
		login1.click();
		WebElement login2=driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input"));
		String a=login2.getAttribute("value");
		System.out.println("Default value is "+a);
		driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[2]/input[1]")).click();
		boolean t=driver.findElement(By.name("Delete_1")).isSelected();
		if(t==true)
		{
			System.out.println("delete checkbox is selected");
		}
		else
		{
			System.out.println("Delete checkbox is not selected");
		}
		

		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.quit();


	}

}

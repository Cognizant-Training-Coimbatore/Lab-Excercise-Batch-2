package reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class feb12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Admin/Downloads/testcase3.html.html");
		Select abc=new Select(driver.findElement(By.id("country1")));
		abc.selectByIndex(0);
		String s=abc.getFirstSelectedOption().getText();
		System.out.println(s);
		if(s==driver.findElement(By.id("country1")))
	}

}

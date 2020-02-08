import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pgm6_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\app.html");
		driver.findElement(By.id("txt1")).sendKeys("Abhijith");
		Thread.sleep(4000);
		Select comb= new Select(driver.findElement(By.id("combo1")));
		comb.selectByVisibleText("OptionB");
		System.out.println(comb.getOptions().size());
		driver.quit();
	}

}

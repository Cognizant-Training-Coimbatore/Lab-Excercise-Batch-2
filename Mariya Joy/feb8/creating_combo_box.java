import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class creating_combo_box {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Java programs\\Selenium_examples\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Mariya/eg5.html");
		Select combo1=new Select(driver.findElement(By.id("combo1")));
		combo1.selectByVisibleText("OptionE");
		System.out.println(combo1.getOptions().size());
		Thread.sleep(5000);
		driver.quit();
		

	}

}

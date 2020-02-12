import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb11exp1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
FileInputStream file=new FileInputStream("E:\\JIJO A J\\ECLIPSE\\D3\\src\\props.properties");
Properties p=new Properties();
p.load(file);
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(p.getProperty("url"));
driver.findElement(By.id(p.getProperty("uid"))).sendKeys("love4messi");
driver.findElement(By.id(p.getProperty("pwd"))).sendKeys("9946619269");
Thread.sleep(4000);
driver.findElement(By.xpath(p.getProperty("btn"))).click();
Thread.sleep(4000);

driver.quit();

	}

}

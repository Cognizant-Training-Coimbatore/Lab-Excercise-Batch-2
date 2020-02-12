import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb11exp3 {

	public static void main(String[] args) throws DocumentException, InterruptedException {
		// TODO Auto-generated method stub
File ip=new File("E:\\JIJO A J\\ECLIPSE\\D3\\src\\fb.xml");
SAXReader fil=new SAXReader();
Document doc=fil.read(ip);
String url=doc.selectSingleNode("//fb/url").getText();
String uid=doc.selectSingleNode("//fb/uid").getText();
String pwd=doc.selectSingleNode("//fb/pwd").getText();
String btn=doc.selectSingleNode("//fb/btn").getText();
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(url);
driver.findElement(By.id(uid)).sendKeys("love4messi");
driver.findElement(By.id(pwd)).sendKeys("9946619269");
Thread.sleep(4000);
driver.findElement(By.xpath(btn)).click();
Thread.sleep(4000);

driver.quit();

	}

}

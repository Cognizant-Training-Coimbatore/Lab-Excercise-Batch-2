package repository;

import java.io.File;

import javax.swing.text.Document;

import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB {

	public static void main(String[] args) throws DocumentException {
		// TODO Auto-generated method stub
File ip=new File("C:\\Users\\admin\\Desktop\\Selenium\\Selenium_examples\\src\\repository\\FB.xml");
SAXReader fil=new SAXReader();
Document doc=fil.read(ip);
String url=doc.selectSingleNode("//fb/url").getText();
String uid=doc.selectSingleNode("//fb/uid").getText();
String pwd=doc.selectSingleNode("//fb/pwd").getText();
String btn=doc.selectSingleNode("//fb/btn").getText();
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get(url);
driver.findElement(By.id(uid)).sendKeys(uidv);
driver.findElement(By.id(pwd)).sendKeys(pwdv);
driver.findElement(By.xpath(btn)).click();



	}

}

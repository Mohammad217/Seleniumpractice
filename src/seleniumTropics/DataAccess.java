package seleniumTropics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataAccess extends DataFile {

	public static void main(String[] args) throws IOException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\BatchMarch2020\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		//driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		
		Properties pf=new Properties(); 
		FileInputStream fl=new FileInputStream("C:\\Users\\hasan\\workspace\\BatchMarch2020\\Pr.properties");
		pf.load(fl);
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(pf.getProperty("username"));
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(pf.getProperty("password"));

	}

}

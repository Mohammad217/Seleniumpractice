package seleniumTropics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkVerify {

	public static void main(String[] args) throws InterruptedException  {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\BatchMarch2020\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(500);
		
//		List<WebElement> sto = driver.findElements(By.tagName("a"));
//		System.out.println( sto.size());
//		
//		for(int i=1;i<sto.size();i++){
//			
//			System.out.println(sto.get(i).getText());
//		}
		
		
		WebElement area = driver.findElement(By.xpath("//*[@id='blueBarDOMInspector']/div/div/div"));
		
		List<WebElement> good = area.findElements(By.tagName("a"));
		
		System.out.println( good.size());
		
		for(int i=1;i<good.size();i++){
			
			System.out.println(good.get(i).getText());
		}
	}

}

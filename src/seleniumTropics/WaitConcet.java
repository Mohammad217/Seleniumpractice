package seleniumTropics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcet {

	public static void main(String[] args) throws InterruptedException  {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\BatchMarch2020\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();// Max the window 
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
		//Thread.sleep(200);
		
		//Implicit Wait 
		
		driver.manage().timeouts().implicitlyWait(400, TimeUnit.MILLISECONDS);
		
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[1]/div[1]/span/span")).getText());
		
		
		
		//Explicit Wait
		
		
		WebElement anyname=driver.findElement(By.xpath("//*[@value='Log In']"));
		
		WebDriverWait wait=new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.visibilityOfAllElements(anyname));
		anyname.click();
		
		driver.quit();

	}

}

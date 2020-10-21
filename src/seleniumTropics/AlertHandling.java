package seleniumTropics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\BatchMarch2020\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		
		//driver.switchTo().alert().dismiss(); for any negative action or decline 
		//driver.switchTo().alert().sendKeys("");
		
		Thread.sleep(3000);
		
		String message=driver.switchTo().alert().getText();
		System.out.println(message);
		
		driver.switchTo().alert().accept();

	}

}

package seleniumTropics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssTechnique {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alaud\\workspace\\BatchMarch2020-master\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.cssSelector("#u_0_m")).sendKeys("css technique");
		
		//Custom css selector tagname[att='value']
		
		//driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Custom css selector ");
		
		
		//Thread.sleep(300);
		//System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[1]/div[1]/span/span")).getText());
		
		//System.out.println(driver.findElement(By.xpath("//*[@value='Log In']")).getAttribute("aria-label"));
		
		//Breaking Xpah
		
		
		String part1="//*[@id='content']/div/div/div/div[1]/div[";

		String part2="]/span/span";
		
		for(int i=1;i<=3;i++){
			
			System.out.println(driver.findElement(By.xpath(part1+i+part2)).getText());
		}
		
		
		//Traversing xpath 
		
		driver.findElement(By.xpath("//form[@id='login_form']/table/tbody/tr[2]/td/input")).sendKeys("Travesing xpath technique");


	}

}

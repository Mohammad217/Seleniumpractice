package pk3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableBackUp {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\BatchMarch2020\\Jars\\chromedriver_win32\\chromedriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.dsebd.org/");
		Thread.sleep(3000);
		WebElement tbody = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[4]/div[1]/div[2]/div[2]/div/table/tbody"));
	
		List<WebElement> tr=tbody.findElements(By.tagName("tr"));
		//printTableValue(0,0);	
		
		for(int i=0;i<tr.size();i++){
			
			List<WebElement> td=tr.get(i).findElements(By.tagName("td"));
			for(int k=0;k<td.size();k++){
				System.out.println(td.get(k).getText());
			}
		}

		
	}
	
	public static void printTableValue(int r,int c){
		
		WebElement row=driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[4]/div[1]/div[2]/div[2]/div/table/tbody/tr["+r+"]/td["+c+"]"));
		System.out.println(row.getText());
		
	}


}

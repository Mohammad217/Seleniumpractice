package seleniumTropics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableConcept {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasan\\workspace\\BatchMarch2020\\Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.dsebd.org/");
		
	 WebElement	ty=driver.findElement(By.xpath("//*[@id='bvoluem']/div/table/tbody"));
	
	 
	 List<WebElement> tr1=ty.findElements(By.tagName("tr"));
	 
	 //System.out.println(tr1.size());
	 
	 for(int i=0;i<tr1.size();i++){
		 
		 List<WebElement>  td1=tr1.get(i).findElements(By.tagName("td"));
		 for(int k=0;k<td1.size();k++){
			 
			 System.out.println(td1.get(k).getText());
		 }
		 
		 
	 }
	 
	}

}

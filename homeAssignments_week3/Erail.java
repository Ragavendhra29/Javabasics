package homeAssignments_week3;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		driver.get("https://erail.in/");
		Thread.sleep(5000);	
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MS", Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("cape", Keys.ENTER);		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		
		List<WebElement> trainNames = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]//tr/td[2]"));
		System.out.println("There are totally "+ trainNames.size() + " trains available for selected location, they are");
		for (WebElement single : trainNames) 
			{
				System.out.println(single.getText());	
			}

	}
}

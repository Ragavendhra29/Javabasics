package homeAssignments_week3;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML1 {
	
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.manage().window().maximize();
	
	driver.get("https://html.com/tags/table/");
	Thread.sleep(5000);	
	//Table 1 Column, row count
	List<WebElement> column =driver.findElements(By.xpath("//div[@class='render']//tr/th"));
	int columncount = column.size();
	List<WebElement> row =driver.findElements(By.xpath("//div[@class='render']//tbody//tr"));
	int rowcount = row.size();
	System.out.println("Table 1 Details");
	System.out.println("There are totally " + columncount + " columns available");
	System.out.println("There are totally " + rowcount + " rows available");
	
	//Table 2 Column, row count
		List<WebElement> column2 =driver.findElements(By.xpath("//table[@class='attributes-list']//tr/th"));
		int columncount2 = column2.size();
		List<WebElement> row2 =driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		int rowcount2 = row2.size()-1;
		System.out.println("Table 2 Details");
		System.out.println("There are totally " + columncount2 + " columns available");
		System.out.println("There are totally " + rowcount2 + " rows available");
		
}
}

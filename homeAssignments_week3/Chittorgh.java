package homeAssignments_week3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgh {
	
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.manage().window().maximize();
	
	driver.get("https://www.chittorgarh.com");
	Thread.sleep(5000);	
	driver.findElement(By.id("navbtn_stockmarket")).click();
	driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
	
	List<WebElement> total =driver.findElements(By.xpath("//tr/td[3]"));
	List<String> list = new ArrayList<String>();
	int count = total.size();
	System.out.println("There are totally " + count + " rows available");
	
	for(int i=0;i<count;i++) {
		String name = total.get(i).getText();
		list.add(name);
	}
	Collections.sort(list);
	System.out.println("Total name before removing duplicate" + list);
	Set<String> dupname = new LinkedHashSet<String>(list);
	int count2 = dupname.size();
	System.out.println("Total names after removing duplicate" + dupname);
	System.out.println("There are totally " + count2 + " rows available");
}
}

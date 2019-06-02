package wrapperclasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("mahesh babu");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	List<WebElement> ele=	driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbtc']"));
	System.out.println(ele.size());
	for(int i=0;i<ele.size();i++)
	{
	String str=ele.get(i).getText();
	System.out.println(str);
	if(str.equalsIgnoreCase("mahesh babu wife"))
	{
		ele.get(i).click();
		break;
	}
	
	
	}
	}

}

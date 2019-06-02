package wrapperclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownverificationsorting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//WebElement ele=driver.findElement(By.id("animals"));
		Select s=new Select(driver.findElement(By.id("animals")));
		List<String> originallist=new ArrayList<String>();
		List<String> templist=new ArrayList<String>();
		List<WebElement> element=s.getOptions();
		for( WebElement elements:element)
		{
			originallist.add(elements.getText());
			templist.add(elements.getText());
		}System.out.println("before sorting originallist"+originallist);
		System.out.println("before sorting templist"+templist);
		Collections.sort(templist);
		System.out.println("After sorting originallist"+originallist);
		System.out.println("After sorting templist"+templist);
		
		if(templist==originallist)
		{
			System.out.println("dropdowns are sorted");
		}
		else
		{
			System.out.println("dropdowns are not sorted");
		}

	}

}

package wrapperclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropdownoptionssortedorNot {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sree\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement ele=	driver.findElement(By.id("animals"));

		Select s=new Select(ele);

		ArrayList<String> originallist=new ArrayList<String>();
		List <WebElement> ll=s.getOptions();

		for(int i=0;i<ll.size();i++)
		{
			originallist.add(ll.get(i).getText());
		}
		System.out.println(originallist);
		List templist=new ArrayList();
		templist=originallist;

		System.out.println("before sorting templist "+templist);
		Collections.sort(templist );
		System.out.println("after sorting templist"+templist);
		System.out.println("after sorting orinallist"+originallist);
		
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

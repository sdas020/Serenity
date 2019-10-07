package test1;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.when;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;



//@SuppressWarnings("deprecation")
public class UI_Testing {


	@FindBy(xpath="//*[@id='src']")
	WebElementFacade departureCity;
	
	@FindBy(xpath="//*[@id='dest']")
	WebElementFacade DestinationCity;
	
	@FindBy(xpath="//*[@id='search']/div/div[3]/div/label")
	WebElementFacade OnwardDate;
	
	@FindBy(xpath="//*[@id='search']/div/div[4]/div/label")
	WebElementFacade Returndate;
	
	@FindBy(xpath="//*[@id='search_btn']")
	WebElementFacade Searchbutton;
	
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");   
    	System.out.println("title"+driver.getTitle());
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("//*[@id='loginText']")).click();
    	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    	String text=driver.findElement(By.xpath("//*[@id='nlpCaptchaImg']")).getText();
    	System.out.println("capcha details "+text);
    	driver.close();
	}
	
	 
	 
	
}
	//}



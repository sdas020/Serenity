package test1;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import cucumber.api.Scenario;
import junit.framework.Assert;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.Thucydides;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("https://www.redbus.in/?gclid=EAIaIQobChMIgO6DzoSh3AIVljUrCh0eggrGEAAYASAAEgJxVvD_BwE")                      
public class HomePage extends ThucydidesWebDriverSupport{ 
	
	  
	
	@Managed(driver="chrome")                                                                
    WebDriver browser;
	
	@FindBy(id="src")
	WebElement departureCity;
	
	@FindBy(xpath="//*[@id='dest']")
	WebElement DestinationCity;
	
	@FindBy(xpath="//*[@id='search']/div/div[3]/div/label")
	WebElement OnwardDate;
	
	@FindBy(xpath="//*[@id='search']/div/div[4]/div/label")
	WebElement Returndate;
	
	@FindBy(xpath="//*[@id='search_btn']")
	WebElement searchButton;
	
	@SuppressWarnings("deprecation")
    public void searchFor(String departure_City,String Destination_place,String Onward_date,String Return_date,String text)throws Exception {
    	
		ChromeOptions options = new ChromeOptions();
    	options.addArguments("--disable-notifications");
    	
		//System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "libs\\chromedriver.exe");
		//WebDriver driver1 =new ChromeDriver(options);
    	//System.setProperty("webdriver.gecko.driver", "F:\\geckodriver");
    	//System.setProperty("webdriver.chrome.driver", "E:\\soumen important\\selenium-java-2.53.0\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver(options);
    	useDriver(driver);
    	
    	
//    	File pathBinary = new File("C:\\Users\\Souradip\\Downloads\\Firefox Setup Stub 50.1.0");
//    	FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
//    	FirefoxProfile firefoxProfile = new FirefoxProfile();      
//    	WebDriver driver = new FirefoxDriver(firefoxBinary, firefoxProfile);
    	//WebDriver driver=new FirefoxDriver();
    	//browser.get("https://www.redbus.in/?gclid=EAIaIQobChMIgO6DzoSh3AIVljUrCh0eggrGEAAYASAAEgJxVvD_BwE");
    	//getDriver().get("https://www.redbus.in/?gclid=EAIaIQobChMIgO6DzoSh3AIVljUrCh0eggrGEAAYASAAEgJxVvD_BwE");
    	driver.get("https://www.redbus.in/?gclid=EAIaIQobChMIgO6DzoSh3AIVljUrCh0eggrGEAAYASAAEgJxVvD_BwE");   
    	System.out.println("title"+driver.getTitle());
    	//driver.manage().notify();
    	PageObject obj1;
    	driver.findElement(By.xpath("//*[@id='src']")).sendKeys(departure_City);
    	Thucydides.takeScreenshot();
    	//departureCity.sendKeys(departure_City);
    	//DestinationCity.sendKeys(Destination_place);
    	driver.findElement(By.xpath("//*[@id='dest']")).sendKeys(Destination_place);
    	//obj1.getDriver(driver);
    	//getDriver().
    	//h3[@class='helper-text']
    	String webtext=driver.findElement(By.xpath("//h3[@class='helper-text']")).getText();
		Assert.assertEquals(text, webtext);
    	wait(500);
    	driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();
    	driver.findElement(By.xpath("//*[@id='search']/div/div[3]/span")).click();
    	//Actions action = new Actions(driver);
    	//action.moveToElement(driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label"))).doubleClick().build().perform();
    	//*[@id="search"]/div/div[3]/span                                                                                                         
    	 String oldTab = driver.getWindowHandle();
		    driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']")).click();
		    driver.switchTo().window(oldTab);
    	System.out.println(Onward_date);
    	System.out.println(Return_date);
    	//getDriver().getCurrentUrl();
    	//driver.close();
//    	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
//    	 
//    	 //get current date time with Date()
//    	 Date date = new Date();
//    	 
//    	 // Now format the date
//    	 String date1= dateFormat.format(date);
//    	 
//    	 // Print the Date
//    	 System.out.println("date"+date1);
//    	 String date2[]=date1.split("/");
//    	 int Intdate=Integer.parseInt(date2[2]);
//    	 
//    	 //*[@id="rb-calendar_onward_cal"]/table/tbody/tr[1]/td[2]
    	 String Onward_date1[]=Onward_date.split("-");
//    	 int IntOnwarddate1=Integer.parseInt(Onward_date1[2]);
//    	 if(IntOnwarddate1<Intdate)
//    	 {
//    		 System.out.println("cannot get past date");
//    		
//    	 }
//    	 else
//    	 {
//    		 String details=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText();
//    		 String details1[]=details.split(" ");
//    		 int yeardetails=Integer.parseInt(details1[1]);
//    		 if(yeardetails>IntOnwarddate1)
//    		 {
//    			 System.out.println("cannot get past date");
//    			 
//    		 }
//    		 else
//    		 {
//    			 
//    			 List<WebElement> columns = driver.findElements(By.tagName("td"));
//    			    for (WebElement cell: columns)
//    		        {
//    		           if (cell.getText().equals(Onward_date1[0]))
//    		            {
//    		                cell.click();
//    		                break;
//    		            }
//    		        
//    		        }
//    		        }
//    	 }
    	 //driver.switchTo().defaultContent();
    	 driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']")).click();
    	 List<WebElement> columns = driver.findElements(By.tagName("td"));
		    for (WebElement cell: columns)
	        {
	           if (cell.getText().equals(Onward_date1[0]))
	            {
	                cell.click();
	                
	                break;
	            }
	        
	        }
		   // waitABit(400);
//		    Alert alert = driver.switchTo().alert();
//            alert.accept();
//		    driver.switchTo().alert().dismiss();
		   // driver.findElement(By.xpath("//*[@id='mBWrapper']/main/section/div/h1")).click();
		    
		  //driver.switchTo().alert().dismiss();
//		    String oldTab1 = driver.getWindowHandle();
//		    driver.findElement(By.xpath("//*[@id='mBWrapper']/main/section/div/h1")).click();
//		    driver.switchTo().window(oldTab1);
		    driver.findElement(By.xpath("//*[@id='search_btn']")).click();
//		    driver.navigate().forward();
		    
		    //driver.switchTo().frame(1);
//		    String oldTab = driver.getWindowHandle();
//		    driver.findElement(By.xpath("//*[@id='mBWrapper']/main/section/div/h1")).click();
//		    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
//		    newTab.remove(oldTab);
//		    // change focus to new tab
//		    driver.switchTo().window(newTab.get(0));
//		    
//
//		    // Do what you want here, you are in the new tab
//
//		    driver.close();
//		    // change focus back to old tab
		    //driver.switchTo().window(oldTab);
		    String result=driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div[1]/span[1]")).getText();
		    System.out.println("Number of Buses available :" +result);
		    //File srcfile=((TakesScreenshot).driver).getScreenshotAs(OutputType.FILE);
		    //Serenity.takeScreenshot();
		    
    	 driver.close();
        //$("#search-query").sendKeys(keywords);          
        //searchButton.click();                           
    }
	@SuppressWarnings("deprecation")
	public void validateText( String text)
	{
		WebDriver driver=new ChromeDriver();
		String webtext=driver.findElement(By.xpath("//*[@id='mBWrapper']/main/section/div/h3")).getText();
		Assert.assertEquals(text, webtext);
	}

}

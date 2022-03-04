package fi.examSelinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
//	WebDriver driver;
//	public void launchBrowser() throws InterruptedException {
//		
//		System.setProperty("webdriver.edge.driver", "C:/Users/hi/Desktop/msedgedriver.exe");
//
//		driver = new EdgeDriver();
//		driver.get("https://www.flipkart.com");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
//		Thread.sleep(1000);
//		System.out.println("user name entered successfully");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("submit");
//		
//		Thread.sleep(2000);
//		System.out.println("password entered successfully");
//	}
//    public static void main( String[] args ) throws InterruptedException
//    {
//        App ob=new App();
//        ob.launchBrowser();
//    }
	
		
	ChromeDriver driver;
	String url = "http://www.flipkart.com";

	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(url);

	}

	public void loginToFlipkart() {
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']")).sendKeys("testuser@abc.com");
		
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']")).sendKeys("Test@1234");
		
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		App ob = new App();
		ob.invokeBrowser();

		ob.loginToFlipkart();
	}
	}
	
		




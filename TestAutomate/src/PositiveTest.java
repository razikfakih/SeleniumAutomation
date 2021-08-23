import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PositiveTest {
	
	private WebDriver driver;
	
	@Before
	public void launch() 
	{
		System.setProperty("webdriver.chrome.driver", "src/Driver/chromedriver.exe");
	
		driver = new ChromeDriver();
		
		driver.get("https://car.iselect.com.au/car/compare-car-insurance/gatewayStore");
		
		driver.manage().window().maximize();
		
	}
	
	//Scenario 1 Cond No.2 - About Your Car page excluding additional fields (Positive test)
	@Test
	public void executeTest() throws InterruptedException, AWTException
	{
	
	if(!driver.findElements(By.xpath(".//h2[contains(text(),'Find your car')]")).isEmpty())
			{
		Robot robot = new Robot();
	
		
		driver.findElement(By.xpath(".//div[contains(text(),'Make')]")).click();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_S);
		Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.xpath(".//div[contains(text(),'Model')]")).click();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_7);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyPress(KeyEvent.VK_0);
		Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	 
	    driver.findElement(By.xpath(".//div[contains(text(),'Year')]")).click();
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_1);
		robot.keyPress(KeyEvent.VK_9);
		robot.keyPress(KeyEvent.VK_8);
		robot.keyPress(KeyEvent.VK_0);
		Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    

	    driver.findElement(By.xpath(".//div[contains(text(),'Car type or series')]")).click();
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_K);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_G);
		Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    
	    
	    
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.xpath(".//span[contains(text(),'Comprehensive')]/../..")).click();
	   
	    
	    driver.findElement(By.xpath(".//h2[contains(text(),'Why')]/../div[4]/div/div/div/span")).click();
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_M);
		Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    
	    
	    driver.findElement(By.xpath(".//div[contains(text(),'anti')]/../div[3]/div/div/div/span")).click();
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.xpath(".//div[contains(text(),'fitted')]/../../../div[5]/div/button[2]")).click();
	   
	    driver.findElement(By.xpath(".//div[contains(text(),'damage')]/../../../div[2]/div/div/button[2]")).click();
	    
	    driver.findElement(By.xpath(".//div[contains(text(),'currently')]/../div[10]/div/div/div/span")).click();
	    Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_O);
		Thread.sleep(1000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    
	    driver.findElement(By.xpath(".//div[contains(text(),'advice')]/../label/span")).click();
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath(".//button[contains(text(),'Continue')]")).click();
	    
	    WebDriverWait wait = new WebDriverWait(driver,5);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//h1[contains(text(),'Usage')]")));
	    
	    if(!driver.findElements(By.xpath(".//h1[contains(text(),'Usage')]")).isEmpty())
	    {
	    	System.out.println("First page completed, Test Passed");
	    }
			}
	
	}

	@After
	public void endTest() {
		driver.close();
	}
}

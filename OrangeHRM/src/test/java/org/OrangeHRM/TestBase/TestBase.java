package com.ToolsQA.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	public static WebDriver driver;
	public Properties OR;
	public File f1;
	public FileInputStream file;
	

	
	
	public void getbrowser(String browser){
		
		if(System.getProperty("os.name").contains("Window")){
			System.out.println(System.getProperty("os.name"));
			System.out.println(System.getProperty("user.dir"));
			
			if(browser.equalsIgnoreCase("Firefox")){
				System.setProperty("webdriver.gecko.driver", System.getProperty("User.dir")+"/Drivers/gecko.exe");
				driver = new FirefoxDriver();
			}
			
			else if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			}
		}
		
		if(System.getProperty("os.name").contains("Mac")){
			
			if(browser.equalsIgnoreCase("Firefox")){
				System.setProperty("webdriver.gecko.marionette", System.getProperty("User.dir")+"/Drivers/gecko");
				driver = new FirefoxDriver();
			}
			
			else if(browser.equalsIgnoreCase("chrome")){
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver_win32\\chromedriver");
				driver = new ChromeDriver();
			}
		}
		
		
	}
	public void LoadPropertiesData() throws IOException{
		
		OR = new Properties();
		
		f1 = new File(System.getProperty("user.dir")+"\\src\\com\\ToolsQA\\ConfigFiles\\Config.properties");
		file = new FileInputStream(f1);
		OR.load(file);
		
		f1 = new File(System.getProperty("user.dir")+"\\src\\com\\ToolsQA\\ConfigFiles\\or.properties");
		file = new FileInputStream(f1);
		OR.load(file);
	}
	
	public void GetPropertiesData(){
		
		
		
	}
	
	public void GetSceenShot(String ImageName) throws IOException{
		
		if(ImageName.equalsIgnoreCase("")){
			ImageName= "Blank";
		}
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		String Filelocation = System.getProperty("user.dir")+"\\src\\com\\ToolsQA\\Screenshots\\";
		
		Calendar calendar = Calendar.getInstance();
		
		SimpleDateFormat date = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		
		String ActualFileName = Filelocation+ImageName+"_"+date.format(calendar.getTime())+".png";
		
		File destFile = new File(ActualFileName);
		
		FileUtils.copyFile(srcFile, destFile);
	}
	public WebElement WaitForElementWithPollingIntervel(WebDriver driver, long time, WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.pollingEvery(5, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	public WebElement WaitForElement(WebDriver driver, long time, WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	public void ImplicitWait(WebDriver driver, long time){
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
		
	
	public static void main(String[] args) throws IOException {
		TestBase test = new TestBase();
		test.LoadPropertiesData();
		System.out.println(System.getProperty("user.dir"));
		//test.getbrowser("chrome");
		System.out.println(test.OR.getProperty("URl"));
	}

}

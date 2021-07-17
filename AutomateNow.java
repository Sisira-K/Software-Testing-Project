package Project;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class AutomateNow {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		//TC01:Launch the browser and open AUTOMATENOW website
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Desktop\\Selenium jar\\geckodriver.exe");
		WebDriver w=new FirefoxDriver();
		Thread.sleep(3000);
		w.get("https://automatenow.io/");
		
		//TC02: To check the functionality of Home icon
		w.findElement(By.linkText("Home")).click();	
		
		//TC03: To check the functionality of Blog icon
		w.findElement(By.xpath("//a[contains(text(),'Blog')]")).click();
		JavascriptExecutor js=(JavascriptExecutor) w;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		System.out.println("Page end");
		
		//TC04: To check the functionality of Subscribe button with valid Email ID
		w.findElement(By.name("email")).sendKeys("sisira@gmail.com");
		w.findElement(By.xpath("//button[contains(text(),'Subscribe')]")).click();
		w.navigate().back();
		w.findElement(By.name("email")).clear();
		
		//TC05: To check the functionality of Subscribe button with invalid Email ID
		w.findElement(By.name("email")).sendKeys("sisira@gm.ab");
		w.findElement(By.xpath("//button[contains(text(),'Subscribe')]")).click();
		//DEFECT1
		
		//TC06: To check the functionality of Vlog icon
		Actions a=new Actions(w);
		a.moveToElement(w.findElement(By.linkText("Vlog"))).perform();
		
		//TC07: To check the functionality of Automation tools field
		w.findElement(By.linkText("Automation Tools")).click();
		
		//TC08: To check the functionality of Selenium field
		a.moveToElement(w.findElement(By.linkText("Vlog"))).perform();
		w.findElement(By.linkText("Selenium")).click();
		
		//TC09: To check the functionality of Intro to selenium webdriver field
		a.moveToElement(w.findElement(By.linkText("Vlog"))).perform();
		w.findElement(By.linkText("Intro to Selenium WebDriver")).click();
		Thread.sleep(3000);
		
		//TC10: To check the functionality of Intermediate selenium webdriver field
		a.moveToElement(w.findElement(By.linkText("Vlog"))).perform();
		w.findElement(By.linkText("Intermediate Selenium WebDriver")).click();
		Thread.sleep(3000);
		
		//TC11: To check the functionality of Selenium 4 field
		a.moveToElement(w.findElement(By.linkText("Vlog"))).perform();
		w.findElement(By.linkText("Selenium 4")).click();
		Thread.sleep(3000);
		
		//TC12: To check the functionality of  Software automation fundamentals field
		a.moveToElement(w.findElement(By.linkText("Vlog"))).perform();
		w.findElement(By.linkText("Software Automation Fundamentals")).click();
		Thread.sleep(3000);
				
		//TC13: To check the functionality of Webinars field
		a.moveToElement(w.findElement(By.linkText("Vlog"))).perform();
		w.findElement(By.linkText("Webinars")).click();
		
		//TC14: To check the functionality of Web element locators field
		a.moveToElement(w.findElement(By.linkText("Vlog"))).perform();
		w.findElement(By.linkText("Web Element Locators")).click();
				
		//TC15: To check the functionality of Sandbox field
		w.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[4]/a")).click();
		
		//TC16: To check the functionality of Form fields button
		w.findElement(By.linkText("Form Fields")).click();
		w.findElement(By.id("g1103-inputfield")).sendKeys("abcd");
		w.findElement(By.xpath("//label[contains(text(),'Option 1')]")).click();
		w.findElement(By.name("g1103-radiobuttons")).click();
		Select s=new Select(w.findElement(By.id("g1103-dropdownmenu")));
		s.selectByIndex(4);
		w.findElement(By.xpath("//li[contains(text(),'Item 1')]")).click();
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/main[1]/article[1]/div[1]/div[1]/form[1]/p[2]/button[1]")).click();
		w.navigate().back();
		w.navigate().back();
		//DEFECT2
		
		//TC17: To check the functionality of Popups button
		w.findElement(By.linkText("Popups")).click();
		
		//TC18: To check the functionality of Alert Popup button
		w.findElement(By.id("alert")).click();
		Alert a1=w.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(a1.getText());
		a1.accept();
		
		//TC19: To check the functionality of Confirm Popup button
		w.findElement(By.id("confirm")).click();
		Alert a2=w.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(a2.getText());
		a2.dismiss();
		
		//TC20: To check the functionality of Prompt Popup button
		w.findElement(By.id("prompt")).click();
		Alert a3=w.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(a3.getText());
		a3.sendKeys("Sisira");
		a3.accept();
		w.navigate().back();
		
		//TC21: To check the functionality of Tables button
		w.findElement(By.linkText("Tables")).click();
		w.navigate().back();
		
		//TC22: To check the functionality of Modals button
		w.findElement(By.linkText("Modals")).click();
		
		//TC23: To check the functionality of Simple modal button
		w.findElement(By.id("simpleModal")).click();
		w.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/button[1]")).click();
		Thread.sleep(2000);
		
		//TC24: To check the functionality of Form modal button
		w.findElement(By.id("formModal")).click();
		
		//TC25: To check the functionality of Submit button with valid details
		w.findElement(By.id("g1051-name")).sendKeys("Anju");
		w.findElement(By.id("g1051-email")).sendKeys("anju@gmail.com");
		w.findElement(By.name("g1051-message")).sendKeys("Hello");
		w.findElement(By.xpath("//button[@type='submit']")).click();
		
		//TC26: To check the functionality of Submit button with invalid name
		w.findElement(By.id("formModal")).click();
		w.findElement(By.id("g1051-name")).sendKeys("@#123");
		w.findElement(By.id("g1051-email")).sendKeys("anju@gmail.com");
		w.findElement(By.name("g1051-message")).sendKeys("Hello");
		w.findElement(By.xpath("//button[@type='submit']")).click();
		//DEFECT3
		
		//TC27: To check the functionality of Submit button with invalid Email ID
		w.findElement(By.id("formModal")).click();
		w.findElement(By.id("g1051-name")).sendKeys("sisira");
		w.findElement(By.id("g1051-email")).sendKeys("gmail@sisira-com");
		w.findElement(By.name("g1051-message")).sendKeys("Hello");
		w.findElement(By.xpath("//button[@type='submit']")).click();
		//DEFECT4
		
		//TC28: To check the functionality of Calendars button
		w.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li[4]/a")).click();
		w.findElement(By.linkText("Calendars")).click();
		w.findElement(By.xpath("//input[@id='g1065-selectorenteradate']")).click();
		w.findElement(By.xpath("//a[contains(text(),'30')]")).click();
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/main[1]/article[1]/div[1]/div[1]/form[1]/p[1]/button[1]")).click();
		w.navigate().back();
		w.navigate().back();
		
		//TC29: To check the functionality of Hover button
		w.findElement(By.linkText("Hover")).click();
		Actions b=new Actions(w);
		b.moveToElement(w.findElement(By.id("mouse_over"))).perform();
		w.navigate().back();
		
		//TC30: To check the functionality of Search Boxes button
		w.findElement(By.linkText("Search Boxes")).click();
		w.findElement(By.id("wp-block-search__input-1")).sendKeys("JMeter");
		w.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
		//TC31: To check the functionality of Continue reading link
		js.executeScript("window.scrollBy(0,2000)","");
		w.findElement(By.partialLinkText("Continue readi")).click();
		js.executeScript("window.scrollBy(0,6000)","");
		w.navigate().back();
		w.navigate().back();
		w.navigate().back();
		
		//TC32: To check the functionality of Window Operations button
		w.findElement(By.linkText("Window Operations")).click();
		
		//TC33: To check the functionality of New tab button
		w.findElement(By.xpath("//button[@onclick='newTab()']")).click();
		Set <String> windows=w.getWindowHandles();
		Iterator <String> i=windows.iterator();
		String p=i.next();
		String c1=i.next();
		
		w.switchTo().window(p);
		w.switchTo().window(c1);
		w.switchTo().window(p);
		System.out.println("Done");
		
		//TC34: To check the functionality of Replace window button
		w.findElement(By.xpath("//button[@onclick='newWindowSelf()']")).click();
		w.navigate().back();
		
		//TC35: To check the functionality of New window button
		w.findElement(By.xpath("//button[@onclick='newWindow()']")).click();
		Set <String> windows2=w.getWindowHandles();
		Iterator <String> I=windows2.iterator();
		String p2=I.next();
		String c2=I.next();
		w.switchTo().window(p2);
		w.switchTo().window(c2);
		Thread.sleep(1000);
		w.manage().window().maximize();
		w.switchTo().window(p2);
		w.navigate().back();
		 
		//TC36: To check the functionality of File upload button
		w.findElement(By.linkText("File Upload")).click();
		w.findElement(By.id("file_upload")).sendKeys("C:\\Users\\DELL\\Desktop\\Edubridge\\Sisira.pdf");
		Thread.sleep(2000);
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/main[1]/article[1]/div[1]/div[1]/form[1]/p[1]/input[1]")).click();
		w.navigate().back();
		
		//TC37: To check the functionality of Gestures button
		w.findElement(By.linkText("Gestures")).click();
		Thread.sleep(3000);
		w.navigate().back();
			
		//TC38: To check the functionality of IFrames button
		w.findElement(By.linkText("IFrames")).click();
		System.out.println(w.findElement(By.xpath("//p[contains(text(),'I am an iframe.')]")).getText());
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		
		//TC39: To check the functionality of Automatenow field
		w.findElement(By.xpath("//a[@class='site-name']")).click();
		w.navigate().back();
		w.navigate().back();
		
		//TC40: To check the functionality of Broken images button
		w.findElement(By.linkText("Broken Images")).click();
		w.navigate().back();

		//TC41: To check the functionality of Carousel button
		w.findElement(By.linkText("Carousel")).click();
		for(int j=0;j<4;j++)
		{
		   w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/main[1]/article[1]/div[1]/div[2]/div[1]/div[1]/button[2]")).click();
		}
		w.navigate().back();
				
		//TC42: To check the functionality of Accordions button
		w.findElement(By.linkText("Accordions")).click();
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/main[1]/article[1]/div[1]/div[1]/div[1]/details[1]/summary[1]")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/main[1]/article[1]/div[1]/div[1]/div[1]/details[1]/summary[1]")).click();
		w.navigate().back();		
		
		//TC43: To check the functionality of Broken links button
		w.findElement(By.linkText("Broken Links")).click();
		System.out.println(w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/main[1]/article[1]/div[1]/p[1]")).getText());
		w.navigate().back();
		
		//TC44: To check the functionality of Ads button
		w.findElement(By.linkText("Ads")).click();
		Thread.sleep(6000);
		System.out.println(w.findElement(By.xpath("//div[@id='pum_popup_title_1272']")).getText());
		w.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/button[1]")).click();
		w.navigate().back();

		//TC45: To check the functionality of About field
		w.findElement(By.linkText("About")).click();
		
		//TC46: To check the functionality of Contact field
		w.findElement(By.linkText("Contact")).click();
		
		//TC47: To check the functionality of Submit button with valid details
		w.findElement(By.id("g7-name")).sendKeys("Sisira");
		w.findElement(By.id("g7-email")).sendKeys("sisira@gmail.com");
		w.findElement(By.id("g7-website")).sendKeys("https://automatenow.io/");
		w.findElement(By.id("contact-form-comment-g7-message")).sendKeys("Good website");
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/main[1]/article[1]/div[1]/div[2]/div[2]/div[1]/form[1]/p[1]/button[1]")).click();
		w.findElement(By.linkText("go back")).click();
				
		//TC48: To check the functionality of Submit button with invalid Name
		w.findElement(By.id("g7-name")).sendKeys("*%+-=");
		w.findElement(By.id("g7-email")).sendKeys("sisira@gmail.com");
		w.findElement(By.id("g7-website")).sendKeys("https://automatenow.io/");
		w.findElement(By.id("contact-form-comment-g7-message")).sendKeys("Good website");
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/main[1]/article[1]/div[1]/div[2]/div[2]/div[1]/form[1]/p[1]/button[1]")).click();
		TakesScreenshot t1=(TakesScreenshot) w;
		File src=t1.getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("F:\\Screenshot\\defect4.png"));
		w.findElement(By.linkText("go back")).click();
		//DEFECT5
				
		//TC49: To check the functionality of Submit button with invalid Email ID
		w.findElement(By.id("g7-name")).sendKeys("Sisira");
		w.findElement(By.id("g7-email")).sendKeys("sisira@gma.c.c");
		w.findElement(By.id("g7-website")).sendKeys("https://automatenow.io/");
		w.findElement(By.id("contact-form-comment-g7-message")).sendKeys("Good website");
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/main[1]/article[1]/div[1]/div[2]/div[2]/div[1]/form[1]/p[1]/button[1]")).click();
		TakesScreenshot t2=(TakesScreenshot) w;
		File src1=t2.getScreenshotAs(OutputType.FILE);
		Files.copy(src1,new File("F:\\Screenshot\\defect5.png"));
		w.findElement(By.linkText("go back")).click();
		//DEFECT6	
		
		//TC50: To check the functionality of Give a review button
		w.findElement(By.linkText("Home")).click();	
		js.executeScript("window.scrollBy(0,6000)","");
		w.findElement(By.xpath("//button[contains(text(),'GIVE A REVIEW')]")).click();
		
		//TC51: To check the functionality of Submit review button with valid details
		w.findElement(By.name("rName")).sendKeys("Sisira");
		w.findElement(By.name("rEmail")).sendKeys("sisira@gmail.com");
		w.findElement(By.name("rTitle")).sendKeys("Good");
		w.findElement(By.id("rr_star_4")).click();
		w.findElement(By.name("rText")).sendKeys("Good website for learning automation");
		w.findElement(By.name("submitButton")).click();
		w.navigate().back();
		w.navigate().back();
				
		//TC52: To check the functionality of Submit review button with invalid details
		w.findElement(By.xpath("//button[contains(text(),'GIVE A REVIEW')]")).click();
		w.findElement(By.name("rName")).sendKeys("123");
		w.findElement(By.name("rEmail")).sendKeys("gma@sisira..c@");
		w.findElement(By.name("rTitle")).sendKeys("456");
		w.findElement(By.id("rr_star_4")).click();
		w.findElement(By.name("rText")).sendKeys("+-*");
		w.findElement(By.name("submitButton")).click();
		TakesScreenshot t3=(TakesScreenshot) w;
		File src2=t3.getScreenshotAs(OutputType.FILE);
		Files.copy(src2,new File("F:\\Screenshot\\defect6.png"));
		w.navigate().back();
		w.navigate().back();
		//DEFECT7
		
		//TC53: To check the functionality of Submit review button with blank details
		w.findElement(By.xpath("//button[contains(text(),'GIVE A REVIEW')]")).click();
		w.findElement(By.name("rName")).sendKeys("");
		w.findElement(By.name("rEmail")).sendKeys("");
		w.findElement(By.name("rTitle")).sendKeys("");
		w.findElement(By.id("rr_star_4")).click();
		w.findElement(By.name("rText")).sendKeys("");
		w.findElement(By.name("submitButton")).click();
		
		//TC54: To check the functionality of Become a sponsor link
		w.findElement(By.linkText("Home")).click();
		w.findElement(By.linkText("sponsor")).click();
		w.navigate().back();
						
		//TC55: To check the Title of the current page		
		System.out.println(w.getTitle());
					
		//TC56: To check the URL of the current page	
		System.out.println(w.getCurrentUrl());
		
		//TC57: To check and display number of links available on page
		List<WebElement> link=w.findElements(By.tagName("a"));
		int total_links=link.size();
		System.out.println("Total links:"+total_links);
					
		w.close();
						
	}

}

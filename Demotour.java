package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Demotour {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Desktop\\Selenium jar\\geckodriver.exe");
		WebDriver w=new FirefoxDriver();
		w.get("http://demo.guru99.com/test/newtours/index.php");
		
		w.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Selenium')]")).click();
		w.findElement(By.linkText("Table Demo")).click();
		w.navigate().back();
		Thread.sleep(2000);
		
		w.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Selenium')]")).click();
		w.findElement(By.xpath("//a[contains(text(),'Yahoo')]")).click();
		w.navigate().back();
		
		w.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Selenium')]")).click();
		w.findElement(By.linkText("File Upload")).click();
		w.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\DELL\\Desktop\\SISIRA CHINJU\\Sisira_K.pdf");
		w.findElement(By.id("submitbutton")).click();
		
		w.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Selenium')]")).click();
		w.findElement(By.linkText("Drag and Drop Action")).click();
		WebElement drag=w.findElement(By.partialLinkText("SALES"));
		WebElement drop=w.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
		Actions a=new Actions(w);
		a.dragAndDrop(drag,drop).build().perform();
		WebElement drag1=w.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]"));
		WebElement drop1=w.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		a.dragAndDrop(drag1,drop1).build().perform();
		WebElement drag2=w.findElement(By.partialLinkText("BANK"));
		WebElement drop2=w.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		a.dragAndDrop(drag2,drop2).build().perform();
		
		w.findElement(By.linkText("Insurance Project")).click();
		w.findElement(By.linkText("Register")).click();
		Select s=new Select(w.findElement(By.name("title")));
		s.selectByValue("Miss");
		w.findElement(By.name("firstname")).sendKeys("Sisira");
		w.findElement(By.name("lastname")).sendKeys("K");
		w.findElement(By.name("phone")).sendKeys("7558865347");
		Select s1=new Select(w.findElement(By.name("year")));
		s1.selectByValue("1945");
		Select s2=new Select(w.findElement(By.name("month")));
		s2.selectByVisibleText("December");
		Select s3=new Select(w.findElement(By.name("date")));
		s3.selectByValue("10");
		w.findElement(By.name("licencetype")).click();
		Select s4=new Select(w.findElement(By.name("licenceperiod")));
		s4.selectByValue("5");
		Select s5=new Select(w.findElement(By.name("occupation")));
		s5.selectByValue("12");
		w.findElement(By.name("street")).sendKeys("abcde");
		w.findElement(By.name("city")).sendKeys("Thalassery");
		w.findElement(By.name("county")).sendKeys("India");
		w.findElement(By.name("post_code")).sendKeys("670642");
		w.findElement(By.name("email")).sendKeys("sisira@gmail.com");
		w.findElement(By.name("password")).sendKeys("chinju");
		w.findElement(By.name("c_password")).sendKeys("chinju");
		w.findElement(By.name("submit")).click();
		
		w.findElement(By.xpath("//input[@id='email']")).sendKeys("sisira@gmail.com");
		w.findElement(By.xpath("//input[@id='password']")).sendKeys("chinju");
		w.findElement(By.xpath("//input[@type='submit']")).click();
		w.findElement(By.xpath("/html/body/div[3]/form/input")).click();
		w.navigate().back();
		
		w.findElement(By.linkText("Agile Project")).click();
		w.findElement(By.xpath("//input[@type='text']")).sendKeys("test");
		w.findElement(By.xpath("//input[@type='password']")).sendKeys("test");
		w.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		Alert b=w.switchTo().alert();
		System.out.println(b.getText());
		b.accept();
		w.navigate().back();
		
		w.findElement(By.linkText("Bank Project")).click();
		w.findElement(By.xpath("//input[@type='text']")).sendKeys("123");
		w.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
		w.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		Alert c=w.switchTo().alert();
		System.out.println(c.getText());
		c.accept();
		w.navigate().back();
		
		w.findElement(By.linkText("Security Project")).click();
		w.findElement(By.xpath("//input[@type='text']")).sendKeys("test");
		w.findElement(By.xpath("//input[@type='password']")).sendKeys("test");
		w.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		Alert d=w.switchTo().alert();
		System.out.println(d.getText());
		d.accept();
		w.navigate().back();
		
		w.findElement(By.xpath("//a[contains(text(),'Telecom Project')]")).click();
		w.findElement(By.xpath("//a[contains(text(),'Add Customer')]")).click();
		w.findElement(By.xpath("//label[@for='done']")).click();
		w.findElement(By.id("fname")).sendKeys("Chinju");
		w.findElement(By.id("lname")).sendKeys("sisira");
		w.findElement(By.xpath("//input[@id='email']")).sendKeys("sisi@gmail.com");
		w.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Kerala");
		w.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("7553423433");
		w.findElement(By.xpath("//input[@type='submit']")).click();
		TakesScreenshot t=(TakesScreenshot)w;
		File src=t.getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("F:\\Screenshot\\demotour.png"));
		w.findElement(By.xpath("/html/body/section/div/div/ul/li/a")).click();
		
		w.findElement(By.linkText("Add Tariff Plan")).click();
		w.findElement(By.name("rental")).sendKeys("5000");
		w.findElement(By.name("local_minutes")).sendKeys("1000");
		w.findElement(By.name("inter_minutes")).sendKeys("2000");
		w.findElement(By.name("sms_pack")).sendKeys("1000");
		w.findElement(By.name("minutes_charges")).sendKeys("1500");
		w.findElement(By.name("inter_charges")).sendKeys("500");
		w.findElement(By.name("sms_charges")).sendKeys("400");
		w.findElement(By.xpath("//input[@type='submit']")).click();
		w.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		
		w.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/h3[1]/a[1]")).click();
		w.findElement(By.id("customer_id")).sendKeys("530909");
		w.findElement(By.xpath("//input[@type='submit']")).click();
		w.findElement(By.linkText("Telecom Project")).click();
		
		w.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[3]/div[2]/h3[1]/a[1]")).click();
		w.findElement(By.xpath("//input[@id='customer_id']")).sendKeys("530909");
		w.findElement(By.xpath("//input[@type='submit']")).click();
		
		w.findElement(By.linkText("Payment Gateway Project")).click();
		Select s6=new Select(w.findElement(By.name("quantity")));
		s6.selectByValue("4");
		w.findElement(By.xpath("/html/body/section/div/form/div/div[8]/ul/li/input")).click();
		w.findElement(By.id("card_nmuber")).sendKeys("1234567890123456");
		Select se=new Select(w.findElement(By.name("month")));
		se.selectByValue("2");
		Select sel=new Select(w.findElement(By.name("year")));
		sel.selectByValue("2022");
		w.findElement(By.id("cvv_code")).sendKeys("123");
		w.findElement(By.xpath("/html/body/section/div/form/div[2]/div/ul/li/input")).click();
		
		w.findElement(By.linkText("New Tours")).click();
		w.findElement(By.name("userName")).sendKeys("test");
		w.findElement(By.name("password")).sendKeys("test");
		w.findElement(By.name("submit")).click();
		
		w.findElement(By.partialLinkText("SEO")).click();
		w.findElement(By.linkText("Page-3")).click();
		JavascriptExecutor js=(JavascriptExecutor) w;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		Thread.sleep(3000);
		System.out.println("done");
		js.executeScript("window.scrollBy(0,-5000)","");
		Thread.sleep(3000);
		w.close();
	}

}

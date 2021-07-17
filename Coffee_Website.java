package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Coffee_Website {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Desktop\\Selenium jar\\geckodriver.exe");
		WebDriver w=new FirefoxDriver();
		w.get("https://driftaway.coffee/subscribe/");
		
		w.findElement(By.xpath("//span[contains(text(),'LOGIN')]")).click();
		w.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sisirasurendran1996@gmail.com");
		w.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Chinju10#");
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/main/article/div/div[2]/div[1]/div/form/p[3]/input[3]")).click();
		
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/main/article/div/div/div/div[2]/div/div[1]/a")).click();
		w.navigate().back();

		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/main/article/div/div/div/div[2]/div/div[2]/a/div[2]")).click();
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/main/article/div/div/div/div[2]/div[1]/a")).click();
		w.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys("sisira");
		w.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys("k");
		w.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys("Kannur");
		w.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("Thalassery");
		w.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).sendKeys("670642");
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/main/article/div/div/div/form/h3/button")).click();
		w.navigate().back();
		w.navigate().back();
		w.navigate().back();
		
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/main/article/div/div/div/div[2]/div/div[4]/a/div[1]")).click();
		w.navigate().back();
		
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/main/article/div/div/div/div[2]/div/div[5]/a/div[2]")).click();
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/main/article/div/div/div/form/p[5]/button")).click();
		w.navigate().back();
		
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/main/article/div/div/nav/ul/li[3]/a")).click();
		w.navigate().back();
		
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/main/article/div/div/nav/ul/li[6]/a")).click();
		w.navigate().back();
		
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/main/article/div/div/nav/ul/li[9]/a")).click();
		w.navigate().back();
		
		w.findElement(By.xpath("//div[contains(text(),'Yourself')]")).click();
		w.findElement(By.xpath("//a[@id='ngcChooseColdBrew']//span//div[@class='body-bigger-text'][contains(text(),'Cold Brew')]")).click();
		w.findElement(By.xpath("//label[@for='withoutmeshbag']")).click();
		
		w.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]")).click();
		JavascriptExecutor js=(JavascriptExecutor) w;
		js.executeScript("window.scrollBy(0,6000)","");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-6000)","");
		w.navigate().back();
		
		w.findElement(By.xpath("//div[contains(text(),'A gift')]")).click();
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/a/span/p")).click();
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[2]/div[6]/div[2]/a")).click();
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[2]/div[6]/div[2]/a")).click();
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[2]/div[3]/div/div[1]/div[1]/div[4]/a/span/p")).click();
		
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[2]/div[3]/div/div[1]/form[3]/div[1]/div/div[1]/input")).sendKeys("Sisira");
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[2]/div[3]/div/div[1]/form[3]/div[2]/div/div[1]/input")).sendKeys("Anju");
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[2]/div[3]/div/div[1]/form[3]/div[1]/div/div[2]/input")).sendKeys("K");
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[2]/div[3]/div/div[1]/form[3]/div[2]/div/div[2]/input")).sendKeys("S");
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[2]/div[3]/div/div[1]/form[3]/div[1]/div/div[3]/input")).sendKeys("sisirasurendran1996@gmail.com");
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[2]/div[3]/div/div[1]/form[3]/div[2]/div/div[4]/textarea")).sendKeys("A gift for you");
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[2]/div[6]/div[2]/a")).click();
		
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[2]/div[4]/div/div[1]/div[2]/div[1]/div/div/a[2]/span")).click();
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[2]/div[6]/div[2]/a")).click();
		w.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[2]/div[6]/div[2]/a")).click();
		
		TakesScreenshot t=(TakesScreenshot) w;
		File src=t.getScreenshotAs(OutputType.FILE);
		Files.copy(src,new File("F:\\Screenshot\\coffee.png"));
		
		w.findElement(By.xpath("//*[@id=\"billing_first_name\"]")).sendKeys("Sisira");
		w.findElement(By.xpath("//*[@id=\"billing_last_name\"]")).sendKeys("K");
		w.findElement(By.xpath("//*[@id=\"billing_address_1\"]")).sendKeys("Kannur,Kerala");
		w.findElement(By.xpath("//*[@id=\"billing_city\"]")).sendKeys("Thalassery");
		w.findElement(By.xpath("//*[@id=\"billing_postcode\"]")).click();
		
		w.findElement(By.xpath("/html/body/div/form/span[2]/div/div[2]/span/input")).sendKeys("1234567890123456");
		w.findElement(By.xpath("/html/body/div/form/span[2]/span/input")).sendKeys("1224");
		w.findElement(By.xpath("/html/body/div/form/span[2]/span/input")).sendKeys("456");
		
		Actions a1=new Actions(w);
		a1.moveToElement(w.findElement(By.xpath("/html/body/div[1]/header/div/nav[1]/div/ul/li[1]/a/span"))).perform();
		Actions b1=new Actions(w);
		b1.moveToElement(w.findElement(By.xpath("/html/body/div[1]/header/div/nav[1]/div/ul/li[1]/ul/li[2]/a/span"))).perform();
		w.findElement(By.xpath("/html/body/div[1]/header/div/nav[1]/div/ul/li[1]/ul/li[1]/ul/li[2]/a/span")).click();
		
		Actions a2=new Actions(w);
		a2.moveToElement(w.findElement(By.xpath("/html/body/div[1]/header/div/nav[1]/div/ul/li[2]/a/span"))).perform();
		w.findElement(By.xpath("/html/body/div[1]/header/div/nav[1]/div/ul/li[2]/ul/li[3]/a/span")).click();
		
		w.findElement(By.xpath("/html/body/div[1]/header/div/nav[1]/div/ul/li[3]/a/span")).click();
		JavascriptExecutor jss=(JavascriptExecutor) w;
		jss.executeScript("window.scrollBy(0,6000)","");
		Thread.sleep(3000);
		jss.executeScript("window.scrollBy(0,-6000)","");
		w.navigate().back();
		
		Actions a=new Actions(w);
		a.moveToElement(w.findElement(By.xpath("/html/body/div[1]/header/div/nav[2]/div/ul/li[1]/a/span"))).perform();
		w.findElement(By.xpath("/html/body/div[1]/header/div/nav[2]/div/ul/li[1]/ul/li[4]/a/span")).click();
		
		Actions b=new Actions(w);
		b.moveToElement(w.findElement(By.xpath("/html/body/div[1]/header/div/nav[2]/div/ul/li[2]/a/span"))).perform();
		w.findElement(By.xpath("/html/body/div[1]/header/div/nav[2]/div/ul/li[2]/ul/li[2]/a/span")).click();
		
		Actions c=new Actions(w);
		c.moveToElement(w.findElement(By.xpath("/html/body/div[1]/header/div/nav[2]/div/ul/li[3]/a/span"))).perform();
		w.findElement(By.xpath("/html/body/div[1]/header/div/nav[2]/div/ul/li[3]/ul/li/a/span")).click();
		
		w.findElement(By.xpath("/html/body/div[6]/div[1]/div/div/div/div[1]/a")).click();
				
	}
}

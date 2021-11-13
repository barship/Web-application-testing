import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Example {

    // Mooctest Selenium Example


    // <!> Check if selenium-standalone.jar is added to build path.

    public static void test(WebDriver driver) throws InterruptedException {
        // TODO Test script
        // eg:driver.get("https://www.baidu.com/")
        // eg:driver.findElement(By.id("wd"));
    	
//    	driver.get("https://www.baidu.com/");
//      System.out.printf("now accesss %s \n", driver.getCurrentUrl());
//      Thread.sleep(2000);
//  	driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("Python");
//  	Thread.sleep(500);
//  	driver.findElement(By.xpath("//*[@id=\"su\"]")).click();
//  	Thread.sleep(3000);
    	
    	driver.get("https://www.nowcoder.com/");
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/ul[1]/li[2]")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/ul/li[1]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[3]/div[2]/div/a[6]")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[3]/div[2]/div/a[1]")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[3]/div[2]/div/a[2]")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[4]/div[2]/div/a[2]")).click();
    	Thread.sleep(3000);
    	
    	//driver.get("https://www.nowcoder.com/contestRoom?categories=0&orderByHotValue=2&filter=0&mutiTagIds=639_640_1657");
    	//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div[1]/ul/li[3]")).click();
    	driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/ul/li[3]/a")).click();
    	Thread.sleep(3000);
    	//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/ul/li[1]/a/div[1]/div[3]")).click();
    	driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/ul/li[1]/a/div[1]")).click();
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/div[2]/a/span")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"jsCpn_7_popup_0\"]/div/div[2]/div[2]/div/a[2]")).click();
    	Thread.sleep(10000);
    	driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"runCode\"]")).click();
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/a")).click();
    	//driver.findElement(By.xpath("//*[@id=\"jsCpn_11_popup_0\"]/div[2]/a")).click();
    	//driver.findElement(By.xpath("//*[@id=\"jsCpn_13_popup_1\"]/div[2]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[5]/span[1]/a")).click();
    	//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[5]/span[1]/i")).click();
    	Thread.sleep(3000);
    	//driver.findElement(By.xpath("//*[@id=\"jsCpn_19_component_1\"]/div[1]/div")).sendKeys("≤‚ ‘");
    	//driver.findElement(By.xpath("//*[@id=\"jsCpn_23_component_1\"]/div[1]/div")).sendKeys("≤‚ ‘");
//    	driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div/div[1]")).sendKeys("≤‚ ‘");
//    	Thread.sleep(3000);
    	//driver.findElement(By.xpath("//*[@id=\"jsCpn_19_component_1\"]/div[1]/div")).sendKeys(Keys.ENTER);
    	//driver.findElement(By.xpath("//*[@id=\"jsCpn_23_component_1\"]/div[1]/div")).sendKeys(Keys.ENTER);
//    	driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div/div[1]")).sendKeys(Keys.ENTER);
//    	Thread.sleep(3000);
//    	driver.findElement(By.xpath("//*[@id=\"jsCpn_22_popup_3\"]/div[3]/a[1]")).click();
//    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]/a[1]")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[5]/span[2]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"aheadFinish\"]")).click();
    	Thread.sleep(3000);
    	
    	//driver.findElement(By.xpath("//*[@id=\"jsCpn_11_popup_0\"]/div[3]/a[1]")).click();
    	//Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]/a[1]")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/ul/li[2]")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"commentList\"]/div[1]/div[2]/div[3]/a")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[6]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/div/textarea")).sendKeys("—ßœ∞¡À");
    	Thread.sleep(3000);
    	//driver.findElement(By.xpath("//*[@id=\"jsCpn_35_component_1\"]/div[2]/div[2]/div/textarea")).sendKeys("—ßœ∞¡À");
    	//Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[6]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/a")).click();
    	Thread.sleep(3000);
    	//driver.findElement(By.xpath("//*[@id=\"jsCpn_35_component_1\"]/div[2]/div[2]/a")).click();
    	//Thread.sleep(3000);
    	
    }

    public static void main(String[] args) {
        // Run main function to test your script.
        WebDriver driver = new ChromeDriver();
        try { test(driver); } 
        catch(Exception e) { e.printStackTrace(); }
        finally { driver.quit(); }
    }

}

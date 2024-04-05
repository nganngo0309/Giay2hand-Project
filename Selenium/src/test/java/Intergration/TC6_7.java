/*
Test Steps
Step 1. Go to http://live.techpanda.org/
Step 2. Verify Title of the page
Step 3. Click on -> MOBILE -> menu
Step 4. In the list of all mobile , select SORT BY -> dropdown as name
Step 5. Verify all products are sorted by name
*/

package Intergration;

import driver.driverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;

@Test
public class TC6_7 {
    public static void TC6_7_() {
        int ts = 0;
        StringBuffer verErr = new StringBuffer();
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Step 2. Go to
            driver.get("https://www.giay2hand.com/");
            //Step 3.
            driver.findElement(By.linkText("TẤT CẢ")).click();
            Thread.sleep(200);
            driver.findElement(By.linkText("THƯƠNG HIỆU")).click();
            Thread.sleep(200);
            driver.findElement(By.linkText("NIKE")).click();
            Thread.sleep(200);
            //Step 4.
            driver.findElement(By.xpath("//*[@id='sort-by']/ul/li[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id='sort-by']/ul[1]/li[1]/ul[1]/li[5]/a[1]")).click();
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
}
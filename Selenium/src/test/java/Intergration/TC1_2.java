package Intergration;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class TC1_2 {
    //Tạo TK mới
    public static void TC1(){
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Step 1. Go to
            driver.get("https://www.giay2hand.com/");
            //Step 2.
            driver.findElement(By.xpath("//div[2]/img[1]")).click();
            Thread.sleep(200);
            driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[2]")).click();
            Thread.sleep(200);
            //Step 3. Hoàn thành form
            driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("Tran");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("Ngoc");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("ngochiennngmf02019@gmail.com");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@name=\"phone\"]")).sendKeys("0702504000");
            Thread.sleep(20);
            driver.findElement(By.xpath("//*[@id='creat_password']")).sendKeys("ngoch02019@");
            Thread.sleep(200);
            //Step 4.
            driver.findElement(By.xpath("//p[1]/input[1]")).click();
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
    @Test
    //Email đã tồn tại
    public static void TC2(){
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Step 1. Go to
            driver.get("https://www.giay2hand.com/");
            //Step 2.
            driver.findElement(By.xpath("//div[2]/img[1]")).click();
            Thread.sleep(200);
            driver.findElement(By.xpath("//div[3]/div[2]/div[1]/a[2]")).click();
            Thread.sleep(200);
            //Step 3.
            driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("Tran");
            Thread.sleep(200);
            driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("Ngoc");
            Thread.sleep(200);
            driver.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("ngochienn02019@gmail.com");
            Thread.sleep(200);
            driver.findElement(By.xpath("//*[@name=\"phone\"]")).sendKeys("0792554893");
            Thread.sleep(200);
            driver.findElement(By.xpath("//*[@id='creat_password']")).sendKeys("ngoch02019@");
            Thread.sleep(200);
            //Step 4.
            driver.findElement(By.xpath("//p[1]/input[1]")).click();
            Thread.sleep(2000);
            // Step 5.
            String abc1 = driver.findElement(By.xpath(".//div[1]/form[1]/div[1]")).getText();
            String abc2 = ("Email đã tồn tại.");
            assertEquals(abc1,abc2);
            Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        //Quit Browser session
        driver.quit();
    }
}

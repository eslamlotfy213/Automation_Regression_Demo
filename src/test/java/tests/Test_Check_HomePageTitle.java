package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Check_HomePageTitle {

    public WebDriver driver;



    @BeforeTest(alwaysRun = true)
    public void setDriver(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/webapp/");
    }


    @Test
    public void Check_HomePageheader(){

      String expected =driver.findElement(By.tagName("h1")).getText();
      Assert.assertEquals("Build pipeline and Automation Tests",expected);
        driver.quit();
    }





}

package com.example.OmahaTrailConditions;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.time.Duration;

public class CreateEventPost {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  JavascriptExecutor js;
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\teaga\\workspace4830\\group_project\\testCases\\lib\\win\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testCreateEventPost() throws Exception {
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/landing.html");
    driver.findElement(By.linkText("Create Post")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/create_post.html");
    driver.findElement(By.name("PostType")).click();
    new Select(driver.findElement(By.name("PostType"))).selectByVisibleText("Event");
    driver.findElement(By.xpath("//input[@value='Select Post Type']")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/post_event.html");
    driver.findElement(By.name("UserAlias")).click();
    driver.findElement(By.name("UserAlias")).clear();
    driver.findElement(By.name("UserAlias")).sendKeys("TestCase");
    driver.findElement(By.name("TrailName")).click();
    new Select(driver.findElement(By.name("TrailName"))).selectByVisibleText("Lewis & Clark");
    driver.findElement(By.name("PostBody")).click();
    driver.findElement(By.name("PostBody")).clear();
    driver.findElement(By.name("PostBody")).sendKeys("This is a test");
    driver.findElement(By.name("EventDateTime")).click();
    driver.findElement(By.name("EventDateTime")).clear();
    driver.findElement(By.name("EventDateTime")).sendKeys("Jan 20 @3pm");
    driver.findElement(By.xpath("//input[@value='Create Post']")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/InsertDB");
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/landing.html");
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

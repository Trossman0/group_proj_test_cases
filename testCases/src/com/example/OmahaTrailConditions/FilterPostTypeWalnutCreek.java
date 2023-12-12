package com.example.OmahaTrailConditions;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import java.io.File;

public class FilterPostTypeWalnutCreek {	
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
    ChromeOptions options = new ChromeOptions();
    options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testFilterPostTypeWalnutCreek() throws Exception {
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/landing.html");
    driver.findElement(By.linkText("Walnut Creek")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/walnutcreek.html");
    driver.findElement(By.linkText("ALL TRAILS")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/landing.html");
    driver.findElement(By.linkText("Walnut Creek")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/walnutcreek.html");
    driver.findElement(By.linkText("Platte")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/platte.html");
    driver.findElement(By.linkText("Walnut Creek")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/walnutcreek.html");
    driver.findElement(By.linkText("Lewis & Clark")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/lewisandclark.html");
    driver.findElement(By.linkText("Walnut Creek")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/walnutcreek.html");
    driver.findElement(By.linkText("Oxbow")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/oxbow.html");
    driver.findElement(By.linkText("Walnut Creek")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/walnutcreek.html");
    driver.findElement(By.linkText("Mandan")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/mandan.html");
    driver.findElement(By.linkText("Walnut Creek")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/walnutcreek.html");
    driver.findElement(By.linkText("Tranquility")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/tranquility.html");
    driver.findElement(By.linkText("Walnut Creek")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/walnutcreek.html");
    driver.findElement(By.linkText("Swanson")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/swanson.html");
    driver.findElement(By.linkText("Walnut Creek")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/walnutcreek.html");
    driver.findElement(By.linkText("Jewell")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/jewell.html");
    driver.findElement(By.linkText("Walnut Creek")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/walnutcreek.html");
    driver.findElement(By.linkText("Other")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/other.html");
    driver.findElement(By.linkText("Walnut Creek")).click();
    driver.get("http://ec2-3-21-185-132.us-east-2.compute.amazonaws.com:8080/csci4830-project1/walnutcreek.html");
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

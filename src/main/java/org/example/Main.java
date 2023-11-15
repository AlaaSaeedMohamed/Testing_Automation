package org.example;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


  public WebDriver driver;

  By selectCountry = By.xpath("//*[@id=\"CountryId\"]");
  By selectTimeZone = By.xpath("//*[@id=\"TimeZoneId\"]");
  By SelectStudent = By.xpath("//*[@id=\"Details_CompanyIndustryId\"]");
  By selectActivity = By.xpath("//*[@id=\"Details_CompanyRoleId\"]");
  By selectPeaople = By.xpath("//*[@id=\"Details_CompanySizeId\"]");

  public Main(WebDriver driver)
  {
    this.driver = driver;
  }

  public Main Login(){
    driver.manage().window().maximize();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/header/nav/ul/li[3]"));
    Dropdown.click();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/header/nav/ul/li[3]/ul/li[1]"));
    LoginButton.click();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    driver.findElement(By.xpath("//*[@id=\"Username\"]")).sendKeys("Alaa_Saeed_Mohammed_Mohammed");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("1Qaz2Wsx");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"login-page\"]/body/div[7]/section/div/div/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[4]/input"));
    submitButton.click();

    return new Main(driver);
  }

  public Main Register()
  {


    driver.manage().window().maximize();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/header/nav/ul/li[3]"));
    Dropdown.click();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    WebElement RegisterButton = driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/header/nav/ul/li[3]/ul/li[2]"));
    RegisterButton.click();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }



    driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Alaa");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Saeed");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("drgfurhgiurdrsg@gmail.com");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    driver.findElement(By.xpath("//*[@id=\"ConfirmEmail\"]")).sendKeys("drgfurhgiurdrsg@gmail.com");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    driver.findElement(By.xpath("//*[@id=\"Username\"]")).sendKeys("blablablablabn");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,1000)", "");

    WebElement country = driver.findElement(selectCountry);
    Select co = new Select(country);
    co.selectByVisibleText("Egypt");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    WebElement Timezone = driver.findElement(selectTimeZone);
    Select tz = new Select(Timezone);
    tz.selectByVisibleText("(UTC+02:00) Cairo");



    driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("1Qaz2Wsx");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("1Qaz2Wsx");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    js.executeScript("window.scrollBy(0,250)", "");

    WebElement student = driver.findElement(SelectStudent);
    Select st = new Select(student);
    st.selectByVisibleText("I am student");

    WebElement Submit = driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
    Submit.click();





    return new Main(driver);
  }


  public Main Purchase()
  {
    driver.manage().window().maximize();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    WebElement Dropdown = driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/header/nav/div[3]/div/ul[1]/li[2]"));
    Dropdown.click();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    WebElement WebApi = driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/header/nav/div[3]/div/ul[1]/li[2]/ul/li[6]"));
    WebApi.click();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    driver.findElement(By.xpath("//*[@id=\"product_attribute_31\"]")).sendKeys("www.google.com");

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    WebElement AddToCart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-6355\"]"));
    AddToCart.click();

    return  new Main(driver);
  }





}

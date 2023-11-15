import org.example.Main;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tests {


  public WebDriver driver;


  @BeforeTest
  public void setup()
  {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Omar Saeed\\Desktop\\Chromedriver\\chromedriver.exe");
    driver = new ChromeDriver();

    driver.get("https://www.nopcommerce.com/en");
  }
  //*[@id="en-page"]/body/div[7]/header/nav/ul/li[3]
  @Test
  public void testLogin()
  {
    Main obj = new Main(driver);
    obj.Login();
    //obj.Register();
    obj.Purchase();
  }

  @AfterTest
  public void close()
  {
    //driver.quit();
  }


}

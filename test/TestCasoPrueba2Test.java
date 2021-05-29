// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestCasoPrueba2Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  @Before
 public void setUp() {
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\migue\\Downloads\\AppCovid\\test\\geckodriver.exe");
    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
    capabilities.setCapability("marionette", true);
    capabilities.setCapability("binary", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
 
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testCasoPrueba2() {
    driver.get("http://localhost:8080/AppCovid/");
    driver.manage().window().setSize(new Dimension(1936, 1056));
    driver.findElement(By.name("nombre")).click();
    driver.findElement(By.name("nombre")).sendKeys("Yeison Vargas");
    driver.findElement(By.name("apellido")).click();
    driver.findElement(By.name("apellido")).sendKeys("2021-05-03");
    driver.findElement(By.name("apellido")).click();
    driver.findElement(By.name("apellido")).sendKeys("2021-05-05");
    driver.findElement(By.name("apellido")).click();
    driver.findElement(By.name("apellido")).sendKeys("2020-05-05");
    driver.findElement(By.name("apellido")).sendKeys("2019-05-05");
    driver.findElement(By.name("apellido")).sendKeys("2018-05-05");
    driver.findElement(By.name("apellido")).sendKeys("2017-05-05");
    driver.findElement(By.name("apellido")).sendKeys("2015-05-05");
    driver.findElement(By.name("apellido")).sendKeys("2013-05-05");
    driver.findElement(By.name("apellido")).sendKeys("2012-05-05");
    driver.findElement(By.name("apellido")).sendKeys("2011-05-05");
    driver.findElement(By.name("apellido")).sendKeys("2010-05-05");
    driver.findElement(By.name("apellido")).sendKeys("2009-05-05");
    driver.findElement(By.name("apellido")).sendKeys("2008-05-05");
    driver.findElement(By.name("apellido")).sendKeys("2007-05-05");
    driver.findElement(By.cssSelector("p:nth-child(7)")).click();
    driver.findElement(By.name("cedula")).click();
    driver.findElement(By.name("cedula")).sendKeys("47855415");
    driver.findElement(By.name("correo")).click();
    driver.findElement(By.name("correo")).sendKeys("yvargas");
    driver.findElement(By.name("correo")).sendKeys(Keys.DOWN);
    driver.findElement(By.name("correo")).sendKeys("yvargas62@uan.edu.co");
    driver.findElement(By.cssSelector(".boton:nth-child(13)")).click();
  }
}

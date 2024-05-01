import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.id;

public class NewTest {
    private WebDriver driver;
    private  By email_lodgin =By.className("style_input__dvx2f");
    private By password =By.className("style_input_password__6FtLe");
    private  By confirme_password=By.id("confirm_password_register");
    private  By inscription=By.className("style_btn__SUrW5");
    private  String path ="src/test/resources/driver/chromedriver.exe";
   @BeforeTest public void setUp(){
        System.setProperty("webdriver.chrome.driver",this.path);
        this.driver = new ChromeDriver();
    }
    @Test() public void navigateToChrome(){

        this.driver.get("https://ztrain-web.vercel.app/home");
        this.driver.findElement(By.id("style_avatar_wrapper__pEGIQ")).click();
//       this.driver.findElement(By.cssSelector("nav>div:last-child")).click();
//        this.driver.findElement(By.id("email_login")).sendKeys("test41test.com");
//        this.driver.findElement(By.cssSelector("email_login")).sendKeys("test41test.com");
//        this.driver.findElement(By.id("password_login")).sendKeys("12345678");
//        this.driver.findElement(By.id("btn_login")).click();
  //      this.driver.findElement(By.className("style_card_body_QuNEqx")).click();
 //       this.driver.findElement(By.cssSelector("nav>div:last-child")).click();

    }

    //connexion
    @Test()
    public  void SingUp(){
        this.driver.get("https://ztrain-web.vercel.app/home");
        this.driver.findElement(By.id("style_avatar_wrapper__pEGIQ")).click();
        this.driver.findElement(By.cssSelector(".MuiTabs-scroller>div>button:nth-child(2)")).click();
        this.driver.findElement(email_lodgin).sendKeys("hilary1@gmail.com");
        this.driver.findElement(password).sendKeys("hilarydiane1");
        this.driver.findElement(confirme_password).sendKeys("hilarydiane");
        this.driver.findElement(inscription).click();

    }

    @Test()
    public  void Login() throws InterruptedException {
        this.driver.get("https://ztrain-web.vercel.app/home");
        this.driver.findElement(By.id("style_avatar_wrapper__pEGIQ")).click();
        this.driver.findElement(email_lodgin).sendKeys("hilary@gmail.com");
        this.driver.findElement(password).sendKeys("hilarydiane");
        this.driver.findElement(By.id("btn_login")).click();
        Thread.sleep(5000);
        Assert.assertTrue(this.driver.findElement(By.cssSelector(".ant-badge")).isDisplayed());
            System.out.println("le bouton est activé");

    }

    @Test() public void  Logout() throws InterruptedException {
        Thread.sleep(10000);
        this.driver.findElement(By.id("style_avatar_wrapper__pEGIQ")).click();
        this.driver.findElement(By.cssSelector(".ant-menu>li:nth-child(5)")).click();
    }
   // @AfterTest() public  void CloseDriver(){  }
}

package org.example.pageObject;

import jdk.jfr.Description;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page{

    @FindBy(css = "nav>div:nth-child(4)")
    private WebElement avatar;

    @FindBy(className = "style_input__dvx2f")
    private  WebElement email_login;

    @FindBy(className = "style_input_password__6FtLe")
    private  WebElement motpasse_login;

    @FindBy(id = "btn_login")
    private WebElement connexion;

    private  String  URL="https://ztrain-web.vercel.app/home";
    public  void  navigate(){
        this.get(URL);
    }
    public void  fillemail(String email){
        this.email_login.sendKeys(email);
    }
    public void  fillpassword(String motpasse){
        this.motpasse_login.sendKeys(motpasse);
    }
//    @Test
//    @Description("Test de vérification de la page de connexion")



    public void login(String email , String motpasse){

        this.fillemail(email);
        this.fillpassword(motpasse);
        this.connexion.click();
    }
}

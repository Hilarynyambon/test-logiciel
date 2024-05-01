package org.example.pageObject;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page{

    private  By email_lodgin =By.className("style_input__dvx2f");
    private By password =By.className("style_input_password__6FtLe");

    @Test()
    public void login() throws InterruptedException {
        this.driver.get("https://ztrain-web.vercel.app/home");
        this.driver.findElement(By.id("style_avatar_wrapper__pEGIQ")).click();
        this.driver.findElement(email_lodgin).sendKeys("hilary@gmail.com");
        this.driver.findElement(password).sendKeys("hilarydiane");
        this.driver.findElement(By.id("btn_login")).click();
        Thread.sleep(5000);
        Assert.assertTrue(this.driver.findElement(By.cssSelector(".ant-badge")).isDisplayed());
        System.out.println("le bouton est activé");
    }



}

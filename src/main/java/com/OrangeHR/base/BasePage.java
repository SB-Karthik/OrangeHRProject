package com.OrangeHR.base;

import com.OrangeHR.driver.DriverManagerTL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected BasePage(){

    }

    protected void implicitWait(){
        DriverManagerTL.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    protected void enterInput(By by, String key){
        DriverManagerTL.getDriver().findElement(by).sendKeys(key);
    }


    protected void clickElement(By by){
        DriverManagerTL.getDriver().findElement(by).click();
    }

    protected WebElement getElement(By key){
        return DriverManagerTL.getDriver().findElement(key);
    }

    protected void presenceOfElement(final By elementLocation){
        new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    protected void visibilityOfElementLocated(final By elementLocation){
        new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }

    protected void elementToBeClickable(final By elementIdentifier){
        new WebDriverWait(DriverManagerTL.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementIdentifier));
    }
}

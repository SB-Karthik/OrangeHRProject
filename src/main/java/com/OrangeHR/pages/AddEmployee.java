package com.OrangeHR.pages;

import com.OrangeHR.base.BasePage;
import org.openqa.selenium.By;


public class AddEmployee extends BasePage {
    public AddEmployee(){

    }

    private final By add_button = By.xpath("//button[normalize-space()='Add']");
    private final By firstName = By.cssSelector("input[placeholder='First Name']");
    private final By lastName = By.cssSelector("input[placeholder='Last Name']");
    private final By submitCTA = By.cssSelector("button[type='submit']");

    public AddEmployee addDetails(){
        elementToBeClickable(add_button);
        clickElement(add_button);
        presenceOfElement(firstName);
        enterInput(firstName,"AAAA");
        enterInput(lastName,"SB");
        elementToBeClickable(submitCTA);
        clickElement(submitCTA);
        return this;
    }

}

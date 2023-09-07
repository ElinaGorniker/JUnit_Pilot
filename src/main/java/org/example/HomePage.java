package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
@FindBy(xpath = "//*[@id=\"title\"]")
    private WebElement home_page_title;


public String getTitle() {
    String titleText = home_page_title.getText();
    return titleText;
}



}

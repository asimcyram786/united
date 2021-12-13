package com.united.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.united.base.Hook.driver;

public class Home_Page {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div/div/div[1]/div[2]/div[2]/span/a[1]")
    private WebElement US_entry_requirements_link;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div/div/div[1]/div[2]/div[2]/span/a[2]")
    private WebElement excepted_travel_link;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[3]/div/div/div/div[1]/div[2]/div[2]/span/a[3]")
    private WebElement changing_trip_link;

    public WebElement getChanging_trip_link() {
        return changing_trip_link;
    }

    public WebElement getExcepted_travel_link() {
        return excepted_travel_link;
    }

    public WebElement getUS_entry_requirements_link() {
        return US_entry_requirements_link;
    }

    public Home_Page(){
       PageFactory.initElements(driver,this);
   }
}

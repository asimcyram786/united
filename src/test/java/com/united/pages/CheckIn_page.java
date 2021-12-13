package com.united.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.united.base.Hook.driver;

public class CheckIn_page {
    @FindBy(xpath = "//*[@id=\"checkInTab\"]")
    private WebElement checkIn_tap;

    @FindBy(xpath = "//*[@id=\"flightCheckInConfNumber_aria\"]")
    private WebElement confirmation_error_msg;

    @FindBy(xpath = "//*[@id=\"flightCheckInLastName_aria\"]")
    private WebElement last_name_error_msg;

    @FindBy(xpath = "//*[@id=\"formSubmitBtn\"]")
    private WebElement search_btn;

    @FindBy(xpath = "//*[@id=\"bookFlightCheckin\"]/div[4]/a")
    private WebElement checkIn_link;

    @FindBy(xpath = "//*[@id=\"main-content\"]/h1")
    private WebElement checkIn_airport_heading;

    @FindBy(xpath = "//*[@id=\"bookFlightCheckin\"]/div[3]/button")
    private WebElement mileplud_link;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[4]/div/main/h1")
    private WebElement checkIn_heading;

    public WebElement getCheckIn_heading() {
        return checkIn_heading;
    }

    public WebElement getMileplud_link() {
        return mileplud_link;
    }

    public WebElement getCheckIn_link() {
        return checkIn_link;
    }

    public WebElement getCheckIn_airport_heading() {
        return checkIn_airport_heading;
    }

    public WebElement getCheckIn_tap() {
        return checkIn_tap;
    }

    public WebElement getConfirmation_error_msg() {
        return confirmation_error_msg;
    }

    public WebElement getLast_name_error_msg() {
        return last_name_error_msg;
    }

    public WebElement getSearch_btn() {
        return search_btn;
    }

    public CheckIn_page() {
        PageFactory.initElements(driver, this);




    }
}



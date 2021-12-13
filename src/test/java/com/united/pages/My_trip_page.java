package com.united.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.united.base.Hook.driver;

public class My_trip_page {
    @FindBy(xpath = "//*[@id=\"tripsTab\"]")
    private WebElement my_trip_tap;

    @FindBy(xpath = "//*[@id=\"bookMyTrips\"]/div[4]/a")
    private WebElement find_trip_link;

    @FindBy(xpath = "//*[@id=\"myTripsSubmitBtn\"]")
    private WebElement search_btn;

    @FindBy(xpath = "//*[@id=\"myTripsConfirmationNumber_aria\"]")
    private WebElement confirmation_error_message;

    @FindBy(xpath = "//*[@id=\"myTripsLastName_aria\"]")
    private WebElement last_name_error;

    @FindBy(xpath = "//*[@id=\"bookMyTrips\"]/div[5]/span/a")
    private WebElement sign_btn;

    public WebElement getSign_btn() {
        return sign_btn;
    }

    public WebElement getLast_name_error() {
        return last_name_error;
    }

    public WebElement getConfirmation_error_message() {
        return confirmation_error_message;
    }

    public WebElement getSearch_btn() {
        return search_btn;
    }

    public WebElement getFind_trip_link() {
        return find_trip_link;
    }

    public WebElement getMy_trip_tap() {
        return my_trip_tap;
    }

    public My_trip_page (){
        PageFactory.initElements(driver,this);

    }
}

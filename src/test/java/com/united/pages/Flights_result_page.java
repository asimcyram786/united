package com.united.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hook.driver;

public class Flights_result_page {

    public List<WebElement> getFlight_list() {
        return flight_list;
    }

    @FindBy(xpath = "ul[class=\"flight-result-list\"]>li")
    private List<WebElement> flight_list;

    @FindBy(xpath = "//*[@id='flightResults-content'']/div[2]/div[1]/div/div[1]/div[2]/div")
     private WebElement result_flight;

    @FindBy(xpath = "//*[@id=flightResults-content'']/div[1]/div/div/div/div[1]/div[2]")
    WebElement flight_information;

    public WebElement getFlight_information() {
        return flight_information;
    }

    public WebElement getResult_flight() {
        return result_flight;
    }

    public Flights_result_page(){
        PageFactory.initElements(driver, this);
    }
}

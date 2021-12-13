package com.united.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.united.base.Hook.driver;

public class Header_Page {


    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div[2]/div[5]/header/div/div/div[1]/div/div/div/div[2]/nav/ul/li[1]/div/div/button")
    private WebElement English_link;

    @FindBy(css = "#app > div > div > div > div.page > div.relativePosition > header > div > div > div:nth-child(1) > div > div > div > div:nth-child(2) > nav > ul > li:nth-child(1) > div > div > button")
    WebElement language_change_verification;

    @FindBy(xpath = "//*[@id=\"headerNav0\"]/span")
    private WebElement book_link;
    @FindBy(xpath = "//*[@id=\"headerNav0-panel\"]/div")
    private WebElement book_verify_links;

    @FindBy(xpath = "//*[@id=\"headerNav1\"]/span")
    private WebElement my_trip_link;

    @FindBy(xpath = "//*[@id=\"headerNav1-panel\"]/div")
    private WebElement my_trip_verify_link;

    @FindBy(xpath = "//*[@id=\"headerNav2\"]/span")
    private WebElement travel_info_link;

    @FindBy(xpath = "//*[@id=\"headerNav2-panel\"]/div")
    private WebElement travel_info_verify_link;

    @FindBy(xpath = "//*[@id=\"headerNav3\"]/span")
    private WebElement mileage_plus_link;

    @FindBy(xpath = "//*[@id=\"headerNav3-panel\"]/div")
    private WebElement mileage_plus_link_verify;

    @FindBy(xpath = "//*[@id=\"headerNav4\"]/span")
    private WebElement deals_link;

    @FindBy(xpath = "//*[@id=\"headerNav4-panel\"]/div")
    private WebElement deal_verify_links;

    @FindBy(xpath = "//*[@id=\"headerNav5\"]/span")
    private WebElement help_link;

    @FindBy(xpath = "//*[@id=\"headerNav5-panel\"]/div")
    private WebElement help_verify_link;

    public WebElement getHelp_verify_link() {
        return help_verify_link;
    }

    public WebElement getHelp_link() {
        return help_link;
    }

    public WebElement getDeal_verify_links() {
        return deal_verify_links;
    }

    public WebElement getDeals_link() {
        return deals_link;
    }

    public WebElement getMileage_plus_link_verify() {
        return mileage_plus_link_verify;
    }

    public WebElement getMileage_plus_link() {
        return mileage_plus_link;
    }

    public WebElement getTravel_info_verify_link() {
        return travel_info_verify_link;
    }

    public WebElement getTravel_info_link() {
        return travel_info_link;
    }

    public WebElement getMy_trip_link() {
        return my_trip_link;
    }

    public WebElement getBook_verify_links() {
        return book_verify_links;
    }

    public WebElement getBook_link() {
        return book_link;
    }

    public WebElement getMy_trip_verify_link() {
        return my_trip_verify_link;
    }


    public WebElement getLanguage_change_verification() {
        return language_change_verification;
    }

    public WebElement getEnglish_link() {
        return English_link;
    }

    public Header_Page(){
    PageFactory.initElements(driver,this);
}
}

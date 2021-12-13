package com.united.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hook.driver;

public class Hotel_tap_page {


    @FindBy(xpath = "//*[@id=\"bookHotelTab\"]")
    private WebElement hotel_tap;

    @FindBy(xpath = "//*[@id=\"bookHotelTab-panel\"]")
    private  WebElement all_field_dropdown_list;

    @FindBy(xpath = "//*[@id=\"roomsDropdown\"]/div")
    private WebElement room_text_field;

    @FindBy(xpath = "//*[@id=\"slidingInputFieldGroup\"]/div")
    private WebElement travelers_text_field;

    @FindBy(xpath = "(//button[text()='+'])[1]")
    private WebElement adults_plus_btn;

    @FindBy(xpath = "(//button[text()='+'])[2]")
    private WebElement child_plus_btn;

    @FindBy(xpath = "//*[@id=\"bookHotelTab-panel\"]/form/div[2]/div[1]/div/div/ul/li")
    private List<WebElement> rooms_list;

    @FindBy(xpath = "//*[@id=\"bookHotelInput\"]")
    private WebElement going_text_field;

    @FindBy(xpath = "//*[@id=\"bookHotelInput-menu-item-0\"]/button/div")
    private WebElement choose_going_location;

    @FindBy(xpath = "//*[@id=\"bookHotelCheckinDate\"]")
    private WebElement checkIn_text_field;

    @FindBy(xpath = "//*[@id=\"bookHotelTab-panel\"]/form/div[1]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[3]/td[1]")
    private  WebElement select_date_for_checkIn;

    @FindBy(xpath = "//*[@id=\"bookHotelCheckoutDate\"]")
    private WebElement checkOut_text_field;

    @FindBy(xpath = "//*[@id=\"bookHotelTab-panel\"]/form/div[1]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[3]/td[7]")
    private WebElement select_date_for_checkOut;

    @FindBy(xpath = "//*[@id=\"bookHotelTab-panel\"]/form/ul/li/label")
    private WebElement book_with_miles_btn;

    @FindBy(xpath = "//*[@id=\"bookHotelTab-panel\"]/form/button")
    private WebElement find_hotel_btn;

    public WebElement getFind_hotel_btn() {
        return find_hotel_btn;
    }

    public WebElement getBook_with_miles_btn() {
        return book_with_miles_btn;
    }

    public WebElement getSelect_date_for_checkOut() {
        return select_date_for_checkOut;
    }

    public WebElement getCheckOut_text_field() {
        return checkOut_text_field;
    }

    public WebElement getSelect_date_for_checkIn() {
        return select_date_for_checkIn;
    }

    public WebElement getCheckIn_text_field() {
        return checkIn_text_field;
    }

    public WebElement getChoose_going_location() {
        return choose_going_location;
    }

    public WebElement getGoing_text_field() {
        return going_text_field;
    }

    public List<WebElement> getRooms_list() {
        return rooms_list;
    }

    public WebElement getChild_plus_btn() {
        return child_plus_btn;
    }

    public WebElement getAdults_plus_btn() {
        return adults_plus_btn;
    }

    public WebElement getTravelers_text_field() {
        return travelers_text_field;
    }

    public WebElement getRoom_text_field() {
        return room_text_field;
    }

    public WebElement getAll_field_dropdown_list() {
        return all_field_dropdown_list;
    }

    public WebElement getHotel_tap() {
        return hotel_tap;
    }

    public Hotel_tap_page (){
        PageFactory.initElements(driver,this);
    }
}

package com.united.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.logging.XMLFormatter;

import static com.united.base.Hook.driver;

public class Package_tap_page {

    @FindBy(xpath = "//*[@id=\"bookPackageTab\"]/h3/span")
    private WebElement package_tap;

    @FindBy(xpath = "//*[@id=\"vacationOriginInput\"]")
    private WebElement click_from_text_field;

    @FindBy(xpath = "//*[@id=\"vacationOriginInput-menu-item-0\"]/button/div/span")
    private WebElement choose_location_from;

    @FindBy(xpath = "//*[@id=\"vacationDestinationInput\"]")
    private WebElement click_arrived_text_field;

    @FindBy(xpath = "//*[@id=\"vacationDestinationInput-menu-item-0\"]/button/div/span")
    private WebElement choose_arrived_location;

    @FindBy(xpath = "//*[@id=\"DepartDate\"]")
    private WebElement depart_text_field;

    @FindBy(xpath = "//*[@id=\"bookVacationForm\"]/div[2]/div[2]/div[1]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[2]/td[5]")
    private WebElement depart_choose_date;

    @FindBy(xpath = "//*[@id=\"ReturnDate\"]")
    private WebElement return_text_field;

    @FindBy(xpath = "//*[@id=\"bookVacationForm\"]/div[2]/div[2]/div[1]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[2]/td[7]")
    private WebElement return_choose_date;

    @FindBy(xpath = "//*[@id=\"bookVacationForm\"]/div[3]/button")
    private WebElement find_trip_btn;

    @FindBy(xpath = "//*[@id=\"listingContent\"]/div/div/div")
    private WebElement list_of_hotel;

    @FindBy(xpath = "//*[@id=\"bookVacationForm\"]/div[2]/div[3]/div/div/div/div/ul/li")
    private WebElement list_of_room;

    @FindBy(xpath = "//*[@id=\"selectedRooms\"]/div")
    private WebElement room_no_4;

    @FindBy(xpath = "//*[@id=\"radiofield-item-id-packageType-2\"]")
    private WebElement car_and_flight_btn;

    @FindBy(xpath = "//*[@id=\"bookCruiseTab\"]/span")
    private WebElement cruise_link;

    @FindBy(xpath = "//*[@id=\"header_reservation_link\"]/span/span")
    private WebElement cruise_img;

    public WebElement getCruise_img() {
        return cruise_img;
    }

    public WebElement getCruise_link() {
        return cruise_link;
    }

    public WebElement getCar_and_flight_btn() {
        return car_and_flight_btn;
    }

    public WebElement getRoom_no_4() {
        return room_no_4;
    }

    public WebElement getRoom_text_field() {
        return room_no_4;
    }

    public WebElement getList_of_room() {
        return list_of_room;
    }

    public WebElement getList_of_hotel() {
        return list_of_hotel;
    }

    public WebElement getClick_from_text_field() {
        return click_from_text_field;
    }

    public WebElement getChoose_location_from() {
        return choose_location_from;
    }

    public WebElement getClick_arrived_text_field() {
        return click_arrived_text_field;
    }

    public WebElement getChoose_arrived_location() {
        return choose_arrived_location;
    }

    public WebElement getDepart_text_field() {
        return depart_text_field;
    }

    public WebElement getDepart_choose_date() {
        return depart_choose_date;
    }

    public WebElement getReturn_text_field() {
        return return_text_field;
    }

    public WebElement getReturn_choose_date() {
        return return_choose_date;
    }

    public WebElement getFind_trip_btn() {
        return find_trip_btn;
    }

    public WebElement getPackage_tap() {
        return package_tap;
    }

    public Package_tap_page (){
        PageFactory.initElements(driver,this);
    }
}

package com.united.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.united.base.Hook.driver;

public class Car_tap_page {
    @FindBy(xpath = "//*[@id=\"bookCarTab\"]/h3/span")
    private WebElement car_tap;

    @FindBy(xpath = "//*[@id=\"bookCarForm\"]")
    private WebElement car_whole_form;

    @FindBy(xpath = "//*[@id=\"bookCarForm\"]/div[1]/div[2]/label")
    private WebElement return_car_checkBox;

  ;@FindBy(xpath = "//*[@id=\"bookCarPickupDate\"]")
    private WebElement click_on_going_date;

  @FindBy(xpath = "//*[@id=\"bookCarForm\"]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[3]/td[4]")

  private WebElement choose_going_date;

  @FindBy(xpath = "//*[@id=\"bookCarDropoffDate\"]")
  private WebElement click_on_return_date;

  @FindBy(xpath = "//*[@id=\"bookCarForm\"]/div[2]/div[1]/div/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[3]/td[6]")
  private WebElement choose_return_date;

  @FindBy(xpath = "//*[@id=\"bookCarForm\"]/div[5]/label")
  private WebElement book_with_mile_btn;

  @FindBy(xpath = "//*[@id=\"ct-container\"]/div/div[2]/div[2]/ct-redeem-info-bar/div[1]/div/div[2]/div[1]")
  private WebElement mile_plus_header;

  @FindBy(xpath = "//*[@id=\"ct-availability-list-no-result\"]/div/div[2]/div[1]/p")
  private WebElement verify_text_message;

    public WebElement getVerify_text_message() {
        return verify_text_message;
    }

    public WebElement getMile_plus_header() {
        return mile_plus_header;
    }

    public WebElement getBook_with_mile_btn() {
        return book_with_mile_btn;
    }

    public WebElement getChoose_return_date() {
        return choose_return_date;
    }

    public WebElement getClick_on_return_date() {
        return click_on_return_date;
    }

    public WebElement getChoose_going_date() {
        return choose_going_date;
    }

    public WebElement getClick_on_going_date() {
        return click_on_going_date;
    }

    @FindBy(xpath = "//*[@id=\"driversAge\"]")
    private WebElement age_text_field;

    @FindBy(xpath = "//*[@id=\"bookCarPickupInput-menu-item-2\"]/button/div/div[1]")
    private WebElement pickUp_choose_location;

    @FindBy(xpath = "//*[@id=\"bookCarDropoffInput-menu-item-0\"]/button/div/div[1]")
    private WebElement dropOff_choose_location;

    @FindBy(xpath = "//*[@id=\"bookCarForm\"]/div[6]/div[1]/button")
    private WebElement find_car_button;

    @FindBy(xpath = "//*[@id=\"ct-checkbox\"]/div/div/label/span")
    private WebElement car_rental_info;

    @FindBy(xpath = "//*[@id=\"bookCarForm\"]/div[2]/div[3]/label")
    private WebElement primary_driver_checkBox;

    @FindBy(xpath = "//*[@id=\"bookCarPickupInput\"]")
    private WebElement pickUp_location_text_field;

    @FindBy(xpath = "//*[@id=\"bookCarDropoffInput\"]")
    private WebElement dropOff_location_text_field;

    public WebElement getDropOff_location_text_field() {
        return dropOff_location_text_field;
    }

    public WebElement getPickUp_location_text_field() {
        return pickUp_location_text_field;
    }





    public WebElement getPrimary_driver_checkBox() {
        return primary_driver_checkBox;
    }

    public WebElement getCar_rental_info() {
        return car_rental_info;
    }

    public WebElement getFind_car_button() {
        return find_car_button;
    }

    public WebElement getDropOff_choose_location() {
        return dropOff_choose_location;
    }

    public WebElement getPickUp_choose_location() {
        return pickUp_choose_location;
    }

    public WebElement getAge_text_field() {
        return age_text_field;
    }



    public WebElement getReturn_car_checkBox() {
        return return_car_checkBox;
    }

    public WebElement getCar_whole_form() {
        return car_whole_form;
    }

    public WebElement getCar_tap() {
        return car_tap;
    }


    public Car_tap_page(){
        PageFactory.initElements(driver,this);
    }
}

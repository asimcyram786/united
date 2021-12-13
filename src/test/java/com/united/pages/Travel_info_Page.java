package com.united.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.lang.model.element.Element;
import java.util.List;
import java.util.logging.XMLFormatter;

import static com.united.base.Hook.driver;

public class Travel_info_Page {

    @FindBy(css = "ul[class='app-components-BookTravel-bookTravel__travelNav--3RNBj'] >li")
    private List<WebElement> travelList;

    @FindBy(xpath= "//*[@id=\"bookFlightOriginInput\"]")
    private WebElement click_on_from_text_field;
    ////*[@id="bookFlightOriginInput"]
    //#input[placeholder='From*']

    @FindBy(xpath = "//*[@id=\"bookFlightOriginInput\"]")
    private WebElement empty_from_text_field;

    public WebElement getEmpty_from_text_field() {
        return empty_from_text_field;
    }

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[2]/div/div[1]/div/div/div[1]/div/button[2]")
    private WebElement from_text_field_cross_btn;

    @FindBy(css = "#autocomplete-item-0")
    private WebElement living_from_location;

    @FindBy(xpath = "//*[@id=\"bookFlightDestinationInput\"]")
    private  WebElement click_on_arrived_field;

    @FindBy(xpath = "//*[@id=\"autocomplete-item-3\"]/button/span")
    private WebElement chose_arrived_location;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[2]/div/div[1]/div/div/button/img")
    private WebElement switch_location_button;

    @FindBy(xpath = "//span[text()='Find flights']")
    private WebElement find_flight_button;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[4]/div[1]/div/div/ul/li")
    private List<WebElement> flight_classes;

    public List<WebElement> getFlight_classes() {
        return flight_classes;
    }

    @FindBy(xpath = "//*[@id=\"cabinType\"]/div")
    private WebElement type_of_flight_classes;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[2]/button")
    private WebElement travel_with_pet_btn;

    public WebElement getTravel_with_pet_btn() {
        return travel_with_pet_btn;
    }

    public WebElement getType_of_flight_classes() {
        return type_of_flight_classes;
    }

    public WebElement getFind_flight_button() {
        return find_flight_button;
    }

    public WebElement getSwitch_location_button() {
        return switch_location_button;
    }

    public WebElement getChose_arrived_location() {
        return chose_arrived_location;
    }

    public WebElement getClick_on_arrived_field() {
        return click_on_arrived_field;
    }

    public WebElement getFrom_text_field_cross_btn() {
        return from_text_field_cross_btn;
    }

    public WebElement getClick_on_from_text_field() {
        return click_on_from_text_field;
    }

    @FindBy(xpath = "//span[text()='Roundtrip']")
    private WebElement Round_trip_btn;


    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[1]/fieldset/div/label[2]/span[2]")
    private WebElement One_way_btn;

    @FindBy(xpath = "//*[@id=\"DepartDate\"]")
    private WebElement click_to_date_field;

    @FindBy(xpath = "//*[@id=\"passengersSlidingInputContainer\"]/div[1]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[1]/button[1]/span")
    private WebElement date_table_arrow;

    @FindBy(xpath = "//*[@id=\"passengersSlidingInputContainer\"]/div[1]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[3]/td[7]")
    private WebElement jan_date;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[2]/div/div[1]/div/div/div[2]/div/button[2]")
    private WebElement arrived_text_field_cross_button;

    public WebElement getArrived_text_field_cross_button() {
        return arrived_text_field_cross_button;
    }

    public WebElement getJan_date() {
        return jan_date;
    }

    public WebElement getDate_table_arrow() {
        return date_table_arrow;
    }

    @FindBy(xpath = "//*[@id=\"passengersSlidingInputContainer\"]/div[1]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]")
    private WebElement date_table;

    @FindBy(css = "button[aria-label=\"Clear Dates\"]")
    private WebElement date_X_button;

    public WebElement getDate_X_button() {
        return date_X_button;
    }

    @FindBy(css = "#DepartDate")
    WebElement depart_date_click;

    @FindBy(xpath = "//*[@id=\"passengersSlidingInputContainer\"]/div[1]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[3]/td[6]")
    WebElement selected_date;

    @FindBy(xpath = "//*[@id=\"passengersSlidingInputContainer\"]/div[1]/div/div/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[3]/div/table/tbody/tr[3]/td[7]")
    WebElement return_date;

    @FindBy(css = "[class=\"DateRangePicker DateRangePicker_1\"]")
    private WebElement depart_and_return_text_field;

    @FindBy(css = "button[aria-label=\"Substract one Adult\"]")
    private WebElement adults_plus_btn;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[5]/div/div[1]/div/div/div[1]/button/span")
    private WebElement advance_search_link;

    public WebElement getAdvance_search_link() {
        return advance_search_link;
    }

    public WebElement getAdults_plus_btn() {
        return adults_plus_btn;
    }

    public WebElement getDepart_and_return_text_field() {
        return depart_and_return_text_field;
    }

    @FindBy(xpath = "//*[@id=\"travelTab\"]")
    private WebElement book_link;

    @FindBy(xpath = "//*[@id=\"passengerSelector\"]")
    private WebElement travel_text_field;

    @FindBy(xpath = "//*[@id=\"statusTab\"]/h2/span")
    private WebElement flight_status_link;

    @FindBy(xpath = "//*[@id=\"flightStatusModel.flightNumber\"]")
    private WebElement flight_number_text_field;

    @FindBy(xpath = "//*[@id=\"checkInTab\"]/h2/div")
    private WebElement checkIn_tab;

    @FindBy(xpath = "//*[@id=\"flightCheckInConfNumber\"]")
    private WebElement confirmation_text_field;

    @FindBy(xpath = "//*[@id=\"tripsTab\"]/h2/div/div/div/div[1]/div/div")
    private WebElement my_trip_tab;

    @FindBy(xpath = "//*[@id=\"bookMyTrips\"]/div[4]/a")
    private WebElement travel_credit_link;

    @FindBy(xpath = "//*[@id=\"main-heading\"]")
    private WebElement new_tab_main_heading;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[3]/button[2]")
    private WebElement adults_tap_close_btn;

    @FindBy(xpath = "//div/div/div/button[text()='+']")
    private WebElement parent_of_all_travel;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[2]/div/div[1]/div/div/div[1]/div/button[2]")
    private WebElement leavingFromField_crossBtn;

    @FindBy(xpath = "//*[@id=\"bookFlightForm\"]/div[1]/div[2]")
    private WebElement flexible_check_box;

    @FindBy(xpath = "//*[@id=\"passengersSlidingInputContainer\"]/div[1]/div/div[1]")
    private WebElement month_text_field;

    @FindBy(xpath = "//*[@id=\"passengersSlidingInputContainer\"]/div[1]/div/div[2]")
    private WebElement day_text_field;

    public WebElement getDay_text_field() {
        return day_text_field;
    }

    public WebElement getMonth_text_field() {
        return month_text_field;
    }

    public WebElement getFlexible_check_box() {
        return flexible_check_box;
    }

    public WebElement getParent_of_all_travel() {
        return parent_of_all_travel;
    }

    public WebElement getAdults_tap_close_btn() {
        return adults_tap_close_btn;
    }

    public WebElement getNew_tab_main_heading() {
        return new_tab_main_heading;
    }

    public WebElement getTravel_credit_link() {
        return travel_credit_link;
    }

    public WebElement getMy_trip_tab() {
        return my_trip_tab;
    }

    public WebElement getConfirmation_text_field() {
        return confirmation_text_field;
    }

    public WebElement getCheckIn_tab() {
        return checkIn_tab;
    }

    public WebElement getFlight_number_text_field() {
        return flight_number_text_field;
    }

    public WebElement getFlight_status_link() {
        return flight_status_link;
    }

    public WebElement getTravel_text_field() {
        return travel_text_field;
    }

    public WebElement getBook_link() {
        return book_link;
    }

    public WebElement getReturn_date() {
        return return_date;
    }

    public WebElement getSelected_date() {
        return selected_date;
    }

    public WebElement getDepart_date_click() {
        return depart_date_click;
    }

    public WebElement getDate_table() {
        return date_table;
    }

    public WebElement getDate_text_field() {
        return date_text_field;
    }

    public WebElement getClick_to_date_field() {
        return click_to_date_field;
    }

    public WebElement getOne_way_btn() {
        return One_way_btn;
    }

    public WebElement getLeavingFromField_crossBtn() {
        return leavingFromField_crossBtn;
    }

    @FindBy(xpath = "//*[@id=\"DepartDate\"]")
    private WebElement date_text_field;

    @FindBy(xpath = "//*[@id=\"passengerMenuId\"]/div[1]/div[1]/div[1]/div/button[1]")
    private WebElement minus_button_passenger;

    public WebElement getMinus_button_passenger() {
        return minus_button_passenger;
    }

    public WebElement getLiving_from_location() {
        return living_from_location;
    }

    public WebElement getRound_trip_btn() {
        return Round_trip_btn;
    }

    public List<WebElement> getTravelList() {
        return travelList;
    }

    public Travel_info_Page() {
        PageFactory.initElements(driver, this);
    }
}

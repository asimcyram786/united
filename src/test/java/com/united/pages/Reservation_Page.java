package com.united.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.united.base.Hook.driver;
public class Reservation_Page {
    @FindBy(xpath = "//*[@id=\"petCabinType62\"]")
    private WebElement pet_text_field;

    @FindBy(css = "select[name='bookFlightModel.advancedSearch.petCabin']")
    private WebElement pet_drop_down_arrow;

    @FindBy(css = "select[name=\"bookFlightModel.advancedSearch.petCabin\"]>option")
    private List<WebElement> petDropDownOption_list;

    @FindBy(css = "div[class=\"atm-l-section atm-l-sidebar__main\"] input")
    private WebElement list_of_elements;

    public WebElement getList_of_elements() {
        return list_of_elements;
    }

    public WebElement getPet_drop_down_arrow() {
        return pet_drop_down_arrow;
    }

    public WebElement getPet_text_field() {
        return pet_text_field;
    }

    public Reservation_Page() {
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getPetDropDownOption_list() {
        return petDropDownOption_list;
    }
}
package com.united.regression;

import com.united.pages.Hotel_tap_page;
import com.united.utilies.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.united.base.Hook.driver;

public class Hotel_test {
    @Given("click on hotel tap")
    public void clickOnHotelTap() {
        Hotel_tap_page hotelTapPage = new Hotel_tap_page();
        hotelTapPage.getHotel_tap().click();
        Common.waitUntil(2);
    }

    @Then("verify all the text field and dropdowns are display")
    public void verifyAllTheTextFieldAndDropdownsAreDisplay() {
        Hotel_tap_page hotelTapPage = new Hotel_tap_page();
        boolean displayed = hotelTapPage.getAll_field_dropdown_list().isDisplayed();
        Assert.assertTrue(displayed);
    }

    @Then("verify room text field have {int} room value")
    public void verifyRoomTextFieldHaveRoomValue(int arg0) {
        Hotel_tap_page hotelTapPage = new Hotel_tap_page();
        String text = hotelTapPage.getRoom_text_field().getText();
        Assert.assertTrue(text.contains("1 room"));
        Common.waitUntil(3);
    }

    @And("verify num of travelers text field have {int} adult value")
    public void verifyNumOfTravelersTextFieldHaveAdultValue(int arg0) {
        Hotel_tap_page hotelTapPage = new Hotel_tap_page();
        String text = hotelTapPage.getTravelers_text_field().getText();
        Assert.assertTrue(text.contains("1 adult"));
        Common.waitUntil(2);
    }

    @Then("click on num of travelers tap")
    public void clickOnNumOfTravelersTap() {
        Hotel_tap_page hotelTapPage = new Hotel_tap_page();
        hotelTapPage.getTravelers_text_field().click();
        Common.waitUntil(3);
    }

    @And("click plus button eight time at adults")
    public void clickPlusButtonEightTimeAtAdults() {
        Hotel_tap_page hotelTapPage = new Hotel_tap_page();
        for (int i = 0; i < 9; i++) {
            hotelTapPage.getAdults_plus_btn().click();
            Common.waitUntil(1);
        }
    }

    @And("click plus button eight time at childern")
    public void clickPlusButtonEightTimeAtChildern() {
        Hotel_tap_page hotelTapPage = new Hotel_tap_page();
        for (int i = 0; i < 9; i++) {
            hotelTapPage.getChild_plus_btn().click();
            Common.waitUntil(2);
        }
    }

    @Then("verify travelers text field have sixtheen travelers")
    public void verifyTravelersTextFieldHaveSixtheenTravelers() {
        Hotel_tap_page hotelTapPage = new Hotel_tap_page();
        String text = hotelTapPage.getTravelers_text_field().getText();
        Assert.assertTrue(text.contains("16 travelers"));

    }

    @Then("click on room text field")
    public void clickOnRoomTextField() {
        Hotel_tap_page hotelTapPage = new Hotel_tap_page();
        hotelTapPage.getRoom_text_field().click();
        Common.waitUntil(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

    @And("choose room eight from drop down")
    public void chooseRoomEightFromDropDown() {
        Hotel_tap_page hotelTapPage = new Hotel_tap_page();
        for (WebElement room_list : hotelTapPage.getRooms_list()) {
            if (room_list.getAttribute("aria-label").equals("8 rooms")) {
                room_list.click();
                Common.waitUntil(2);
                break;
            }

        }
    }

    @Then("click and select {int} room")
    public void clickAndSelectRoom(int arg0) {
        Hotel_tap_page hotelTapPage = new Hotel_tap_page();
        hotelTapPage.getRoom_text_field().click();
        for (WebElement room_list : hotelTapPage.getRooms_list()) {
            if (room_list.getAttribute("aria-label").equals("2 rooms")) {
                room_list.click();
                Common.waitUntil(2);
                break;


            }
        }
    }

    @And("verify the num of travelers disappear")
    public void verifyTheNumOfTravelersDisappear() {
        Hotel_tap_page hotelTapPage = new Hotel_tap_page();
        boolean displayed = hotelTapPage.getTravelers_text_field().isDisplayed();
        Assert.assertFalse(displayed);
    }

    @Then("click going field and fill the text field")
    public void clickGoingFieldAndFillTheTextField() {
        Hotel_tap_page hotelTapPage = new Hotel_tap_page();
        hotelTapPage.getGoing_text_field().click();
        Common.waitUntil(1);
        hotelTapPage.getGoing_text_field().sendKeys("Was");
        Common.waitUntil(1);
        hotelTapPage.getChoose_going_location().click();
        Common.waitUntil(2);
    }

    @And("click and filled the checkIn and checkOut field")
    public void clickAndFilledTheCheckInAndCheckOutField() {
        Hotel_tap_page hotelTapPage = new Hotel_tap_page();
        hotelTapPage.getCheckIn_text_field().click();
        Common.waitUntil(1);
        hotelTapPage.getSelect_date_for_checkIn().click();
        Common.waitUntil(1);
        hotelTapPage.getCheckOut_text_field().click();
        Common.waitUntil(1);
        hotelTapPage.getSelect_date_for_checkOut().click();
        Common.waitUntil(1);
    }

    @And("click book with miles checkbox")
    public void clickBookWithMilesCheckbox() {
        Hotel_tap_page hotelTapPage = new Hotel_tap_page();
        hotelTapPage.getBook_with_miles_btn().click();
        Common.waitUntil(1);
    }

    @And("click on find hotel button")
    public void clickOnFindHotelButton() {
        Hotel_tap_page hotelTapPage = new Hotel_tap_page();
        hotelTapPage.getFind_hotel_btn().click();
        Common.waitUntil(2);
    }

    @Then("verify next page open with Destination, property, or landmark info")
    public void verifyNextPageOpenWithDestinationPropertyOrLandmarkInfo() {
    }
}






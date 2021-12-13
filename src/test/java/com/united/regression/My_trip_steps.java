package com.united.regression;

import com.united.pages.My_trip_page;
import com.united.utilies.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class My_trip_steps {
    @Given("click trip tap")
    public void clickTripTap() {
        My_trip_page myTripPage = new My_trip_page();
        myTripPage.getMy_trip_tap().click();
        Common.waitUntil(2);

    }

    @Then("verify verify find travel credit link display")
    public void verifyVerifyFindTravelCreditLinkDisplay() {
        My_trip_page myTripPage = new My_trip_page();
        myTripPage.getFind_trip_link().isDisplayed();
    }

    @Then("click search btn")
    public void clickSearchBtn() {
        My_trip_page myTripPage = new My_trip_page();
        myTripPage.getSearch_btn().click();
        Common.waitUntil(2);


    }

    @And("verify confirmation and last name have error msg")
    public void verifyConfirmationAndLastNameHaveErrorMsg() {
        My_trip_page myTripPage = new My_trip_page();
        myTripPage.getConfirmation_error_message().isDisplayed();
        myTripPage.getLast_name_error().isDisplayed();
    }

    @Then("verify sign link display")
    public void verifySignLinkDisplay() {
        My_trip_page myTripPage = new My_trip_page();
        Common.waitUntil(2);
        myTripPage.getSign_btn().isDisplayed();
    }
}

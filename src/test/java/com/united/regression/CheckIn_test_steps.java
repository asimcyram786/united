package com.united.regression;

import com.united.pages.CheckIn_page;
import com.united.pages.Package_tap_page;
import com.united.utilies.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;

import static com.united.base.Hook.driver;

public class CheckIn_test_steps {
    @Given("click on check in tap")
    public void clickOnCheckInTap() {
        CheckIn_page checkIn_page = new CheckIn_page();
        checkIn_page.getCheckIn_tap().click();
        Common.waitUntil(1);

    }

    @Then("click onn search button")
    public void clickOnnSearchButton() {
        CheckIn_page checkIn_page = new CheckIn_page();
        checkIn_page.getSearch_btn().click();
        Common.waitUntil(2);
    }

    @And("verify under confirmation number have and last name have error message")
    public void verifyUnderConfirmationNumberHaveAndLastNameHaveErrorMessage() {
        CheckIn_page checkIn_page = new CheckIn_page();
        checkIn_page.getConfirmation_error_msg().isDisplayed();
        Common.waitUntil(1);
        checkIn_page.getLast_name_error_msg().isDisplayed();
    }

    @Then("click on check in link")
    public void clickOnCheckInLink() {
        CheckIn_page checkIn_page = new CheckIn_page();
        checkIn_page.getCheckIn_link().click();
        Common.waitUntil(2);

    }

    @And("verify new page have checkIn and airport processing times heading")
    public void verifyNewPageHaveCheckInAndAirportProcessingTimesHeading() {
        CheckIn_page checkIn_page = new CheckIn_page();

        Common.waitUntil(3);
        checkIn_page.getCheckIn_airport_heading().isDisplayed();



    }

    @Then("click on mle plus link")
    public void clickOnMlePlusLink() {
        CheckIn_page checkIn_page = new CheckIn_page();
        checkIn_page.getMileplud_link().click();
        Common.waitUntil(3);
    }

    @And("verify checkIn heading")
    public void verifyCheckInHeading() {
        CheckIn_page checkIn_page = new CheckIn_page();
        checkIn_page.getCheckIn_heading().isDisplayed();
    }
}

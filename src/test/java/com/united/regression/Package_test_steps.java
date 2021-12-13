package com.united.regression;

import com.united.pages.Package_tap_page;
import com.united.utilies.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;

import static com.united.base.Hook.driver;

public class Package_test_steps {
    @Given("click on package tap")
    public void clickOnPackageTap() {
        Package_tap_page packageTapPage = new Package_tap_page();
        packageTapPage.getPackage_tap().click();
        Common.waitUntil(1);
    }

    @Then("click from text field and filled")
    public void clickFromTextFieldAndFilled() {
        Package_tap_page packageTapPage = new Package_tap_page();
        packageTapPage.getClick_from_text_field().click();
        packageTapPage.getClick_from_text_field().sendKeys("Was");
        Common.waitUntil(1);
        packageTapPage.getChoose_location_from().click();
        Common.waitUntil(1);
    }

    @And("click on arrived text field and filled")
    public void clickOnArrivedTextFieldAndFilled() {
        Package_tap_page packageTapPage = new Package_tap_page();
        packageTapPage.getClick_arrived_text_field().click();
        packageTapPage.getClick_arrived_text_field().sendKeys("New");
        Common.waitUntil(1);
        packageTapPage.getChoose_arrived_location().click();
        Common.waitUntil(1);
    }

    @And("click depart date text field and choose date")
    public void clickDepartDateTextFieldAndChooseDate() {
        Package_tap_page packageTapPage = new Package_tap_page();
        packageTapPage.getDepart_text_field().click();
        Common.waitUntil(1);
        packageTapPage.getDepart_choose_date().click();

    }

    @Then("click return date text field and choose date")
    public void clickReturnDateTextFieldAndChooseDate() {
        Package_tap_page packageTapPage = new Package_tap_page();
        packageTapPage.getReturn_text_field().click();
        Common.waitUntil(1);
        packageTapPage.getReturn_choose_date().click();
    }

    @And("click find trip button")
    public void clickFindTripButton() {
        Package_tap_page packageTapPage = new Package_tap_page();
        packageTapPage.getFind_trip_btn().click();
    }

    @And("verify hotel list")
    public void verifyHotelList() {
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
        Package_tap_page packageTapPage = new Package_tap_page();
        packageTapPage.getList_of_hotel().isDisplayed();
    }

    @Then("click from text field and fill the field")
    public void clickFromTextFieldAndFillTheField() {
        Package_tap_page packageTapPage = new Package_tap_page();
        packageTapPage.getClick_from_text_field().click();
        packageTapPage.getClick_from_text_field().sendKeys("Was");
        Common.waitUntil(1);
        packageTapPage.getChoose_location_from().click();
        Common.waitUntil(1);

    }

    @And("click on arrived text field and fill the field")
    public void clickOnArrivedTextFieldAndFillTheField() {

        Package_tap_page packageTapPage = new Package_tap_page();
        packageTapPage.getClick_arrived_text_field().click();
        packageTapPage.getClick_arrived_text_field().sendKeys("New");
        Common.waitUntil(1);
        packageTapPage.getChoose_arrived_location().click();
        Common.waitUntil(1);
    }

    @And("click depart date text field and choose  the date")
    public void clickDepartDateTextFieldAndChooseTheDate() {
        Package_tap_page packageTapPage = new Package_tap_page();
        packageTapPage.getDepart_text_field().click();
        Common.waitUntil(1);
        packageTapPage.getDepart_choose_date().click();
    }

    @Then("click return date text field and choose  the date")
    public void clickReturnDateTextFieldAndChooseTheDate() {
        Package_tap_page packageTapPage = new Package_tap_page();
        packageTapPage.getReturn_text_field().click();
        Common.waitUntil(1);
        packageTapPage.getReturn_choose_date().click();

    }

    @And("click room and select room")
    public void clickRoomAndSelectRoom() {
        Package_tap_page packageTapPage = new Package_tap_page();
       /// int size = packageTapPage.getList_of_room().
     //   Assert.assertEquals(size, 4);
        Common.waitUntil(2);

    }

    @Then("click on room text field arrow and select more than one room")
    public void clickOnRoomTextFieldArrowAndSelectMoreThanOneRoom() {
        Package_tap_page packageTapPage = new Package_tap_page();
        packageTapPage.getRoom_text_field().click();



        }

    @Then("click on car and flight button")
    public void clickOnCarAndFlightButton() {
        Package_tap_page packageTapPage = new Package_tap_page();
        packageTapPage.getCar_and_flight_btn().click();
        Common.waitUntil(2);
    }

    @And("verify that room text field disappear")
    public void verifyThatRoomTextFieldDisappear() {
        Package_tap_page packageTapPage = new Package_tap_page();
        boolean displayed = packageTapPage.getRoom_text_field().isDisplayed();
        Assert.assertFalse(displayed);

    }


    @Then("click on cruise link")
    public void clickOnCruiseLink() {
        Package_tap_page packageTapPage = new Package_tap_page();
        packageTapPage.getCruise_link().click();
        Common.waitUntil(2);
    }

    @And("verify the next page with title united cruise")
    public void verifyTheNextPageWithTitleUnitedCruise() {
        Package_tap_page packageTapPage = new Package_tap_page();
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
        packageTapPage.getCruise_img().isDisplayed();
    }
}








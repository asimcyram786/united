package com.united.regression;

import com.united.pages.Car_tap_page;
import com.united.utilies.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.util.ArrayList;

import static com.united.base.Hook.driver;

public class Car_test_steps {
    @Given("click on car tap")
    public void clickOnCarTap() {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getCar_tap().click();
        Common.waitUntil(2);
    }

    @Then("verify all the text field and dropdowns are display at car tap")
    public void verifyAllTheTextFieldAndDropdownsAreDisplayAtCarTap() {
        Car_tap_page carTapPage = new Car_tap_page();
        boolean displayed = carTapPage.getCar_whole_form().isDisplayed();
        Assert.assertTrue(displayed);


    }

    @Then("click on return car")
    public void clickOnReturnCar() {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getReturn_car_checkBox().click();
        Common.waitUntil(1);
        carTapPage.getReturn_car_checkBox().click();
        Common.waitUntil(3);
    }

    @And("verify drop off text field disappear")
    public void verifyDropOffTextFieldDisappear() {
        //   Car_tap_page carTapPage = new Car_tap_page();
        //    boolean displayed = carTapPage.getDrop_off_text_field().isDisplayed();
        //   Assert.assertFalse(displayed);

    }

    @Then("click on pickup text field and write your location")
    public void clickOnPickupTextFieldAndWriteYourLocation() {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getPickUp_location_text_field().click();
        Common.waitUntil(2);
        carTapPage.getPickUp_location_text_field().sendKeys("Vir");
        Common.waitUntil(2);
        carTapPage.getPickUp_choose_location().click();

    }

    @And("click on drop_{int}ff text field and write your location")
    public void clickOnDrop_FfTextFieldAndWriteYourLocation(int arg0) {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getReturn_car_checkBox().click();
        Common.waitUntil(1);
        carTapPage.getDropOff_location_text_field().click();
        Common.waitUntil(1);
        carTapPage.getDropOff_location_text_field().sendKeys("New");
        Common.waitUntil(2);
        carTapPage.getDropOff_choose_location().click();
    }

    @And("click date text field  and filled up")
    public void clickDateTextFieldAndFilledUp() {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getClick_on_going_date().click();
        Common.waitUntil(1);
        carTapPage.getChoose_going_date().click();
        Common.waitUntil(2);
        carTapPage.getClick_on_return_date().click();
        Common.waitUntil(1);
        carTapPage.getChoose_return_date().click();
        Common.waitUntil(2);
    }

    @And("click on age text field and write your age")
    public void clickOnAgeTextFieldAndWriteYourAge() {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getPrimary_driver_checkBox().click();
        Common.waitUntil(1);
        carTapPage.getAge_text_field().click();
        Common.waitUntil(1);
        carTapPage.getAge_text_field().sendKeys("28");
        Common.waitUntil(1);
    }

    @Then("click on find car button")
    public void clickOnFindCarButton() {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getFind_car_button().click();
        Common.waitUntil(2);
    }


    @Then("click on pickup text field and write your location at acr")
    public void clickOnPickupTextFieldAndWriteYourLocationAtAcr() {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getPickUp_location_text_field().click();
        Common.waitUntil(2);
        carTapPage.getPickUp_location_text_field().sendKeys("Vir");
        Common.waitUntil(2);
        carTapPage.getPickUp_choose_location().click();
    }

    @And("click on drop_{int}ff text field and write your location ar cat")
    public void clickOnDrop_FfTextFieldAndWriteYourLocationArCat(int arg0) {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getReturn_car_checkBox().click();
        Common.waitUntil(1);
        carTapPage.getDropOff_location_text_field().click();
        Common.waitUntil(1);
        carTapPage.getDropOff_location_text_field().sendKeys("New");
        Common.waitUntil(2);
        carTapPage.getDropOff_choose_location().click();
    }

    @And("click date text field  and filled up at car")
    public void clickDateTextFieldAndFilledUpAtCar() {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getClick_on_going_date().click();
        Common.waitUntil(1);
        carTapPage.getChoose_going_date().click();
        Common.waitUntil(2);
        carTapPage.getClick_on_return_date().click();
        Common.waitUntil(1);
        carTapPage.getChoose_return_date().click();
        Common.waitUntil(2);
    }

    @Then("click on age text field and write your age at car")
    public void clickOnAgeTextFieldAndWriteYourAgeAtCar() {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getPrimary_driver_checkBox().click();
        Common.waitUntil(1);
        carTapPage.getAge_text_field().click();
        Common.waitUntil(1);
        carTapPage.getAge_text_field().sendKeys("28");
        Common.waitUntil(1);
    }

    @And("click on book with miles")
    public void clickOnBookWithMiles() {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getBook_with_mile_btn().click();
        Common.waitUntil(1);

    }

    @And("click on find car button at car")
    public void clickOnFindCarButtonAtCar() {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getFind_car_button().click();
        Common.waitUntil(2);
    }

    @Then("verify MileagePlus title")
    public void verifyMileagePlusTitle() {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getMile_plus_header().isDisplayed();

    }

    @Then("click on pickup text field and write your location at car under {int}")
    public void clickOnPickupTextFieldAndWriteYourLocationAtCarUnder(int arg0) {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getPickUp_location_text_field().click();
        Common.waitUntil(2);
        carTapPage.getPickUp_location_text_field().sendKeys("Vir");
        Common.waitUntil(2);
        carTapPage.getPickUp_choose_location().click();

    }

    @And("click date text field  and filled up at car under {int}")
    public void clickDateTextFieldAndFilledUpAtCarUnder(int arg0) {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getClick_on_going_date().click();
        Common.waitUntil(1);
        carTapPage.getChoose_going_date().click();
        Common.waitUntil(2);
        carTapPage.getClick_on_return_date().click();
        Common.waitUntil(1);
        carTapPage.getChoose_return_date().click();
        Common.waitUntil(2);
    }

    @Then("click on age text field and write your age at car under {string}")
    public void clickOnAgeTextFieldAndWriteYourAgeAtCarUnder(String age) {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getPrimary_driver_checkBox().click();
        Common.waitUntil(1);
        carTapPage.getAge_text_field().click();
        Common.waitUntil(1);
        carTapPage.getAge_text_field().sendKeys(age);
        Common.waitUntil(1);
    }

    @And("click on book with miles under {int}")
    public void clickOnBookWithMilesUnder(int arg0) {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getBook_with_mile_btn().click();
        Common.waitUntil(1);
    }

    @And("click on find car button at car under {int}")
    public void clickOnFindCarButtonAtCarUnder(int arg0) {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getFind_car_button().click();
        Common.waitUntil(2);
    }

    @Then("verify MileagePlus title under {int}")
    public void verifyMileagePlusTitleUnder(int arg0) {
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getVerify_text_message().isDisplayed();

    }

    @Then("click on pickup text field and write your location at car adult age")
    public void clickOnPickupTextFieldAndWriteYourLocationAtCarAdultAge() {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getPickUp_location_text_field().click();
        Common.waitUntil(2);
        carTapPage.getPickUp_location_text_field().sendKeys("Vir");
        Common.waitUntil(2);
        carTapPage.getPickUp_choose_location().click();
    }

    @And("click date text field  and filled up at car adult age")
    public void clickDateTextFieldAndFilledUpAtCarAdultAge() {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getClick_on_going_date().click();
        Common.waitUntil(1);
        carTapPage.getChoose_going_date().click();
        Common.waitUntil(2);
        carTapPage.getClick_on_return_date().click();
        Common.waitUntil(1);
        carTapPage.getChoose_return_date().click();
        Common.waitUntil(2);
    }

    @Then("click on age text field and write your age at caradult age")
    public void clickOnAgeTextFieldAndWriteYourAgeAtCaradultAge() {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getPrimary_driver_checkBox().click();
        Common.waitUntil(1);
        carTapPage.getAge_text_field().click();
        Common.waitUntil(1);
        carTapPage.getAge_text_field().sendKeys("22");
        Common.waitUntil(1);
    }

    @And("click on book with miles adult age")
    public void clickOnBookWithMilesAdultAge() {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getBook_with_mile_btn().click();
        Common.waitUntil(1);
    }

    @And("click on find car button at car adult age")
    public void clickOnFindCarButtonAtCarAdultAge() {
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getFind_car_button().click();
        Common.waitUntil(2);
    }

    @Then("verify text message")
    public void verifyTextMessage() {
        ArrayList<String> strings = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strings.get(1));
        Car_tap_page carTapPage = new Car_tap_page();
        carTapPage.getVerify_text_message().isDisplayed();


    }
}

package com.united.smoke_test;

import com.united.pages.Flights_result_page;
import com.united.pages.Travel_info_Page;
import com.united.utilies.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.bytebuddy.asm.TypeReferenceAdjustment;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.united.base.Hook.driver;

public class Smoke {

    @Given("app load with travel option")
    public void appLoadWithTravelOption() {
        Travel_info_Page travel_page = new Travel_info_Page();
        List<WebElement> travelList = travel_page.getTravelList();
        int size = travelList.size();
        System.out.println(size);
        Assert.assertEquals(size, 4);
    }

    @And("click on form text field")
    public void clickOnFormTextField() {

    }

    @Then("write your  from location")
    public void writeYourFromLocation() {

    }

    @And("click arrived text field")
    public void clickArrivedTextField() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getClick_on_arrived_field().click();
        Common.waitUntil(1);
    }

    @And("write where you want to arrived")
    public void writeWhereYouWantToArrived() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getClick_on_arrived_field().sendKeys("New");
        Common.waitUntil(2);
        travelInfoPage.getChose_arrived_location().click();
        Common.waitUntil(5);
    }

    @Then("click on find flight button")
    public void clickOnFindFlightButton() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        travelInfoPage.getFind_flight_button().click();
        Common.waitUntil(1);
    }

    @And("verify all the flights display")
    public void verifyAllTheFlightsDisplay() {
    }

    @Given("click on one way button")
    public void clickOnOneWayButton() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getOne_way_btn().click();
    }

    @Then("click on From text field")
    public void clickOnFromTextField() {
    }

    @And("write your location")
    public void writeYourLocation() {
    }

    @And("click on arrived field")
    public void clickOnArrivedField() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getClick_on_arrived_field().click();
    }

    @Then("write where you want to arrive")
    public void writeWhereYouWantToArrive() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getClick_on_arrived_field().sendKeys("New");
        Common.waitUntil(1);
        travelInfoPage.getChose_arrived_location().click();

    }

    @And("click on  date field")
    public void clickOnDateField() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getDate_text_field().click();
    }

    @And("choose your date when you want to go")
    public void chooseYourDateWhenYouWantToGo() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getDate_table_arrow().click();
        Common.waitUntil(2);
        travelInfoPage.getJan_date().click();

    }

    @And("click on find flight btnThen  verify the list of flight")
    public void clickOnFindFlightBtnThenVerifyTheListOfFlight() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        travelInfoPage.getFind_flight_button().click();
    }
}




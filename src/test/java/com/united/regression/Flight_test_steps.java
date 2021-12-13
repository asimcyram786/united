package com.united.regression;

import com.united.pages.Reservation_Page;
import com.united.pages.Travel_info_Page;
import com.united.utilies.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.Callable;

import static com.united.base.Hook.driver;

public class Flight_test_steps {
    @Given("click on Round trip button")
    public void clickOnRoundTripButton() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getRound_trip_btn().click();
        Common.waitUntil(1);

    }


    @And("verify depart date and return date text field display")
    public void verifyDepartDateAndReturnDateTextFieldDisplay() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        Assert.assertTrue(travelInfoPage.getDepart_and_return_text_field().isDisplayed());
    }

    @Given("click on one way btn")
    public void clickOnOneWayBtn() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getOne_way_btn().click();
        Common.waitUntil(4);
    }

    @Then("verify depart date text field display")
    public void verifyDepartDateTextFieldDisplay() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getDepart_date_click().isDisplayed();
    }

    @Given("click on one way button at flight info")
    public void clickOnOneWayButtonAtFlightInfo() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getOne_way_btn().click();

    }

    @Then("click on travel field")
    public void clickOnTravelField() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getTravel_text_field().click();
    }

    @And("choose nine travel")
    public void chooseNineTravel() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        for (int i = 0; i < 10; i++) {
            travelInfoPage.getAdults_plus_btn().click();
            Common.waitUntil(1);
        }
        String verify_travel = travelInfoPage.getTravel_text_field().getText();
        Assert.assertTrue(verify_travel.contains("9 Adults"));

    }


    @Given("click on Round trip btn")
    public void clickOnRoundTripBtn() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getRound_trip_btn().click();
    }

    @Then("click on travel text field")
    public void clickOnTravelTextField() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getTravel_text_field().click();
        Common.waitUntil(1);
    }

    @And("choose one passenger from adults")
    public void chooseOnePassengerFromAdults() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getParent_of_all_travel().click();
        Common.waitUntil(2);

    }

    @And("chose one passenger from Seniors")
    public void choseOnePassengerFromSeniors() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getParent_of_all_travel().click();
        Common.waitUntil(2);

    }

    @Then("choose one passenger from Infants Under {int}")
    public void chooseOnePassengerFromInfantsUnder(int arg0) {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getParent_of_all_travel().click();
        Common.waitUntil(2);
    }

    @And("choose one passenger from Infants on lap")
    public void chooseOnePassengerFromInfantsOnLap() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getParent_of_all_travel().click();
        Common.waitUntil(2);
    }

    @And("choose one passenger from Children {int} to {int}")
    public void chooseOnePassengerFromChildrenTo(int arg0, int arg1) {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getParent_of_all_travel().click();
        Common.waitUntil(2);
    }

    @And("choose passenger from Children {int} to {int}")
    public void choosePassengerFromChildrenTo(int arg0, int arg1) {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getParent_of_all_travel().click();
        Common.waitUntil(2);
    }

    @And("choose passenger from Children {int} - {int}")
    public void choosePassengerFromChildren(int arg0, int arg1) {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getParent_of_all_travel().click();
        Common.waitUntil(2);
    }

    @Then("verify travel text field have eight num of travel")
    public void verifyTravelTextFieldHaveEightNumOfTravel() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getParent_of_all_travel().click();
        Common.waitUntil(2);
    }

    @Given("click on arrived location text field")
    public void clickOnArrivedLocationTextField() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getClick_on_arrived_field().click();
        Common.waitUntil(2);
    }


    @Then("give you arrived location")
    public void giveYouArrivedLocation() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getClick_on_arrived_field().sendKeys("New");
        Common.waitUntil(1);
        travelInfoPage.getChose_arrived_location().click();
        Common.waitUntil(3);
    }

    @And("click on switch button")
    public void clickOnSwitchButton() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getSwitch_location_button().click();
        Common.waitUntil(3);
    }

    @Given("click on from text field")
    public void clickOnFromTextField() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getClick_on_from_text_field().click();
        Common.waitUntil(2);
    }

    @Then("remove the value to from text field")
    public void removeTheValueToFromTextField() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getFrom_text_field_cross_btn().click();
        Common.waitUntil(2);
    }

    @And("verify from text field is empty")
    public void verifyFromTextFieldIsEmpty() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        boolean text = travelInfoPage.getEmpty_from_text_field().isDisplayed();
        Assert.assertTrue(text);

    }

    @Given("click on arrived location  field")
    public void clickOnArrivedLocationField() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getClick_on_arrived_field().click();
        Common.waitUntil(2);
    }

    @Then("add location on arrived text field")
    public void addLocationOnArrivedTextField() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getClick_on_arrived_field().sendKeys("New York");
        Common.waitUntil(2);
    }

    @And("click remove button over there")
    public void clickRemoveButtonOverThere() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getArrived_text_field_cross_button().click();
        Common.waitUntil(2);
    }

    @And("verify arrived text field is empty")
    public void verifyArrivedTextFieldIsEmpty() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getClick_on_arrived_field().isDisplayed();

    }

    @Given("click on travel text box")
    public void clickOnTravelTextBox() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getTravel_text_field().click();
    }

    @Then("click minus button on adult passenger")
    public void clickMinusButtonOnAdultPassenger() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        for (int i = 0; i < 3; i++) {
            travelInfoPage.getMinus_button_passenger().click();
            Common.waitUntil(1);
        }
    }

    @And("verify the num of  travel still {int}")
    public void verifyTheNumOfTravelStill(int arg0) {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        String verify_travel = travelInfoPage.getTravel_text_field().getText();
        Assert.assertTrue(verify_travel.contains("1 Adult"));
    }

    @Given("verify leaving from field has correct placeholder")
    public void verifyLeavingFromFieldHasCorrectPlaceholder() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        String placeholder = travelInfoPage.getClick_on_from_text_field().getAttribute("placeholder");
        Assert.assertTrue(placeholder.contains("From*"));
        Common.waitUntil(1);

    }


    @Then("verify arrived to field has correct placeholder")
    public void verifyArrivedToFieldHasCorrectPlaceholder() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        String placeholder = travelInfoPage.getClick_on_arrived_field().getAttribute("placeholder");
        Assert.assertTrue(placeholder.contains("To*"));

    }

    @Given("click on arrow button at flight class")
    public void clickOnArrowButtonAtFlightClass() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        WebElement type_of_flight_classes = travelInfoPage.getType_of_flight_classes();
        Common.highlight_element(type_of_flight_classes);
        Common.waitUntil(2);
        travelInfoPage.getType_of_flight_classes().click();
        Common.waitUntil(2);
    }

    @Then("select the premium economy class")
    public void selectThePremiumEconomyClass() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        for (WebElement flight_classes : travelInfoPage.getFlight_classes()) {
            if (flight_classes.getAttribute("aria-label").equals("Premium economy")) {
                flight_classes.click();
                Common.waitUntil(2);
                break;
            }
        }
    }

    @And("click again on arrow button at flight class")
    public void clickAgainOnArrowButtonAtFlightClass() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getType_of_flight_classes().click();
        Common.waitUntil(2);
    }

    @And("select the business or first class")
    public void selectTheBusinessOrFirstClass() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        for (WebElement flight_classes : travelInfoPage.getFlight_classes()) {
            if (flight_classes.getAttribute("aria-label").equals("Business or First")) {
                flight_classes.click();
                Common.waitUntil(2);
                break;
            }
        }


    }

    @Then("verify the business and first class flight display on flight class")
    public void verifyTheBusinessAndFirstClassFlightDisplayOnFlightClass() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        String text = travelInfoPage.getType_of_flight_classes().getText();
        Assert.assertTrue(text.contains("Business or First"));
    }

    @Given("click on travel box")
    public void clickOnTravelBox() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getTravel_text_field().click();
        Common.waitUntil(2);
    }


    @Then("click on travel with pet")
    public void clickOnTravelWithPet() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        travelInfoPage.getTravel_with_pet_btn().click();
        Common.waitUntil(3);

    }

    @And("click on pet drop down arrow")
    public void clickOnPetDropDownArrow() {

    }

    @And("select one pet from that droupdown")
    public void selectOnePetFromThatDroupdown() {
        Reservation_Page reservation_page = new Reservation_Page();
        int size = reservation_page.getPetDropDownOption_list().size();
        System.out.println(size);
        Assert.assertEquals(size,2);


    }

    @Given("click on advance search link")
    public void clickOnAdvanceSearchLink() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        travelInfoPage.getAdvance_search_link().click();
        Common.waitUntil(2);
    }

    @Then("verify the Book a flight heading display")
    public void verifyTheBookAFlightHeadingDisplay() {
        Reservation_Page reservation_page = new Reservation_Page();
        reservation_page.getList_of_elements().isDisplayed();

    }

    @Given("click on  flexible check box")
    public void clickOnFlexibleCheckBox() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        WebElement flexible_check_box = travelInfoPage.getFlexible_check_box();
        Common.highlight_element(travelInfoPage.getFlexible_check_box());
        Common.waitUntil(2);
        travelInfoPage.getFlexible_check_box().click();
        Common.waitUntil(2);
    }

    @Then("verify date text field have month and day drop downs")
    public void verifyDateTextFieldHaveMonthAndDayDropDowns() {
        Travel_info_Page travelInfoPage = new Travel_info_Page();
        boolean displayed = travelInfoPage.getMonth_text_field().isDisplayed();
        Common.highlight_element(travelInfoPage.getMonth_text_field());
        Common.waitUntil(2);
        boolean displayed1 = travelInfoPage.getDay_text_field().isDisplayed();
        Common.highlight_element(travelInfoPage.getDay_text_field());
        Common.waitUntil(2);
        Assert.assertTrue(displayed && displayed1);


    }
}





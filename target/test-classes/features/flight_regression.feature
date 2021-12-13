Feature: round trip
  user have to click round Trip button and verify depart date and return date text field display

  Scenario: user have to click round trip and verify dates fields are display
    Given click on Round trip button
    Then verify depart date and return date text field display

  Scenario:  user have to click one way button and verify only one date text field display
    Given click on one way btn
    Then verify depart date text field display

  Scenario:  user have to click on one way button then select 9 travel
    Given  click on one way button at flight info
    Then click on travel field
    And choose nine travel

  Scenario:  user have to select one of travel of each type of travel
    Given  click on Round trip btn
    Then click on travel text field
    And  choose one passenger from adults
    And  chose one passenger from Seniors
    Then choose one passenger from Infants Under 2
    And  choose one passenger from Infants on lap
    And choose one passenger from Children 15 to 17
    Then choose one passenger from Children 12 to 14
    And  choose passenger from Children 5 to 11
    And choose passenger from Children 2 - 4
    Then  verify travel text field have eight num of travel

  Scenario:  user have to click switch button to switch location
    Given click on arrived location text field
    Then  give you arrived location
    And  click on switch button

  Scenario: user have to click on From text field and remove value from there
    Given click on from text field
    Then remove the value to from text field
    And  verify from text field is empty

  Scenario:  user have to add arrived location on text field and click remove
    Given click on arrived location  field
    Then  add location on arrived text field
    And  click remove button over there
    And  verify arrived text field is empty

  Scenario:  user have to click travel text field and make it zero
    Given  click on travel text box
    Then  click minus button on adult passenger
    And  verify the num of  travel still 1

  Scenario: Leaving from and going to fields should have correct placeholders
    Given verify leaving from field has correct placeholder
    Then verify arrived to field has correct placeholder

  Scenario:
    Given click on arrow button at flight class
    Then select the premium economy class
    And click again on arrow button at flight class
    And  select the business or first class
    Then verify the business and first class flight display on flight class

  Scenario: click on travel field and select one pet from there
    Given click on travel box
    Then click on travel with pet
    And click on pet drop down arrow
    And select one pet from that droupdown

    Scenario: click on advance serach and verify the ofter page open with different headings
      Given  click on advance search link
      Then verify the Book a flight heading display


      @smoke
      Scenario:  click on flexible check box and verify date show two drop down
        Given  click on  flexible check box
        Then verify date text field have month and day drop downs



















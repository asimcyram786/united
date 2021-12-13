Feature:

  Background:
    Given click on hotel tap

  Scenario: user have to click hotel tap and verify all the button and dropdown display
    Then verify all the text field and dropdowns are display

  Scenario: user have to click hotel tap and verify the room text field and num of travel have default
   Then verify room text field have 1 room value
    And verify num of travelers text field have 1 adult value

  Scenario:  user have to to click hotel tap and click on num of travelers and choose eight adults and child
    Then  click on num of travelers tap
    And click plus button eight time at adults
    And  click plus button eight time at childern
    Then  verify travelers text field have sixtheen travelers

    Scenario:  user have to click on hotel tap and select 8 room from drop down
      Then  click on room text field
      And  choose room eight from drop down

      Scenario:  user have to select 8 room then verify um of travelers disappear
        Then  click and select 2 room
        And verify the num of travelers disappear

        Scenario:  user have to fill out the all empty field have select drop gown
          Then click going field and fill the text field
          And  click and filled the checkIn and checkOut field
          And  click book with miles checkbox
          And  click on find hotel button
          Then  verify next page open with Destination, property, or landmark info





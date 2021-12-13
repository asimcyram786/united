Feature:

  Background:
    Given  click on car tap

  Scenario:  user have to click car tap and verify all text field and drop down display
    Then  verify all the text field and dropdowns are display at car tap

  Scenario:  user have to click car tap and click on return car and verify drop off location disappear
    Then click on return car
    And  verify drop off text field disappear

  Scenario:  use have to click car tap and filled up the car relative info
    Then  click on pickup text field and write your location
    And   click on drop_0ff text field and write your location
    And  click date text field  and filled up
    Then click on age text field and write your age
    And  click on find car button

  Scenario:  user have to click car and filled up form
    Then  click on pickup text field and write your location at acr
    And   click on drop_0ff text field and write your location ar cat
    And  click date text field  and filled up at car
    Then click on age text field and write your age at car
    And  click on book with miles
    And  click on find car button at car
    Then  verify MileagePlus title

  Scenario:  user have to rent car under age
    Then  click on pickup text field and write your location at car under 18
    And  click date text field  and filled up at car under 18
    Then click on age text field and write your age at car under "18"
    And  click on book with miles under 18
    And  click on find car button at car under 18
    Then  verify MileagePlus title under 18


Scenario:   user have to rent car in age 22
    Then  click on pickup text field and write your location at car adult age
    And  click date text field  and filled up at car adult age
    Then click on age text field and write your age at caradult age
    And  click on book with miles adult age
    And  click on find car button at car adult age
    Then  verify text message




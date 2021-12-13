Feature: App load

  user should able to go to website and all the feature should display


  Scenario: app load with book,fight status , etc
    Given app load with travel option

  Scenario: user should able choose flight
    And click on form text field
    Then write your  from location
    And click arrived text field
    And  write where you want to arrived
    Then  click on find flight button
    And  verify all the flights display

  Scenario: user should able to choose flight with specific date
    Given click on one way button
    Then  click on From text field
    And  write your location
    And click on arrived field
    Then  write where you want to arrive
    And  click on  date field
    And  choose your date when you want to go
    And click on find flight btnThen  verify the list of flight
#
#
#
#
#      Scenario:  user should be able to choose flight with multiple traveler
#        Given  click on Roundtrip
#        Then   click on From field
#        And  write your from location
#        And  click on arrive field
#        Then  write where you want to go
#        And click on  date  text field
#        And  choose a date when you want to go
#        Then choose total member you want to travel
#        And click on find flight button to see flight info










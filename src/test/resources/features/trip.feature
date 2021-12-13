@regression
Feature:


Background:
  Given click trip tap
   Scenario:  user have to click my trip tap and verify find your travel credit display
   Then   verify verify find travel credit link display

   Scenario: user have to click my trip tap and click search btn without filling field
     Then click search btn
     And  verify confirmation and last name have error msg

     Scenario:  user have to click my trip and verify sign link display
       Then verify sign link display





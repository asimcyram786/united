Feature:
  Background:
    Given  click on check in tap
  Scenario: user have to click check in tap and click search button without fill any field
   Then click onn search button
    And  verify under confirmation number have and last name have error message

    Scenario:  user have to click checkIn link and verify new page have check in and airport heading
      Then  click on check in link
      And  verify new page have checkIn and airport processing times heading

      Scenario: user have to click mile plus link and verify heading
        Then  click on mle plus link
        And  verify checkIn heading


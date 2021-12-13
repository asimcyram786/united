Feature:
  Background:
    Given  click on package tap
  Scenario: click on package tap and fill all empty box
    Then click from text field and filled
    And  click on arrived text field and filled
    And click depart date text field and choose date
    Then  click return date text field and choose date
    And click find trip button
    And  verify hotel list

    Scenario:  click on package tap and verify there are 4 room
      Then click from text field and fill the field
      And  click on arrived text field and fill the field
      And click depart date text field and choose  the date
      Then  click return date text field and choose  the date
      And click room and select room

      Scenario:  click on package tap and verify room text field have rooms text
        Then click on room text field arrow and select more than one room

        Scenario:  click on package tap and click on car and flight button and verify that room text field
          Then click on car and flight button
          And  verify that room text field disappear

          Scenario:  click on package tap and click on cruise link
            Then  click on cruise link
            And verify the next page with title united cruise










Feature: header display
  user should have able to use header link as excepted

  @Sanity
  Scenario: user have to click English header link
    Given click on English link
    Then click on select option
    And choose the language you want
    And click on change button
    Then verify language is change on website

  Scenario: user have to click all the tabs on travel menu section verify they work
    Given click on book tab
    Then verify travel text field display
    And click on flight status tab
    And verify flight number text field display
    And click on check in tab
    Then verify confirmation number display
    And click on my trips tab
    Then verify find your travel credits link clickable
    And verify new tab open with main heading

  Scenario:  user have to click all the link on home page to verify all them show some links
    Given click on book link
    Then verify all the links display
    And click on my trips link
    Then verify mange my trip and trip help text display
    And click on travel info link
    Then verify all the link under planning and day traveling are display
    And click on mileageplus link
    Then  verify all the link uder that
    And click on deals link
    Then verify under officer and destination text all link display
    And click on help link
    Then verify all the link display

  Scenario: user have to verify all the link at home page on top is display
    Given go to home page and verify links

  Scenario:  all footer link should not be broken
    Given  verify all the footer links are clickable





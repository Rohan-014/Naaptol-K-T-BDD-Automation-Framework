@tag
Feature: Unique Toys

  @tag1
  Scenario: Validating Unique toys link poduct for end test 
    Given Open the Browser, enter Naaptol url
    And Click the KidsAndToys Option from dropdown, click the unique toys link
    When select cash on delivery, select branded, select price , select discount
    And click the product , click the buy, proceed to checkout
    Then user should be on login page

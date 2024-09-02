Feature: KidsAndToys 

  @tag1
  Scenario: Validating KidsAndToys option
    Given open the browser, enter the Naaptol url
    And Click KidsAndToys option from shopping categories
    When click the soft toys link,select with cash on delivery 
    And selcect goldebHUb brand, select price,select plush toys type
    Then click the prodect user should be on same page of product
    And ckeck product available or not
    

#  @tag2
#  Scenario Outline: Title of your scenario outline
#    Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step

 #   Examples: 
 #     | name  | value | status  |
 #     | name1 |     5 | success |
 #     | name2 |     7 | Fail    |

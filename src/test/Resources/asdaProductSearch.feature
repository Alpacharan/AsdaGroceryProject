Feature:search a product
  As a user
  I want to search
  so that i can see particular product



  Scenario: search product
    Given I am on homepage
    When I select "Groceries"
    And I select "Fresh Food"
    And I select "Fruit"
    And I select "Apples, Pears & Rhubarb"
    And I select "Apples"
    Then I should see all different type of Apples
Feature: Remove Products From Cart
  Scenario: Remove the added product in cart
    Given launch browser and land home page
    And verify home page is visible
    When add product
    And click cart button
    And verify cart page
    Then click x button for particular item to remove

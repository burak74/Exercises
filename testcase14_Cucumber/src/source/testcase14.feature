Feature: Place order: Register while checkout
  Scenario:Register then order a product
    Given launch browser then landed home page
    And verify landing the home page
    When add products
    And click cart page
    Then verify landing the cart page
    And click proceed to checkout
    Then click register login button
    And fill all details
    And verify creating account click continue
    Then verify logged in as user
    When click cart button and click proceed to checkout
    When enter description comment and click place order
    And enter payment details
    And click pay and confirm
    And verify success text
    Then verify account deleted




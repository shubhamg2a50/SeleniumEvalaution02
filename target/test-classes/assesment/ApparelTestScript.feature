
Feature: Apparel & Accessories Module
 
  Scenario: Verify product election and adding to the cart 
    Given I navigate to the "Apparel & Accessories" page
    When I select a product
    And I apply the filters "Color: White" and "Size: M"
    And I sort the product by the "Price: Low to High"
    And I add the product to the cart
    Then The product should be added successfully  
    
    
  Scenario Outline: Verify checkout process
    Given I have a product in my cart 
    When I proceed to checkout 
    Then I should see the payment page

  

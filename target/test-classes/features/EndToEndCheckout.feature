#Author: NM
#Date:
#Description:

@SwagLabs
Feature: SwagLabs E2E Checkout Feature

Background:
    Given User is on SwagLabs login page

  @OrderSummaryValidation
  Scenario Outline: Validation of End to End Checkout and Order Summary
    When User enters username as <username> and password as <password>
    And User logs in to the application
    Then User is on search results page
    When User navigates to product page for product "Sauce Labs Backpack"
    And User adds product "sauce-labs-backpack" to cart from product page
    And User navigates back to search results page from product page
    Then User is on search results page
    When User adds product "sauce-labs-bike-light" to cart from search results page
    And User navigates to cart from search results page
    Then User Validates <productCount> products added to cart successfully
    When User proceeds to checkout and navigates to billing page
    And User enters billing information
    And User navigates to payment summary page
    And User validates card used for payment ends with <cardNumber>
    And User navigates to order confirmation page
    Then User validates Thank You For Your Order message is displayed
    And User validates Order Dispatched message is displayed

    Examples: 
      | username        | password     | productCount | cardNumber |
      | standard_user   | secret_sauce |     2        | 31337      |
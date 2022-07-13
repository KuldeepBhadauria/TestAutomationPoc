#Author: NM
#Date:
#Description:

@SwagLabs
Feature: SwagLabs Login Feature

Background:
    Given User is on SwagLabs login page

  @Login
  Scenario Outline: Validation of Error Message for Invalid User
    When User enters username as <username> and password as <password>
    And User logs in to the application
    Then User validates error message displayed is <errorMessage>

    Examples: 
      | username        | password     | errorMessage                                              |
      | locked_out_user | secret_sauce |Sorry, this user has been locked out                      |
      | invalid_user    | secret_sauce |Username and password do not match any user in this service|
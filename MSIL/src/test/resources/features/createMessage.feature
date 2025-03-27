#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Login & Create Message Feature

  Scenario Outline: Login into the MSIL App and create a Message
    Given Open the Browser and navigate to the URL
    Then Click on the Login Button
    When I enter username "<username>" and password "<password>"
    Then I should be logged in successfully
    Then Navigate to Message Page
    Given I am on the Message Page
    And I enter details in the message form for title "<messageTitle>" and messagebody and status "<status>"
    Then wait for 2 seconds
    Then Close the browser

    Examples: 
      | username                           | password    | user_type | messageTitle          | status    |
      | 23145@nishantsclub.onmicrosoft.com | @Redhat@735 | admin     | Title 26-March, 23145 | Published |
      | 90217@nishantsclub.onmicrosoft.com | @Redhat@735 | user1     | Title 26-March, 90217 | Published |
      | 78932@nishantsclub.onmicrosoft.com | @Redhat@735 | user2     | Title 26-March, 78932 | Published |
      | 77777@nishantsclub.onmicrosoft.com | @Redhat@735 | user3     | Title 26-March, 77777 | Published |
      | 55555@nishantsclub.onmicrosoft.com | @Redhat@735 | user4     | Title 26-March, 55555 | Published |
      | 11111@nishantsclub.onmicrosoft.com | @Redhat@735 | user5     | Title 26-March, 11111 | Published |

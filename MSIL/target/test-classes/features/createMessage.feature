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

  Scenario Outline: Log in to the MSIL App using the Admin credentials and create a message.
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
      | 23145@nishantsclub.onmicrosoft.com | @Redhat@735 | admin     | Title 02-April, 23145 | Published |

  Scenario Outline: Log in to the MSIL App using the user 90217@nishantsclub.onmicrosoft.com and create a message.
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
      | 90217@nishantsclub.onmicrosoft.com | @Redhat@735 | User 1    | Title 02-April, 90217 | Published |

  Scenario Outline: Log in to the MSIL App using the user 78932@nishantsclub.onmicrosoft.com and create a message.
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
      | 78932@nishantsclub.onmicrosoft.com | @Redhat@735 | User 2    | Title 02-April, 78932 | Published |

  Scenario Outline: Log in to the MSIL App using the user 77777@nishantsclub.onmicrosoft.com and create a message.
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
      | 77777@nishantsclub.onmicrosoft.com | @Redhat@735 | User 3    | Title 02-April, 77777 | Published |

  Scenario Outline: Log in to the MSIL App using the user 11111@nishantsclub.onmicrosoft.com and create a message.
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
      | 11111@nishantsclub.onmicrosoft.com | @Redhat@735 | User 4    | Title 02-April, 11111 | Published |

  Scenario Outline: Log in to the MSIL App using the user 55555@nishantsclub.onmicrosoft.com and create a message.
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
      | 55555@nishantsclub.onmicrosoft.com | @Redhat@735 | User 5    | Title 02-April, 55555 | Published |

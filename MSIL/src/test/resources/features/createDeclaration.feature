Feature: Declaration

  Scenario Outline: Create a Declaration Form
    Given Open the Browser and navigate to the URL
    Then Click on the Login Button
    When I enter username "<username>" and password "<password>"
    Given I am on the Dashboard navigate to Declaration Page
    When I am on the Declaration Page
    And I enter details in the declaration form
    Then wait for 2 seconds
    Then Close the browser

    Examples: 
      | username                           | password    |
      | 23145@nishantsclub.onmicrosoft.com | @Redhat@735 |
      | 90217@nishantsclub.onmicrosoft.com | @Redhat@735 |
      | 78932@nishantsclub.onmicrosoft.com | @Redhat@735 |
      | 77777@nishantsclub.onmicrosoft.com | @Redhat@735 |
      | 55555@nishantsclub.onmicrosoft.com | @Redhat@735 |
      | 11111@nishantsclub.onmicrosoft.com | @Redhat@735 |

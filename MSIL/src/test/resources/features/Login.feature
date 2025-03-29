Feature: Login functionality

  Scenario Outline: Log in to the MSIL App using the Admin credentials.
    Given Open the Browser and navigate to the URL
    Then Click on the Login Button
    When I enter username "<username>" and password "<password>"
    Then I should be logged in successfully
    Then wait for 2 seconds
    Then Close the browser

    Examples: 
      | username                           | password    |
      | 23145@nishantsclub.onmicrosoft.com | @Redhat@735 |

  Scenario Outline: Log in to the MSIL App using the user 90217@nishantsclub.onmicrosoft.com.
    Given Open the Browser and navigate to the URL
    Then Click on the Login Button
    When I enter username "<username>" and password "<password>"
    Then I should be logged in successfully
    Then wait for 2 seconds
    Then Close the browser

    Examples: 
      | username                           | password    |
      | 90217@nishantsclub.onmicrosoft.com | @Redhat@735 |

  Scenario Outline: Log in to the MSIL App using the user 78932@nishantsclub.onmicrosoft.com.
    Given Open the Browser and navigate to the URL
    Then Click on the Login Button
    When I enter username "<username>" and password "<password>"
    Then I should be logged in successfully
    Then wait for 2 seconds
    Then Close the browser

    Examples: 
      | username                           | password    |
      | 78932@nishantsclub.onmicrosoft.com | @Redhat@735 |

  Scenario Outline: Log in to the MSIL App using the user 77777@nishantsclub.onmicrosoft.com.
    Given Open the Browser and navigate to the URL
    Then Click on the Login Button
    When I enter username "<username>" and password "<password>"
    Then I should be logged in successfully
    Then wait for 2 seconds
    Then Close the browser

    Examples: 
      | username                           | password    |
      | 77777@nishantsclub.onmicrosoft.com | @Redhat@735 |

  Scenario Outline: Log in to the MSIL App using the user 11111@nishantsclub.onmicrosoft.com.
    Given Open the Browser and navigate to the URL
    Then Click on the Login Button
    When I enter username "<username>" and password "<password>"
    Then I should be logged in successfully
    Then wait for 2 seconds
    Then Close the browser

    Examples: 
      | username                           | password    |
      | 11111@nishantsclub.onmicrosoft.com | @Redhat@735 |

  Scenario Outline: Log in to the MSIL App using the user 55555@nishantsclub.onmicrosoft.com.
    Given Open the Browser and navigate to the URL
    Then Click on the Login Button
    When I enter username "<username>" and password "<password>"
    Then I should be logged in successfully
    Then wait for 2 seconds
    Then Close the browser

    Examples: 
      | username                           | password    |
      | 55555@nishantsclub.onmicrosoft.com | @Redhat@735 |

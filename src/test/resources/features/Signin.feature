Feature: Validating Login page

  
  Scenario Outline: User on login page and login with invalid inputs
    Given The user is on signin page
    When The user enter invalid "<username>" and "<password>"
    Then click login button to verify

    Examples: 
      | username | password |
      |          |          |
      |          | user     |
      | user     |          |
      
  Scenario Outline: User on login page and login with invalid and valid inputs from Excel
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber>
    Then click login button

    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |

  

  Scenario: Verifying Register link
    Given The user is on signin page
    When The user clicks on register link on signin page
    Then The user redirected to Registration page from signin page

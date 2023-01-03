@data_structure
Feature: User launch dsalgo application and test Data Structure introduction page

  Background: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "Numpysdet84" and "sdet84batch"
    And The user click on login button
    Then The user redirected to homepage

  @TS_DS_02
  Scenario: The user is able to navigate to Data Structure introduction page
    Given The user is on the "home page" after logged in
    When The user clicks the "Getting Started" button in Data Structure Page introduction Panel
    Then The user be directed to "Data Structures-Introduction" page

  @TS_DS_03
  Scenario: The user is able to navigate to Time Complexity page
    Given The user is on the "Data Structures Introduction" after logged in
    When The user clicks Time Complexity link
    Then The user should be redirected to "Time Complexity" page

  @TS_DS_04
  Scenario: The user is able to navigate to a page having an tryEditor from Time Complexity page
    Given The user is on the "Time Complexity" after logged in
    When The user clicks "Try Here" button on "Time Complexity" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_DS_05
  Scenario Outline: The user is able run code in tryEditor for Time Complexity page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_DS_06
  Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Time Complexity page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

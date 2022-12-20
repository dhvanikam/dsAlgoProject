Feature: User launch dsalgo application and test Array page

  Scenario: The user is logged in
    Given The user is on Signin page of DS Algo portal
    When The user eneter valid "Numpysdet84" and "sdet84batch"
    And The user click on login button
    Then The user redirected to homepage

  Scenario: The user is able to navigate to "ARRAY" Data Structure Page
    Given The user is on the Home page after logged in
    When The user clicks the "Getting Started" button in Array Panel or select Array item from the drop down menu
    Then The user be directed to "ARRAY" Data Structure Page

  Scenario: The user is able to navigate to Arrays in Python page
    Given The user is in the Array page after logged in
    When The user clicks Arrays in Python button
    Then The user should be redirected to Arrays in Python page

  Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is in the Arrays in Python page after logged in
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario Outline: The user is able to navigate to a page having an tryEditor
    Given The user is in a page having an tryEditor with a Run button to test
    When The user clicks on Run button after Entering valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  Scenario Outline: The user is able to navigate to a page having an tryEditor
    Given The user is in a page having an tryEditor with a Run button to test
    When The user clicks on Run button after Entering python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    Then The user should be presented with error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  Scenario: The user is able to navigate to Arrays using List page
    Given The user is in the Array page after logged in
    When The user clicks Arrays using List button
    Then The user should be redirected to Arrays using List page

  Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is in the Arrays using List page after logged in
    When The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  Scenario Outline: The user is able to navigate to a page having an tryEditor
    Given The user is in a page having an tryEditor with a Run button to test
    When The user clicks on Run button after Entering valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  Scenario Outline: The user is able to navigate to a page having an tryEditor
    Given The user is in a page having an tryEditor with a Run button to test
    When The user clicks on Run button after Entering python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    Then The user should be presented with error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

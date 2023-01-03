@array
Feature: User launch dsalgo application and test Array page

  Background: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "Numpysdet84" and "sdet84batch"
    And The user click on login button
    Then The user redirected to homepage

  @TS_array_02
  Scenario: The user is able to navigate to "ARRAY" Data Structure Page
    Given The user is on the "home page" after logged in
    When The user select Array item from the drop down menu
    Then The user be directed to "Array" Data Structure Page

  @TS_array_03
  Scenario: The user is able to navigate to Arrays in Python page
    Given The user is on the "Array page" after logged in
    When The user clicks Arrays in Python link
    Then The user should be redirected to "Arrays in Python" page

  @TS_array_04
  Scenario: The user is able to navigate to a page having an tryEditor from Arrays in Python page
    Given The user is on the "Arrays in Python page" after logged in
    When The user clicks "Try Here" button on "Arrays in Python" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_array_05
  Scenario Outline: The user is able run code in tryEditor for Arrays in Python page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_array_06
  Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Arrays in Python page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message as "NameError: name 'hello' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_array_07
  Scenario: The user is able to navigate to Arrays Using List page
    Given The user is on the "Array page" after logged in
    When The user clicks Arrays Using List link
    Then The user should be redirected to "Arrays Using List" page

  @TS_array_08
  Scenario: The user is able to navigate to a page having an tryEditor for Arrays Using List page
    Given The user is on the "Arrays Using List" after logged in
    When The user clicks "Try Here" button on "Arrays Using List" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_array_09
  Scenario Outline: The user is able run code in tryEditor for Arrays Using List page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_array_10
  Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Arrays Using List page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message as "NameError: name 'hello' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_array_11
  Scenario: The user is able to navigate to Basic Operations in Lists page
    Given The user is on the "Array page" after logged in
    When The user clicks Basic Operations in Lists link
    Then The user should be redirected to "Basic Operations in Lists" page

  @TS_array_12
  Scenario: The user is able to navigate to a page having an tryEditor f Basic Operations in Lists page
    Given The user is on the "Basic Operations in Lists" after logged in
    When The user clicks "Try Here" button on "Basic Operations in Lists" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_array_13
  Scenario Outline: The user is able run code in tryEditor for Basic Operations in Lists page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_array_14
  Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Basic Operations in Lists page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message as "NameError: name 'hello' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_array_15
  Scenario: The user is able to navigate to Applications of Array page
    Given The user is on the "Array page" after logged in
    When The user clicks Applications of Array link
    Then The user should be redirected to "Applications of Array" page

  @TS_array_16
  Scenario: The user is able to navigate to a page having an tryEditor from Applications of Array page
    Given The user is on the "Applications of Array" after logged in
    When The user clicks "Try Here" button on "Applications of Array" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_array_17
  Scenario Outline: The user is able run code in tryEditor for Applications of Array page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_array_18
  Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Applications of Array page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message as "NameError: name 'hello' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_array_19
  Scenario: The user is able to navigate to Practice page
    Given The user is on the "Arrays in Python page" after logged in
    When The user clicks Practice Questions link
    Then The user should be redirected to Practice page

  @TS_array_20
  Scenario: The user is able to navigate to Question page from Search the array link
    Given The user is on the "Practice page" after logged in
    When The user clicks the Search the array link
    Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons

  @TS_array_21
  Scenario Outline: The user is able to run code in tryEditor for Search the array link
    Given The user is on "Question" page of "Search the array" after logged in
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         2 |

  @TS_array_22
  Scenario Outline: The user is able to submit code in tryEditor for Search the array link
    Given The user is on "Question" page of "Search the array" after logged in
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
    And The user clicks on Submit button
    Then The user should be presented with successful submission message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         3 |

  @TS_array_23
  Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Search the array link
    Given The user is on "Question" page of "Search the array" after logged in
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message as "SyntaxError: bad input on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_array_24
  Scenario: The user is able to navigate to Question page from Max Consecutive Ones
    Given The user is on the "Practice page" after logged in
    When The user clicks the Max Consecutive Ones link
    Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons

  @TS_array_25
  Scenario Outline: The user is able to run code in tryEditor for Max Consecutive Ones
    Given The user is on "Question" page of "Max Consecutive Ones" after logged in
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         4 |

  @TS_array_26
  Scenario Outline: The user is able to submit code in tryEditor for Max Consecutive Ones
    Given The user is on "Question" page of "Max Consecutive Ones" after logged in
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
    And The user clicks on Submit button
    Then The user should be presented with successful submission message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         5 |

  @TS_array_27
  Scenario Outline: The user is presented with error message for invalid code in tryEditor for Max Consecutive Ones
    Given The user is on "Question" page of "Max Consecutive Ones" after logged in
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message as "SyntaxError: bad input on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_array_28
  Scenario: The user is able to navigate to Question page from Find Numbers with Even Number of Digits
    Given The user is on the "Practice page" after logged in
    When The user clicks the Find Numbers with Even Number of Digits link
    Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons

  @TS_array_29
  Scenario Outline: The user is able to run code in tryEditor for Find Numbers with Even Number of Digits
    Given The user is on "Question" page of "Find Numbers with Even Number of Digits" after logged in
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         6 |

  @TS_array_30
  Scenario Outline: The user is able to submit code in tryEditor for Find Numbers with Even Number of Digits
    Given The user is on "Question" page of "Find Numbers with Even Number of Digits" after logged in
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
    And The user clicks on Submit button
    Then The user should be presented with successful submission message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         7 |

  @TS_array_31
  Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Find Numbers with Even Number of Digits
    Given The user is on "Question" page of "Find Numbers with Even Number of Digits" after logged in
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message as "SyntaxError: bad input on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_array_32
  Scenario: The user is able to navigate to Question page from Squares of a Sorted Array
    Given The user is on the "Practice page" after logged in
    When The user clicks the Squares of a Sorted Array link
    Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons

  @TS_array_33
  Scenario Outline: The user is able to run code in tryEditor for Squares of a Sorted Array
    Given The user is on "Question" page of "Squares of a Sorted Array" after logged in
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         8 |

  @TS_array_34
  Scenario Outline: The user is able to submit code in tryEditor for Squares of a Sorted Array
    Given The user is on "Question" page of "Squares of a Sorted Array" after logged in
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
    And The user clicks on Submit button
    Then The user should be presented with successful submission message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         9 |

  @TS_array_35
  Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Squares of a Sorted Array
    Given The user is on "Question" page of "Squares of a Sorted Array" after logged in
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message as "SyntaxError: bad input on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

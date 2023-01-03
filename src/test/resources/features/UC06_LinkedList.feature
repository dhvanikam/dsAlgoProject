@linkedlist
Feature: Testing LinkedList page

  Background: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "Numpysdet84" and "sdet84batch"
    And The user click on login button
    Then The user redirected to homepage

  @TS_ll_02
  Scenario: User navigated to "linked list" page
    Given The user is on the "home page" after logged in
    When The user selecting linkedlist item from the drop down menu
    Then The user redirected to "Linked List"  Page

  @TS_ll_03
  Scenario: User navigated to "Introduction" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks Introduction link
    Then The user should be directed to "Introduction" of Linked List Page

  @TS_ll_04
  Scenario: User navigated to tryEditor page with Run button from Introduction page
    Given The user is on the "Introduction" after logged in
    When The user clicks "Try Here" button in the "introduction" page
    Then The user redirected to the page having an tryEditor with a Run button to test

  @TS_ll_05
  Scenario Outline: The user run the code in tryEditor with valid input for Introduction page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should be presented with the Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_ll_06
  Scenario Outline: The user getting error message with invalid python code for Introduction page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_ll_07
  Scenario: User navigated to "creating linked list" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks creating linked list link
    Then The user should be directed to "Creating Linked LIst" of Linked List Page

  @TS_ll_08
  Scenario: User navigated to tryEditor page with Run button from Creating a Linked List page
    Given The user is on the "Creating a Linked List" after logged in
    When The user clicks "Try Here" button in the "creating linked list" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_ll_09
  Scenario Outline: The user run the code in tryEditor with valid input for Creating a Linked List page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should be presented with the Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_ll_10
  Scenario Outline: The user getting error message with invalid python code for Creating a Linked List page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_ll_11
  Scenario: User navigated to "Types of linked list" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks the Types of Linked List button
    Then The user should be directed to "Types of Linked List" of Linked List Page

  @TS_ll_12
  Scenario: User navigated to tryEditor page with Run button from Types of Linked List
    Given The user is on the "Types of Linked list" after logged in
    When The user clicks "Try Here" button in the "types of linked list" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_ll_13
  Scenario Outline: The user run the code in tryEditor with valid input for Types of Linked List
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should be presented with the Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_ll_14
  Scenario Outline: The user getting error message with invalid python code for Types of Linked List
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_ll_15
  Scenario: user navigated to "Implementation linked list in python" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks the Implement Linked List in Python button
    Then The user should be directed to "Implement Linked List in Python" of Linked List Page

  @TS_ll_16
  Scenario: User navigated to tryEditor page with Run button from Implement Linked List in Python page
    Given The user is on the "Implement Linked List in Python" after logged in
    When The user clicks "Try Here" button in the "implemented linked list in python" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_ll_17
  Scenario Outline: The user run the code in tryEditor with valid input for Implement Linked List in Python page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should be presented with the Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_ll_18
  Scenario Outline: The user getting error message with invalid python code for Implement Linked List in Python page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_ll_19
  Scenario: user navigated to "Traversal" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks the Traversal button
    Then The user should be directed to "Traversal" of Linked List Page

  @TS_ll_20
  Scenario: User navigated to tryEditor page with Run button from Traversal page
    Given The user is on the "Traversal" after logged in
    When The user clicks "Try Here" button in the "traversal" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_ll_21
  Scenario Outline: The user run the code in tryEditor with valid input for Traversal page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should be presented with the Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_ll_22
  Scenario Outline: The user getting error message with invalid python code for Traversal page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_ll_23
  Scenario: user navigated to "Insertion" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks the Insertion button
    Then The user should be directed to "Insertion" of Linked List Page

  @TS_ll_24
  Scenario: User navigated to tryEditor page with Run button from Insertion page
    Given The user is on the "Insertion" after logged in
    When The user clicks "Try Here" button in the "Insertion" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_ll_25
  Scenario Outline: The user run the code in tryEditor with valid input for Insertion page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should be presented with the Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_ll_26
  Scenario Outline: The user getting error message with invalid python code for Insertion page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_ll_27
  Scenario: user navigated to "Deletion" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks the Deletion button
    Then The user should be directed to "Deletion" of Linked List Page

  @TS_ll_28
  Scenario: User navigated to tryEditor page with Run button from Deletion page
    Given The user is on the "Deletion" after logged in
    When The user clicks "Try Here" button in the "Deletion" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_ll_29
  Scenario Outline: The user run the code in tryEditor with valid input for Deletion page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should be presented with the Run output

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_ll_30
  Scenario Outline: The user getting error message with invalid python code for Deletion page
    Given The user is in a try here page having  tryEditor with a Run button to test
    When The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And user click on Run button
    Then The user should get the error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_ll_31
  Scenario: The user validating "Practice Questions" page
    Given The user is on the "Linked List page" after logged in
    When The user clicks Introduction link
    And The user clicks on the Practice Questions
    Then The user should be directed to Practice Questions of Linked List Page

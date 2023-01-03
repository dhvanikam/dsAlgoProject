@queue
Feature: User to sign in the dsalgo application and test Queue page

  Background: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "Numpysdet84" and "sdet84batch"
    And The user click on login button
    Then The user redirected to homepage

  @TS_queue_02
  Scenario: The user is able to navigate to Queue Data Structure Page
    Given The user is in homepage
    When The user clicks the queue item from the drop down menu
    Then The user be directed to Queue Data Structure Page

  @TS_queue_03
  Scenario: The user is able to navigate to Implementation of Queue in Python link page
    Given The user in queue page
    When The user clicks on Implementation of queue in python link
    Then The user should be directed to Implementation of Queue in Python page

  @TS_queue_04
  Scenario: The user should be directed to editor page with run button to test python code
    Given The user is in Implementation of queue in python link page
    When The user clicks on Tryhere link
    Then The user navigates to Editor page with Run button

  @TS_queue_05
  Scenario Outline: The user is able run code in Editor for Implementation of queue page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_queue_06
  Scenario Outline: The user is presented with error message for invalid code in Editor for Implementation of queue page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_queue_07
  Scenario: The user is able to navigate to queue page and click on Implementation using collections deque link
    Given The user in editor page and navigates to the queue page
    When The user clicks on Implementation using collections deque link
    Then The user should be redirected to Implementation using collections deque page

  @TS_queue_08
  Scenario: The user should be directed to editor page with run button to test python code from Implementation using collections page
    Given The user in implementation using collections page
    When The user clicks on Tryhere link
    Then The user navigates to Editor page with Run button

  @TS_queue_09
  Scenario Outline: The user is able run code in Editor for Implementation using collections page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_queue_10
  Scenario Outline: The user is presented with error message for invalid code in Editor for Implementation using collections page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_queue_11
  Scenario: The user is able to navigate to queue page and click on Implementation using array link
    Given The user in editor page and navigates to the queue page
    When The user clicks on Implementation using array link
    Then The user should be redirected to Implementation using array page

  @TS_queue_12
  Scenario: The user should be directed to editor page with run button to test python code from Implementation using array page
    Given The user in implementation using array page
    When The user clicks on Tryhere link
    Then The user navigates to Editor page with Run button

  @TS_queue_13
  Scenario Outline: The user is able to run code in Editor for Implementation using array page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_queue_14
  Scenario Outline: The user is presented with error message for invalid code in Editor for Implementation using array page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_queue_15
  Scenario: The user is able to navigate to queue page and click on Queue Operations link
    Given The user in editor page and navigates to the queue page
    When The user clicks on Queue Operations link
    Then The user should be redirected to Queue Operations page

  @TS_queue_16
  Scenario: The user should be directed to editor page with run button to test python code from Queue Operations page
    Given The user in Queue Operations page
    When The user clicks on Tryhere link
    Then The user navigates to Editor page with Run button

  @TS_queue_17
  Scenario Outline: The user is able to run code in Editor for Queue Operations page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_queue_18
  Scenario Outline: The user is presented with error message for invalid code in Editor for Queue Operations page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_queue_19
  Scenario: The user is able to navigate to QueueOp page and click on Practice Questions
    Given The user is in Editor page and navigates to QueueOp page
    When the user clicks on Practice Questions
    Then The user is directed to Practice page

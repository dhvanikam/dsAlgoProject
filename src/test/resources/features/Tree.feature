@tree
Feature: User tests the Tree page on the Ds algo application


Scenario: The user is logged in
    Given The user is on Signin page of DS Algo portal
   	When The user eneter valid "Numpysdet84" and "sdet84batch"
    And The user click on login button
    Then The user redirected to homepage
    
@TS_tree_02
Scenario: The user is directed to "Tree" Page
    Given The user is on the "home page" after logged in
    When The user selects Tree item from the drop down menu
    Then The user should be directed to the "Tree" Page  
    
@TS_tree_03  
 Scenario: The user is able to navigate to "Overview of Trees" page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Overview of Trees link
    Then The user should then be directed to Overview of Trees Page 

@TS_tree_04 
Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the "overview of trees" after logged in
    When The user clicks "Try Here" button in "tree" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
 
@TS_tree_05
   Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

@TS_tree_06
  Scenario Outline: The user is able to get the error message for invalid syantax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
 
@TS_tree_07  
   Scenario: The user is able to navigate to "Terminologies" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Terminologies button
    Then The user should be directed to Terminologies Page
    
@TS_tree_08
Scenario: The user is able to navigate to Terminologies page having an tryEditor
    Given The user is on the "terminologies page" after logged in
    When The user clicks "Try Here" button in "Terminologies" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

@Ts_tree_09
Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

@TS_tree_10
Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
      
@TS_tree_11
Scenario: The user is able to navigate to "Types of Trees" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Types of Trees button
    Then The user should be directed to Types of Trees Page

@TS_tree_12
Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the "types of trees" after logged in
    When The user clicks "Try Here" button in "tree" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

@TS_tree_13
Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
    
@TS_tree_14   
Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

@TS_tree_15      
Scenario: The user is able to navigate to "Tree Traversals" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Tree Traversals button
    Then The user should be directed to Tree Traversals Page

@TS_tree_16
Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the "tree traversals" after logged in
    When The user clicks "Try Here" button in "tree" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

@TS_tree_17
Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

@TS_tree_18
Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

@TS_tree_19
Scenario: The user is able to navigate to "Traversal illustration" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the Traversal illustration button
    Then The user should be directed to Traversal illustration Page

@TS_tree_20
Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the "traversal illustration" after logged in
    When The user clicks "Try Here" button in "tree" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

@TS_tree_21
Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
  
@TS_tree_22    
Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

@TS_tree_23      
Scenario: The user is able to navigate to "Binary trees" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the binary trees button
    Then The user should be directed to binary trees Page

@TS_tree_24  
Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the "binary trees" after logged in
    When The user clicks "Try Here" button in "tree" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

@TS_tree_25      
Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

@TS_tree_26    
Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

@TS_tree_27
Scenario: The user is able to navigate to "Types of Binary trees" Page
    Given The user is on the "Tree page" after logged in
    When The user clicks on the types of binary trees button
    Then The user should be directed to types of binary trees Page

@TS_tree_28
    Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the "types of binary trees" after logged in
    When The user clicks "Try Here" button in "tree" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

@TS_tree_29    
Scenario Outline: The user is able to run code in tryEditor
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering valid python code in trees tryEditor
    Then The user should be presented with Run output for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |  

@TS_tree_30     
Scenario Outline: The user is able to get the error message for invalid syntax
    Given The user is in trees page having an tryEditor with a Run button to test
    When The user gets invalid input from sheet "<Sheetname>" and <RowNumber> in trees
    And The user clicks on Run button after Entering invalid python code in trees tryEditor
    Then The user should get the error message for trees

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
      
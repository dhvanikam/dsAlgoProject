@graph
Feature: User launch dsalgo application and test Graph page

  Background: The user is logged in to DS Algo portal
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "Numpysdet84" and "sdet84batch"
    And The user click on login button
    Then The user redirected to homepage

  @TS_graph_02
  Scenario: The user is able to navigate to Graph Data Structure Page
    Given The user is in homepage
    When The user clicks the graph item from the drop down menu
    Then The user be directed to Graph Page

  @TS_graph_03
  Scenario: The user is able to navigate to Graph page
    Given The user is on the Graph Page
    When The user clicks Graph link on Graph page
    Then The user should be redirected to Graph Graph page

  @TS_graph_04
  Scenario: The user should be directed to editor page with run button to test python code
    Given The user navigates to Graph Graph page
    When The user clicks on Tryhere link
    Then The user should be directed to Editor page with Run button

  @TS_graph_05
  Scenario Outline: The user is able to run code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_graph_06
  Scenario Outline: The user is presented with error message for invalid code in Editor for Graph page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_graph_07
  Scenario: The user is able to navigate to graph page and click on Graph Representations link
    Given The user in editor page and navigates to the graph page
    When The user clicks on Graph Representations link
    Then The user should be redirected to Graph Representations page

  @TS_graph_08
  Scenario: The user should be directed to editor page with run button to test python code from Graph Representations page
    Given The user is in Graph Representations page
    When The user clicks on Tryhere link on graph representations page
    Then The user navigates to Editor page with Run button

  @TS_graph_09
  Scenario Outline: The user is able to run code in Editor for Graph Representations page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters valid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user is presented with the result after run button is clicked

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_graph_10
  Scenario Outline: The user is presented with error message for invalid code in Editor for Graph Representations page
    Given The user is in a page having an Editor with a Run button to test
    When The user enters invalid python code in Editor from sheet "<Sheetname>" and <RowNumber>
    And clicks run button
    Then The user gets an error message

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |

  @TS_graph_11
  Scenario: The user is able to navigate to graph representations page and click on Practice Questions
    Given The user is in Editor page and navigates to graph representations page
    When the user clicks on Practice Questions in graph representations page
    Then The user is directed to graph Practice page

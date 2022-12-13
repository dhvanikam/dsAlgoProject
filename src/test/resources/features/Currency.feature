#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@TS_001
Feature: Select the currency in the left top corner to Euro

  @TS_001_TC_001
  Scenario: user is able to select the currency
    Given is product home page
    When user click on select currency and set currency to EUR
    Then currency should set to EUR
 
 @TS_001_TC_002
  Scenario: user is able to select the currency
    Given is product home page
    When user click on select currency and set currency to EUR
    Then currency should set to EUR
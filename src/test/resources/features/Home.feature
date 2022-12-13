Feature: User launch dsalgo application

  Scenario: User launch home page of an dsalgo project
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage
    
    When The user clicks on "Get Started" link on homepage without login
    Then The user warnin message " You are not logged in"
   
Feature:  login test


   Background: user on the log in page
     Given  OPEN THE LOG IN PAGE


  Scenario: login as a driver
    Then user log in with username and password
    And user on the home page


    Scenario: log in as a storeManager
      Then manager log in with username and password
      And manager on the home page
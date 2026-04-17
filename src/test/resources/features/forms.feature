Feature: Automate forms register

  Scenario Outline: forms register

    Given go site demo "https://demoqa.com/forms"
    When input the details "<Name>" "<Lastname>" "<Email>" "<mobile>" "<current adress>"
    Then  verify that some all information is correct
    Examples:
      | Name    | Lastname | Email                   | mobile          | current adress                   |
      | Oumarou | Traore   | traore@gmail.com        | 287886575895    |   traore@gmail.com               |
      | Oumu | Traore   | traore@gmail.com        | 287886575895    |   traore@gmail.com               |
      | Oumar | Traore   | traore@gmail.com        | 2878575895    |   traore@gmail.c              |
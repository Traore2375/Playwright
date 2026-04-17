Feature: automation web tables

  Scenario Outline: add and delete somes details into table

    Given go to webtable "https://demoqa.com/webtables"
    When I enter "<Name>" "<Lastname>" "<Email>" "<Age>" "<Salary>" "<Department>"
    And click submit button
    Then verify the details of table

    Examples:
      | Name    | Lastname | Email                   | Age | Salary | Department |
      | Oumarou | Traore   | traore@gmail.com        | 28  | 45000  | BIOLOGIE   |
      | Karim   | Traore   | karim@gmail.com         | 44  | 37887  | INFO       |
      | Hatem   | Boulila  | hatem@gmail.com         | 45  | 37887  | TEST       |
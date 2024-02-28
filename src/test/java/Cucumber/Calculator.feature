Feature: calculator

  Background:   As a user

  I want to calculate to add 2 numbers
  So that i don't need to add my self

  Scenario Outline: Add two numbers
     Given I have calculator page open
     When I add <num1> and <num2>
     Then the <result> is dispalyed

    Examples:
    |num1|num2|result|
    |5   | 3 |   8  |
    |10|   5  | 15 |


#     Scenario Outline: subtract two numbers
#       Given I have calculator page open
#       When I subtract <num1> and  <num2>
#       Then  the <result> is displayed
#
#       Examples:
#         |num1|num2|result|
#         |5|    3   |   2  |
#         | 10|   5     |5 |


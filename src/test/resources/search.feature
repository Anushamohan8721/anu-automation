@search
Feature: Search
  As a customer
  I Want to search
  So That I can view or buy products


  Scenario Outline: Search for a valid product
    Given Iam on homepage
    When I search for product "<searchItem>"
    Then I should be able to see respective  products
Examples:
    |searchItem|
    |nike      |





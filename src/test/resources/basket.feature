@basket @jira-Epic-Number
Feature: Basket
  As a customer
  I want to add a product into basket
  so that i can view /purchase the products

  @smoke @jira-12345 @jira-bug
  Scenario: Add product to basket
    Given Iam on homepage
    When I search for product "puma"

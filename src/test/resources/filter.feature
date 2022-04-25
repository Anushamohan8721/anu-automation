Feature: Filters

  Scenario Outline: Filter by review
    Given Iam on homepage
    When I search for product "<searchTerm>"
    When I apply filter review by "<choice>"
    Then I should be able to see filtered results
    Examples:
    |searchTerm|choice|
    |    nike      |  4 orMore  |
    |   puma       |  3 orMore  |
    |   aj            | 4 orMore   |
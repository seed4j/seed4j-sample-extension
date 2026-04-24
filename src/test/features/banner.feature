Feature: Banner Module

  Scenario: Should add banner Seed4J v7
    When I apply "banner-seed4j-v7" module to default project without parameters
    Then I should have files in "src/main/resources"
      | banner.txt |

  Scenario: Should add banner Seed4J v7 for React
    When I apply "banner-seed4j-v7-react" module to default project without parameters
    Then I should have files in "src/main/resources"
      | banner.txt |

  Scenario: Should add banner Seed4J v7 for Vue
    When I apply "banner-seed4j-v7-vue" module to default project without parameters
    Then I should have files in "src/main/resources"
      | banner.txt |

  Scenario: Should add banner Seed4J v2
    When I apply "banner-seed4j-v2" module to default project without parameters
    Then I should have files in "src/main/resources"
      | banner.txt |

  Scenario: Should add banner Seed4J v3
    When I apply "banner-seed4j-v3" module to default project without parameters
    Then I should have files in "src/main/resources"
      | banner.txt |

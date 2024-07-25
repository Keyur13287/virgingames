Feature: Virgin BAnk Test

  Background: I am On Homepage
@sanity @author_keyur
  Scenario: To verify we can redirect to the online slots page
    Given I click on accept cookies button
    When I click On online slot button
    Then I should verify the text of page

  @author_keyur
 Scenario: To verify we can redirect to the Live Casino page

   Given I click on accept cookies button
   When I click On live casino button
   Then I should verify the text of casino page

Feature: Login functionality

@jaydev
  Scenario Outline: Validate login functionality
    Given user is on login page
    When user enters correct username <usernamefirst> and <passwordfirst>
   
    Then user is able to login successfully

    Examples:
      | usernamefirst    | passwordfirst |
      | jaydev      | 1234     | 
      | prathamesh  | 123      |

      
   @jaydev
   Scenario: data valid
    Given user is on login page
    When user enters correct username "username" and "1223"
   
    Then user is able to login successfully
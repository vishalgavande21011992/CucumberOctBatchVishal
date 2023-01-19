Feature:Login
Scenario: Sucessfully Login with valid credential

 Given User Launch Chrome Browser
 When User Open url "https://www.facebook.com/"
 And User enter Email as "vishalgavande1992@gmail.com" and password as "1234"
 And Click on login
 Then page should be open

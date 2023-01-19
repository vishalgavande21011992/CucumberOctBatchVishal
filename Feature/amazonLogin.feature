Feature:Login
Scenario: Successfully login with valid credential

Given User Launch Chrome Browser
When User open url "https://mpsconline.gov.in/candidate/login"
And User enter Email as "8956599905" 
And user enter password as "onlyvishal"
Then user enter the captch shown in box
Then click on login
And close browser

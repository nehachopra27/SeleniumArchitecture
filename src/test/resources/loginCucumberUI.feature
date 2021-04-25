Feature: validate login functionality
Scenario: Precondition to validate login functionality
Given open base url "http://a.testaddressbook.com/"
Then click on signin link

Scenario: validate login with incorrect username
Given enter username "demo12@demo.com"
Given enter password ""
Given click on submit button
Then validate login message "Bad email or password." for incorrect credentials

Scenario: validate login with incorrect password
Given enter username "demo@demo.com"
Given enter password "demo11"
Given click on submit button
Then validate login message "Bad email or password." for incorrect credentials

Scenario: validate login with correct credentials
Given enter username "demo@demo.com"
Given enter password "demo"
Given click on submit button
Then validate user login successfully "Welcome to Address Book"
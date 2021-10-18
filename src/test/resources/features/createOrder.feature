Feature: Verification of Create User API

Scenario: Access Token Generation

Given I pass the username and password and accesstoken should generated
When I pass the accesstoken and post a request
Then Order should be created


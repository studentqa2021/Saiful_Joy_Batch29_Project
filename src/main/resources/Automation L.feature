@SmokeTest1
Feature: Final Login Fuction Test

@TC_123456
Scenario: User must be successfully login with valid credential.

Given Open the Browser
And Go to the application URL

When Click the Sign in button
And Put Valid Email
And Put Valid Password
And Click the Second Sign In Button

Then Validate The Login Was Successfu.




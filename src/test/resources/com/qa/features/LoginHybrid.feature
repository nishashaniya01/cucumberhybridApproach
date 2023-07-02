Feature: Amazon Sign In from hover 

@LoginPage
Scenario Outline: Sign-In from hover 
Given user is on homepage
When user hover to Sign-In option
And click to button
And enters the "<mobilenumber>"
And clicks to Sign-In button
And enter the "<password>"
And ticks the terms&condition option
And clicks the final sign-in button
Then user should land to homepage

Examples:

| mobilenumber | password |
| 7409220105 | idontknow |
| 9634517163 | Shaniya@2023 |
| shaniyanisha95@gmail.com | Shaniya@2023 |


Scenario Outline: Sign-In from side menu

Given user is on homepage
When  User opens side menu and clicks to Hello signin title
Then  enters the "<mobilenumber>"
And clicks to Sign-In button
And enter the "<password>"
And ticks the terms&condition option
And clicks the final sign-in button
Then user should land to homepage



Examples:

| mobilenumber | password |
| 9634517163 | Shaniya@2023 |
| shaniyanisha95@gmail.com | Shaniya@2023 |

 
 
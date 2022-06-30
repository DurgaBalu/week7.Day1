Feature: Duplicate Lead in LeafTab Application

Scenario Outline: To verify the Duplicate Lead details

Given User click on the Lead button to find Duplicate 
And Click on the Find Lead button under shortcuts section 
And Click on Email ID Tab under the find Lead
And User Enter the EmailID as <EmailID>
When Click on Find leads button under Findby Section 
Then Lead list should be displayed under MyleadList 
And Capture Lead First Name
And Capture Lead Last Name 
When Click on first Lead Name from Leadlist
Then View Lead Page should be dispalyed  
When Click on Duplciate lead button 
Then Duplciate Lead Page Should be displayed 
When Click on Create leads button under duplicate lead page 
Then View Lead Page should be displayed
And Verify the Captured Lead Names are duplciates

Examples:
|EmailID|
|'durgabalu@gmail.com'|


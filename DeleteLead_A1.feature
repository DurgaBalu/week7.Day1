Feature: Delete Lead in LeafTab Application

Scenario Outline: Delete Lead 

Given User click on the Lead button to Delete 
And Click on the Find Lead button from shortcuts section to delete
And User Enter the PhoneNumber as <PhoneNumber>
When Click on Find leads button in Findby Section to delete 
Then Capture Lead ID to delete from the lead list
When Click on first Lead to delete 
Then Lead list should be displayed under Mylead 
When Click on Find lead button to check the deleted lead
And Enter the captured Lead Id in findby section 
And Click on Find leads button in Findby Section to check 
Then No records details should be displayed in Lead List

Examples:
|PhoneNumber|
|'9952447890'|


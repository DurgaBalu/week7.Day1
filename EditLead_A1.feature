Feature: Edit Lead details in LeafTab Application

Scenario Outline: Edit Lead 

Given User click on the Lead button to Edit 
And Click on the Find Lead button from shortcuts section
And User Enter the Firstname as <FirstName>
When Click on Find leads button in Findby Section
Then Leads List Details should be displayed as per Firstname
#When Click on Findby button to edit 
#Then Lead List should be displayed to edit
When Click on first Lead to edit 
Then View Lead should be display to edit 
Then get the current company Name before edit 
When click on edit button 
And Click on Clear the previous company name
And Enter the New Company Name <CompanyName>
And Click on update button 
Then New Company name should be updated






Examples:
|FirstName|CompanyName|
|'Sung'|'MH'|
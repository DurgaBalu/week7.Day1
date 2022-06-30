Feature: Create New Lead in LeafTab Application


Scenario Outline: Create New Lead 

Given User Click the Lead Tab button
And User Click on Create Lead button 
And User Enter the Company Name <Company Name>
And User Enter the First Name <First Name>
And User Enter the Last Name <Last Name>
And User Enter the First Name Local <First Name Local>
And User Enter the Depatment Name <Department Name>
And User Enter the Description <Description>
And User Enter the Primary Email <Primary Email>
And User Enter the Phone Number <PhoneNumber>
And User Enter the State <State>
When User Click on Creat Lead button
Then The Created Lead Details should be displayed

Examples:
|Company Name|First Name|Last Name|First Name Local|Department Name|Description|Primary Email|PhoneNumber|State|
|'Anisoft'|'Sung'|'Wookie'|'JiChang'|'CSE'|'Media'|'Jichang@gmail.com'|'9952447890'|'New York'|


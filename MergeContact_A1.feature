Feature: Merge Contact in LeafTab Application

Scenario: Merge the Two different Contact in LeafTab Application

Given User click on the Contact button 
And Click on Merge Contact button from shortcuts section 
Then Merge Contact page should be displayed
When Click on Widget of From Contact
Then New Window should be displayed for From Contact
When Click on First contact from Contact List
Then Verify The Merge Contact Page for from Contact List
When Click on Widget of To Contact
Then New Window should be displayed for To Contact
When Click on Second contact from Contact List
Then Verify The Merge Contact Page for To Contact List
When Click on Merge button under the Merge Contacts 
And Click on yes from Popup 
And Click on Merge button 
Then View Lead Page should be displayed
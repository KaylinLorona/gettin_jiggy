<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
<strong>C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.</strong>

- Code was added to the mainscreen.html page
- div container created to hold h1 with title of website and h2 to hold a secondary name.
- div aboutSection added to have a link to take the user to the about page.
- The CSS page was updated to add some styling for the mainscreen and aboutPage


<strong>D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.</strong>
- An aboutPage.html was added to the application
- The about page was updated to contain information about the company
- 2 pictures were added to the bottom of the aboutPage
- A link connecting the aboutPage.html to the mainscreen.html was added to

<strong>E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.</strong>
- Sample inventory was added for both the Part and Product List via the bootStrapData page 
- The 5 parts added were: guitarPick; guitarString; ampCord; guitarBridge; guitarStrap.
- The 5 products added were: acousticGuitar; electricGuitar; fourStringBass; electricGuitarAmp; electricBassAmp.
- Inventory and price were added for each item on the BootStrapData page and then were saved to their respective repository


<strong>F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.</strong>
- A buy now button was added to the product table of the mainscreen.html page. It is inline with the delete and update buttons
- The method buyNow was added to the AddProductController.java page.  This method gets the product ID first, then checks the inventory of that product. If the inventory is below 0 then the purchasefailed is returned. if the inventory is greater than 0 then the current inventory is reduced by 1 and the confirmationbuynow is returned.
- The purchasefailed.html was added to the Templates. This HTML contains a message confirming that the attempt to buy now was not successful
- the confirmationbuynow.html was added to the Templates. This HTML contains a message confirming the purchase was successful and that the inventory has been reduced by 1.


<strong>G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.</strong>


<strong>H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.</strong>


<strong>I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.</strong>


<strong>J.  Remove the class files for any unused validators in order to clean your code.</strong>
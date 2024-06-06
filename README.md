<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
<strong>C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.</strong>

- Code was added to the mainscreen.html page
- div container created to hold h1 with title of website and h2 to hold a secondary name. Added a div container for the aboutSection with link - lines 16-21:
```
<div class="container">
    <h1>Gettin Jiggy With It</h1>
    <h2 class="secondName">Guitar Musical Emporium</h2>
    <div class="aboutSection">
        <a href="/aboutPage.html">About Us</a>
</div>
```
- Added class names to the Parts h2 and search div - lines 23-24:
````
<h2 class="parts">Parts</h2>
    <div class="search">
````
- Added class name to the Products h2 and search div - lines 61-62:
````
<h2 class="products">Products</h2>
   <div class="search">
````
- The CSS page was updated to add some styling for the mainscreen and aboutPage. lines 1-76:
```
/**Main Page**/
body {
    color: #2d0754;
    background-color: #f2f3fc;
}
.container h1 {
    font-family: Cambria, serif;
    font-size: 5em;
    text-align: center;
}
.secondName {
    font-family: Cambria, serif;
    font-size: 3em;
    text-align: center;
    font-style: italic;
}
/*Main Page about section*/
.aboutSection {
    text-align: center;
}
.aboutSection a {
    text-decoration: none;
}
.aboutSection a:hover {
    font-style: oblique;
    text-decoration: underline;
}
/*Main Page Parts and Products*/
.parts {
    text-align: center;
}
.products {
    text-align: center;
}
.search {
    text-align: center;
    font-size: 1em;
}

/*About Page*/
.aboutPage h1 {
    font-family: Cambria, serif;
    font-size: 5em;
    text-align: center;
    margin-bottom: 3px;
}
.mainScreen {
    text-align: center;
    font-size: larger;
    margin-bottom: 3px;
}
.mainScreen a {
    text-decoration: none;
}
.mainScreen a:hover {
    font-style: oblique;
    text-decoration: underline;
}
.aboutDesc {
    border: 2px solid #2d0754;
    padding: 3px;
}
/*Image Section on about page*/
.guitarPics {
    display: flex;
}
.img1 {
    flex: 33.33%;
    padding: 5px;
    width: 30%;
}
.img2 {
    flex: 33.33%;
    padding: 5px;
    width: 30%;
}
```

<strong>D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.</strong>
- NEW FILE - Added the aboutPage.html to the static folder.
- added about me details describing the company - lines 1-22:
```
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/demo.css">
    <title>About Page</title>
</head>
<body class="aboutPage">
    <h1>Who We Are</h1>
    <div class="aboutDesc">
        <p>Gettin Jiggy With It - Guitar Musical Emporium is a one-stop shop for your guitar needs.  We pride ourselves in being knowledgeable about the guitars you are interested in.  We understand that the music that comes from these instruments represents art to the people who play them.</p>
        <p>We don't want to be 'just another music store' but rather your first choice when you are needing an upgrade, replace missing parts, or just want to check out what is new in the industry.</p>
        <p>With our knowledgeable staff, top tier connections, and great taste in music we hope to be the first place you think of for all your guitar needs.</p>
    </div>
    <div class="guitarPics">
        <img class="img1" src="https://images.pexels.com/photos/165971/pexels-photo-165971.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1" alt="picture of electric guitar">
        <img class="img2" src="https://images.pexels.com/photos/3714523/pexels-photo-3714523.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1" alt="Pic of acustic guitar">
    </div>
</body>
```
- 2 pictures were added to the bottom of the aboutPage - Lines 18-21:
```
    <div class="guitarPics">
        <img class="img1" src="https://images.pexels.com/photos/165971/pexels-photo-165971.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1" alt="picture of electric guitar">
        <img class="img2" src="https://images.pexels.com/photos/3714523/pexels-photo-3714523.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1" alt="Pic of acustic guitar">
    </div>
```
- A link connecting the aboutPage.html to the mainscreen.html was added - lines 10-12:
```
<div class="mainScreen">
        <a href="mainscreen">Main Screen</a>
    </div>
```
<strong>E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.</strong>
- Sample inventory was added for both the Part and Product List via the bootStrapData page 
- The 5 parts added were: guitarPick; guitarString; ampCord; guitarBridge; guitarStrap.
- The 5 products added were: acousticGuitar; electricGuitar; fourStringBass; electricGuitarAmp; electricBassAmp
- Code lines 41-116:
```
@Override
    public void run(String... args) throws Exception {

        if (partRepository.count() == 0) {

            //Creating object from the Part class
            InhousePart guitarPick = new InhousePart();
            InhousePart guitarString = new InhousePart();
            InhousePart ampCord = new InhousePart();
            InhousePart guitarBridge = new InhousePart();
            InhousePart guitarStrap = new InhousePart();

            //Setting the values for guitarPick
            guitarPick.setName("Guitar Pick");
            guitarPick.setPrice(2.99);
            guitarPick.setInv(75);
            guitarPick.setMinInv(50);
            guitarPick.setMaxInv(150);
            //Saving in the repository
            partRepository.save(guitarPick);

            //Setting the values for guitarString
            guitarString.setName("Guitar String (4 strings mix & match)");
            guitarString.setPrice(15.99);
            guitarString.setInv(100);
            guitarString.setMinInv(75);
            guitarString.setMaxInv(500);
            //Saving in the repository
            partRepository.save(guitarString);

            //Setting the values for ampCord
            ampCord.setName("Amp Cord");
            ampCord.setPrice(10.00);
            ampCord.setInv(15);
            ampCord.setMinInv(5);
            ampCord.setMaxInv(20);
            //Saving in the repository
            partRepository.save(ampCord);

            //Setting the values for guitarBridge
            guitarBridge.setName("Guitar Bridge");
            guitarBridge.setPrice(9.50);
            guitarBridge.setInv(20);
            guitarBridge.setMinInv(10);
            guitarBridge.setMaxInv(50);
            //Saving in the repository
            partRepository.save(guitarBridge);

            //Setting the values for guitarStrap
            guitarStrap.setName("Guitar Strap");
            guitarStrap.setPrice(10.50);
            guitarStrap.setInv(40);
            guitarStrap.setMinInv(10);
            guitarStrap.setMaxInv(45);
            //Saving in the repository
            partRepository.save(guitarStrap);

        }

        if (productRepository.count() == 0) {

            //Creating object form the Product Class
            Product acousticGuitar = new Product("Acoustic Guitar",129.99,4);
            Product electricGuitar = new Product("Electric Guitar", 299.99, 2);
            Product fourStringBass = new Product("Four String Bass", 179.99, 5);
            Product electricGuitarAmp = new Product("Electric Guitar Amp", 99.99, 5);
            Product electricBassAmp = new Product("Electric Bass Amp", 99.99, 3);

            //Saving in the repository
            productRepository.save(acousticGuitar);
            productRepository.save(electricGuitar);
            productRepository.save(fourStringBass);
            productRepository.save(electricGuitarAmp);
            productRepository.save(electricBassAmp);

        }
```
<strong>F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.</strong>
- A buy now button was added to the product table of the mainscreen.html page. It is inline with the delete and update buttons - line 90:
```
<a th:href="@{/buynow(productID=${tempProduct.id})}" class="btn btn-success btn-sm mb-3">Buy Now</a>
```
- The method buyNow was added to the AddProductController.java page.  This method gets the product ID first, then checks the inventory of that product. If the inventory is below 0 then the purchasefailed is returned. if the inventory is greater than 0 then the current inventory is reduced by 1 and the confirmationbuynow is returned - lines 130-141:
```
@GetMapping("/buynow")
    public String buyNow(@RequestParam("productID") int theId, Model theModel) {
        ProductService productService = context.getBean(ProductServiceImpl.class);
        Product product2=productService.findById(theId);
        if (product2.getInv() < 1) {
            return "purchasedfailed";
        }
        product2.setInv(product2.getInv() - 1);
        productService.save(product2);

        return "confirmationbuynow";
    }
 ```
- NEW FILE purchasefailed.html was added to the Templates. This HTML contains a message confirming that the attempt to buy now was not successful - lines 1-15:
```
<!DOCTYPE html>
<html lang="en">
<head>
<!--    <meta charset="UTF-8">-->
    <meta http-equiv="refresh"
          content="0;URL='mainscreen'">
    <title>Title</title>
</head>
<body>
<h1>Purchase Failed</h1>

<a href="http://localhost:8080/">Link
    to Main Screen</a>
</body>
</html>
```
- NEW FILE confirmationbuynow.html was added to the Templates. This HTML contains a message confirming the purchase was successful and that the inventory has been reduced by 1 - lines1-15:
```
<!DOCTYPE html>
<html lang="en">
<head>
<!--    <meta charset="UTF-8">-->
    <meta http-equiv="refresh"
          content="0;URL='mainscreen'">
    <title>Title</title>
</head>
<body>
<h1>Purchase Successful. Inventory has been reduced by 1.</h1>

<a href="http://localhost:8080/">Link
    to Main Screen</a>
</body>
</html>
```
<strong>G.  Modify the parts to track maximum and minimum inventory by doing the following:
- Added minInv and maxInv int's to Part.java - lines 31-32:
```
int minInv;
int maxInv;
```
- Added getter and setter for minInv and maxInv in Part.java - lines 90-96
```
public int getMinInv() { return minInv; }

    public void setMinInv(int minInv) { this.minInv = minInv; }

    public int getMaxInv() { return maxInv; }

    public void setMaxInv(int maxInv) { this.maxInv = maxInv; }
```
Added fields to the InhousPartForm.html and the OutsourcedPartForm.html to have additional text input fields for the user to set the min and max inventory - InhousePartForm.html lines 26-30
```
<p> <input type="text" path="minInv" th:field="*{minInv}" placeholder="Minimum Inventory" class="form-control mb-4 col-4"/></p>
    <p th:if="${#fields.hasErrors('minInv')}" th:errors="*{minInv}">Minimum Inventory Error </p>

<p> <input type="text" path="maxInv" th:field="*{maxInv}" placeholder="Max Inventory" class="form-control mb-4 col-4"/></p>
    <p th:if="${#fields.hasErrors('maxInv')}" th:errors="*{maxInv}">Max Inventory Error.</p>
```
-OutsourcedPartForm.html line 27-31:
```
<p> <input type="text" path="minInv" th:field="*{minInv}" placeholder="Minimum Inventory" class="form-control mb-4 col-4"/></p>
    <p th:if="*{#fields.hasErrors('minInv')}" th:errors="*{minInv}">Minimum Inventory Error </p>

<p> <input type="text" path="maxInv" th:field="*{maxInv}" placeholder="Max Inventory" class="form-control mb-4 col-4"/></p>
    <p th:if="*{#fields.hasErrors('maxInv')}" th:errors="*{maxInv}">Max Inventory Error </p>

```
- Renamed the persistent storage to include student id at end - line 6:
```
spring.datasource.url=jdbc:h2:file:~/spring-boot-h2-db102_010546727_2
```

- Created validateInv method in Part.java to determine if inventory is below min or above max - lines 106-113:
```
public void validateInv() {
        if (this.inv < this.minInv) {
            throw new RuntimeException("This value falls below required minimum.");
        }
        else if (this.inv > this.maxInv) {
            throw new RuntimeException("This value exceeds the allowed maximum.");
        }
    }
```
- Modify the sample inventory to include the maximum and minimum fields. For EACH of the 5 parts a min and max inventory was set. '*' to represent the names for each part and the following code added to each part in BootStrapData.java - lines 57-58; 66-67; 75-76; 84-85; 93-94:
```angular2html
*.setMinInv(10);
    *.setMaxInv(45);
```
- Added the following code to the OutsourcedPartServiceImpl.java - line 53:
```
thePart.validateInv();
```
- Added the following code to the InhousePartServiceImpl.java - line 54:
```
thePart.validateInv();
```
- Added the following code to the PartServiceImpl.java - line 60:
```
thePart.validateInv();
```
<strong>H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
- NEW FILE Created - ValidMinInv.java to contain custom message with inventory is too low - lines 1-24:
```
package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *
 *
 *
 */
@Constraint(validatedBy = {MinimumInv.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMinInv {
    String message() default "Inventory is below the minimum required!";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};

}
```
- NEW FILE created - MinimumInv.java - lines 1-29:
```
package com.example.demo.validators;

import com.example.demo.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
/**
 *
 *
 *
 *
 */
public class MinimumInv implements ConstraintValidator<ValidMinInv, Part> {
    @Autowired
    private ApplicationContext context;
    public static  ApplicationContext myContext;
    @Override
    public void initialize(ValidMinInv constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() > part.getMinInv();
    }
}
```
- Annotation added to Part.java - line 23:
```
@ValidMinInv
```
- Added to the InhousePartForm.html so error message displays on form if below minimum inventory value - line 32-36:
```
<div th:if="${#fields.hasErrors()}">
    <ul>
        <li th:each="err : ${#fields.allErrors()}" th:text="${err}" class="error"/>
    </ul>
</div>
```
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
- Added validation logic to isValid method in EnufPartsValidatior.java to check for min inventory. Added new block to check for min value of remaining parts after purchase decreases current inv. and added a new error message for insufficient inventory required - line 37-39:
```
if (p.getInv()<(product.getInv()-myProduct.getInv())) {
constraintValidatorContext.disableDefaultConstraintViolation();
constraintValidatorContext.buildConstraintViolationWithTemplate("Inventory is below the minimum required!");
return false;
};
```
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.</strong>
- NEW FILE Created - ValidMaxInv.java contains custom message when inventory exceeds the max - lines 1-24:
```
package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 *
 *
 *
 */
@Constraint(validatedBy = {MaximumInv.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidMaxInv {
    String message() default "Inventory exceeds the maximum allowed!";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};

}
```
- NEW FILE created - MaximumInv.java - lines 1-29:
```
package com.example.demo.validators;

import com.example.demo.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 *
 *
 *
 */
public class MaximumInv implements ConstraintValidator<ValidMaxInv, Part> {
    @Autowired
    private ApplicationContext context;
    public static  ApplicationContext myContext;
    @Override
    public void initialize(ValidMaxInv constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() <= part.getMaxInv();
    }
}
```
- Annotation added to Part.java - line 25:
```
@ValidMaxInv
```
- Added to the OutsourcedPartForm.html so error message displays on form if below minimum inventory value - line 32-36:
```
<div th:if="${#fields.hasErrors()}">
    <ul>
        <li th:each="err : ${#fields.allErrors()}" th:text="${err}" class="error"/>
    </ul>
</div>
```
<strong>I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.</strong>
- Added a getMinInv() and setMinInv() test to the PartTest.java - line 160-176:
```
@Test
void getMinInv() {
int inv=5;
partIn.setMinInv(inv);
assertEquals(inv,partIn.getMinInv());
partOut.setMinInv(inv);
assertEquals(inv,partOut.getMinInv());
}

    @Test
    void setMinInv() {
        int inv=5;
        partIn.setMinInv(inv);
        assertEquals(inv,partIn.getMinInv());
        partOut.setMinInv(inv);
        assertEquals(inv,partOut.getMinInv());
    }
```
- Added a getMaxInv() and setMaxInv() test to the PartTest.java - line 178-194
```
@Test
    void getMaxInv() {
        int inv=5;
        partIn.setMaxInv(inv);
        assertEquals(inv,partIn.getMaxInv());
        partOut.setMaxInv(inv);
        assertEquals(inv,partOut.getMaxInv());
    }

    @Test
    void setMaxInv() {
        int inv=5;
        partIn.setMinInv(inv);
        assertEquals(inv,partIn.getMinInv());
        partOut.setMinInv(inv);
        assertEquals(inv,partOut.getMinInv());
    }
```

<strong>J.  Remove the class files for any unused validators in order to clean your code.</strong>
- deleted DeleatedPartValidator.java as it had no usages.
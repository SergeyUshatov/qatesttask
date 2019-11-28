# QA TEST
1. Make a test case for facebook.com login
2. Make a test case for facebook.com register
3. A/T Populate FB register with 1000 users (forget the captcha) / Use Python or any other languages best suites you
4. Test FB login validation for all CRUD. (build using python or any other languages).

Note for step 3. and 4.:

Make a script that will generate fake emails, phone number and all required info to register on a site like FB.

It does not need to work on sites like facebook just for testing purpose.



Requirements: Script that will generate fake users, use any lib you like.

Use the same script for #4. To login on facebook with users you created (FAKE).

Use FB form not the site.

# Login test with valid credentials
Execution: 
1. enter valid email into **email** field
2. enter valid password into **password** field
3. click on "**Log In**" button

Expected:
1. login page is not shown
2. User is navigated to Facebook main page


# Register new user
Execution:
1. enter new user's first name (Sergey) into **firstname** field
2. enter new user's last name (Helloman) into **lastname** field
3. enter new user's email (hellosergey@gmail.com) into **email** field
4. enter the same email into **email confirmation** field
5. enter new user's password (abracadabra) into **password** field
6. select a birth date (Jan 1 1955) by selecting values from **birthday dropdowns**
7. choose new user's gender (male) by clicking on a **gender value**
8. click on **Sign Up** button
9. enter confirmation code that is sent to specified email
10. click on **Continue**

Expected:
1. New user is registered
2. User is on the main FB page

# A/T Populate FB register 
here src/test/java/ui_tests/RegistrationTests.java
# Test FB login validation for all CRUD
here src/test/java/ui_tests/LoginTests.java



 
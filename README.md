# BizCover_Solution
I have created the Test using data driven framework using Java language.

The Framework utilises:
1. Page object model for each page(POM Package)
2. All the static flow(generic package)
3. Testcases for each POMclass(scripts)

The test cases are executed using TestNG.xml file.

TestCases:
1. TestRegisterPage
2.TestLoginLogout

TestRegisterPage:
1. Enter the URL and navigate to lanfing page"My store"
2.Click on SignIn and navigate to Login Page
3. Enter the Email address and click on Create the Account
4. on My account page , Registration fields are displayed
5. Enter all the mandatory fields and click on Register.
6. Navigates to My Account page. 
7. Click on Signout.

2. TestLoginLogout
1. Enter the URL and navigate to lanfing page"My store"
2.Click on SignIn and navigate to Login Page
3. Enter the Email address and Password
4. click on SignIn
5. My Account page is displayed
6.Click on Logout

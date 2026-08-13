# Selenium WebDriver Automation Project (Java + Maven)

UI test automation scripts written while training in **Manual + Automation Testing (Selenium with Java)**.
The project automates end-to-end user journeys across three live demo web applications — a CRM,
an e-commerce store and a shopping cart — using Selenium WebDriver with Java.

> **Author:** Sunny Kumar — QA Tester (Manual + Automation)
> sunnyrock2904@gmail.com · [LinkedIn](https://www.linkedin.com/in/sunny-kumar-2904) · [Manual testing documentation](https://github.com/SunnyKumar2904/manual-testing-documentation)

---

## Tech Stack

| Component | Technology |
|---|---|
| Language | Java |
| Automation tool | Selenium WebDriver 4 |
| Build tool | Maven |
| IDE | Eclipse |
| Browser driver | Microsoft Edge (EdgeDriver) |
| Version control | Git / GitHub |

---

## Applications Under Test

### 1. SuiteCRM — src/test/java/com/crm_apps/login/

CRM record-creation flows against [demo.suiteondemand.com](https://demo.suiteondemand.com).

| Script | What it automates |
|---|---|
| createLead.java | Login → CREATE → Create Leads → fills 25+ fields (name, title, department, phones, website, primary & alternate address, email, description, opportunity amount, campaign) → Save |
| createAccount.java | Account record creation |
| createOpportunity.java | Opportunity record creation |
| CreateContact.java | Contact record creation |
| CreateTasks.java | Task record creation |
| createCall.java | Call record logging |
| createDocument.java | Document record creation |

### 2. Sauce Demo (Swag Labs) — SwagLabs.java

Full purchase journey on [saucedemo.com](https://www.saucedemo.com): login as standard_user,
open each of the 6 product detail pages, add every product to the cart, return to the catalogue,
open the cart, complete checkout with customer information, and finish the order.

### 3. Tricentis Demo Web Shop — src/test/java/demowebshop/loginDemoShop.java

The most complete flow in the project, against [demowebshop.tricentis.com](https://demowebshop.tricentis.com):

- **Randomised registration** — generates a unique email per run with java.util.Random, so the registration test is re-runnable without manual data cleanup
- Gender radio button, first/last name, password and confirm-password entry
- **Product search** for "laptop" and selection from the results
- Add to cart, then shipping estimation
- **Dropdown handling with the Select class** — country by selectByValue(), state by selectByVisibleText()
- Terms-of-service checkbox and checkout
- Billing address → shipping address → shipping method → payment method → payment info → order confirmation
- Opens the order details and downloads the **PDF invoice**

### 4. Gmail — src/test/java/GmailAutomation/gmailLogin.java

Login page interaction on Gmail.

---

## Selenium Concepts Demonstrated

- **Locators:** By.id, By.name, By.className, By.linkText, and XPath — attribute-based, indexed, text-based and onclick-based for JavaScript-driven buttons
- **WebElement commands:** sendKeys(), click(), element storage in WebElement references
- **Dropdowns:** the Select class — selectByValue() and selectByVisibleText()
- **Radio buttons and checkboxes:** gender selection, terms-of-service, opt-out flags
- **Multi-page navigation:** back-to-products loops, breadcrumb navigation, multi-step checkout wizards
- **Dynamic test data:** randomised email generation for repeatable registration tests
- **Browser control:** EdgeDriver initialisation and driver.get() navigation

---

## How to Run

**Prerequisites:** Java JDK 17+, Maven 3.8+, Microsoft Edge installed.

    git clone https://github.com/SunnyKumar2904/selenium-automation-project.git
    cd selenium-automation-project
    mvn clean install

Each script has a main() method, so run any of them directly.

**From Eclipse:** right-click the class → **Run As → Java Application**

**From the command line:**

    mvn exec:java -Dexec.mainClass="demowebshop.loginDemoShop"

> To run on Chrome instead of Edge, swap new EdgeDriver() for new ChromeDriver() and update the import.

---

## Related Work

Manual QA documentation for the Sauce Demo application — 16 test scenarios, 40 test cases,
a bug report, a requirement traceability matrix and a test summary report — lives here:
**[manual-testing-documentation](https://github.com/SunnyKumar2904/manual-testing-documentation)**

---

## Roadmap

These scripts are deliberately written as plain main() methods while learning WebDriver
fundamentals. Next steps, as the course progresses:

- [ ] Replace Thread.sleep() with **implicit, explicit and fluent waits**
- [ ] Convert main() methods into **TestNG** tests with annotations and assertions
- [ ] Refactor to the **Page Object Model** with Page Factory
- [ ] Externalise test data with **Apache POI** (data-driven testing)
- [ ] Add **Extent Reports** and failure screenshots via TakesScreenshot
- [ ] **Cucumber** BDD feature files
- [ ] **Jenkins** CI pipeline
- [ ] Parallel cross-browser runs on Chrome, Firefox and Edge

---

*Portfolio project. All scripts run against publicly available demo applications intended for automation practice.*

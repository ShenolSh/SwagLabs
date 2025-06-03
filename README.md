# SwagLabs Automation Project

This repository contains an automation project for the Swag Labs e-commerce website, built using Selenium WebDriver with Java and TestNG. The project aims to demonstrate robust UI test automation practices, including page object model (POM) design, reporting, and parallel test execution.

## Table of Contents

* [About Swag Labs](#about-swag-labs)

* [Features](#features)

* [Technologies Used](#technologies-used)

* [Getting Started](#getting-started)

  * [Prerequisites](#prerequisites)

  * [Installation](#installation)

  * [Running Tests](#running-tests)

* [Project Structure](#project-structure)

* [Reporting](#reporting)

* [Contributing](#contributing)

* [License](#license)

* [Contact](#contact)

## About Swag Labs

[Swag Labs](https://www.saucedemo.com/) is a demo e-commerce website specifically designed for testing purposes. It provides various functionalities, including user authentication, product browsing, adding items to the cart, and checkout processes, making it an ideal candidate for UI automation testing.

## Features

* **User Authentication:** Tests for successful login with valid credentials and handling of invalid credentials.

* **Product Management:** Ability to browse products, add/remove items from the shopping cart.

* **Checkout Process:** Automation of the complete checkout flow.

* **Data-Driven Testing:** (If implemented, mention specific examples like login with multiple user types from a data source).

* **Page Object Model (POM):** Well-structured and maintainable tests using the POM design pattern.

* **TestNG Framework:** Utilizing TestNG for test organization, annotations, and parallel execution.

* **Selenium WebDriver:** Interacting with web elements and automating browser actions.

* **Extensive Reporting:** Integration with Allure Reports for comprehensive and interactive test results.

* **Cross-Browser Testing:** (If implemented, mention which browsers are supported).

## Technologies Used

* **Java Development Kit (JDK):** Version 11 or higher

* **Selenium WebDriver:** For browser automation

* **TestNG:** Testing framework

* **Maven:** Build automation tool and dependency management

* **WebDriverManager:** To automatically manage browser drivers

* **Allure Reports:** For comprehensive test reporting

* **Log4j2:** For logging (if implemented)

## Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:

* **Java Development Kit (JDK) 11 or higher:**

  * Download from [Oracle's website](https://www.oracle.com/java/technologies/downloads/)

  * Set up `JAVA_HOME` environment variable.

* **Maven:**

  * Download from [Maven's website](https://maven.apache.org/download.cgi)

  * Set up `M2_HOME` and add to your system's PATH.

* **An IDE (e.g., IntelliJ IDEA, Eclipse):** Recommended for easier development and execution.

### Installation

1. **Clone the repository:**

   ```bash
   git clone [https://github.com/ShenolSh/SwagLabs.git]

2. **Navigate to the project directory:**

   ```bash
   cd SwagLabs
   
3. **Build the project using Maven:**

   ```bash
   mvn clean install

## Running the Tests

**Execute the test suite using Maven**

   ```bash
   mvn test
   ```
This will launch the browser and run the automated tests against the Sauce Demo website.

## Project Structure
```
SwagLabs/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── [Page Object Classes]
│   └── test/
│       └── java/
│           └── [Test Classes]
├── pom.xml
└── README.md
```
* **Page Object Classes:**  Contains classes representing different pages of the application, encapsulating the elements and actions.
* **Test Classes:** Contains test cases that validate various functionalities of the application.

## Contributing
Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

## Licence

This project is licensed under the MIT License. See the LICENSE file for details.

## Acknowledments

* [Sauce Labs](https://www.saucedemo.com/) for providing the demo e-commerce website for testing purposes.

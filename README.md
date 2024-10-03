# Naaptol BDD TestNG Automation

## Project Overview

This project focuses on automated testing of the **"Kids and Toys"** section of the Naaptol website using a BDD approach. The goal is to ensure that users can efficiently browse, select products, and apply filters for a refined shopping experience. The project leverages **Cucumber** for writing human-readable test scenarios and **TestNG** for managing test execution.

## Project Type

BDD Automation Testing

## Directory Structure

## Walkthroughs & Screenshots

- **Video Walkthrough**: [Watch Video](https://drive.google.com/file/d/1mzCV4Iu3b0H290_GIxzF2mn08bKLwj46/view?usp=sharing)
- **Screenshots**: [View Screenshots](https://drive.google.com/drive/folders/1hcqDMW809lXbPljL1XoeYNW8VbK_YJIh?usp=sharing)

## Features

- Users can browse products in the "Kids and Toys" category.
- Users can apply filters to refine search results using the checkboxes available on the left-hand side of the page.
- The automation ensures smooth navigation, product selection, and filter application.

## Installation & Getting Started

### Prerequisites

- **Java** (JDK 8 or above)
- **Maven** (for dependency management)
- **Spring Tool Suite (STS)** or any preferred IDE
- Web browser (Chrome or Firefox)

### Steps

1. **Clone the repository** or download the project from your directory.
2. **Open the project** in Spring Tool Suite or any preferred IDE.
3. **Create a new Maven project** if not already done.
4. **Add dependencies** for Selenium, Cucumber, TestNG, and any other required libraries in the `pom.xml` file.

### Directory Setup

- **features**: Store `.feature` files for defining test scenarios using Gherkin language.
- **stepDefinitions**: Contains step definition classes that map to the Gherkin steps.
- **runners**: Test runner classes to execute the tests with TestNG.
- **pageObjects**: Java classes implementing the Page Object Model (POM).

### Writing and Running Tests

1. **Feature Files**: Define test scenarios in `.feature` files located in the `features` package.
2. **Step Definitions**: Implement step definitions for the scenarios in the `stepDefinitions` package.
3. **Page Objects**: Implement page object classes in the `pageObjects` package to represent the web elements.
4. **Test Execution**: Use TestNG runners in the `runners` package to execute tests.

### Example Execution

1. Navigate to `Shopping Categories` on the Naaptol website.
2. Select the **"Kids and Toys"** category.
3. Explore product listings.
4. Apply filters for refined results.
5. Select a product from the filtered results.

## Usage

1. **Open the Naaptol website** in a browser.
2. **Navigate to "Kids and Toys"** under the "Shopping Categories."
3. **Browse and explore** available links and products.
4. **Apply filters** using the relevant checkboxes on the left-hand side.
5. **Select a product** from the filtered results for more details.

## Technologies Used

- **Java**
- **Selenium** (for browser automation)
- **Cucumber** (for BDD and human-readable scenarios)
- **TestNG** (for test execution and management)

---

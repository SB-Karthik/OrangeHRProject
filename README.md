# Selenium Automation Project - OrangeHR

## Introduction

This is an automation testing project for the OrangeHR application using Selenium WebDriver and TestNG. The project is structured to follow best practices in software development, leveraging Object-Oriented Programming (OOP) concepts for better maintainability and scalability. 

## Features

- **Login Automation**: Tests the login functionality of the OrangeHR application.
- **Employee Management**: Automates the process of adding and deleting employees.
- **Dynamic Locators**: Uses dynamic locators for flexibility in identifying web elements.

## Screenshots

![Login Page](screenshots/login_page.png)
![Add Employee Page](screenshots/add_employee_page.png)

## Troubleshooting

- **NullPointerException**: If you encounter a `NullPointerException`, ensure that the WebDriver is properly initialized and not being reused across tests that require different states.
- **Element Not Found**: If elements cannot be located, verify that the XPath or CSS selectors used are correct and that the elements are present in the DOM.

## Future Work

- Implement more comprehensive test cases for other functionalities, such as employee details editing and reports generation.
- Enhance the logging system for better traceability of test execution.

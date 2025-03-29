# MSIL App Automation Testing

This repository contains automated test scripts for the **MSIL App** using **Cucumber, Selenium, and Java**. It covers login functionality for different users and message creation after successful authentication.

## Features

### 1. Login Functionality
The test suite verifies the login functionality for different user roles, including the **Admin** and multiple standard users.

#### **Test Steps:**
1. Open the browser and navigate to the MSIL App URL.
2. Click the **Login** button.
3. Enter the provided **username** and **password**.
4. Verify successful login.
5. Wait for 2 seconds and close the browser.

### 2. Message Creation Feature
After logging in, users can create messages in the MSIL App.

#### **Test Steps:**
1. Perform login as described above.
2. Navigate to the **Message Page**.
3. Fill in the message form with a **title, message body, and status**.
4. Wait for 2 seconds and close the browser.

## Getting Started

### **Prerequisites**
- **Java JDK 8+**
- **Maven**
- **Eclipse/IntelliJ IDEA**
- **Selenium WebDriver**
- **Cucumber-JVM**
- **Git**

### **Setup Instructions**
1. **Clone the repository:**
   ```sh
   git clone https://github.com/amitkumar-kellton/MSIL.git
   cd your-repository
   ```
2. **Install dependencies:**
   ```sh
   mvn clean install
   ```
3. **Run tests:**
   ```sh
   mvn test
   ```

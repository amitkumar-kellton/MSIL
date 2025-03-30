# MSIL Test Automation Framework

## 🚀 Overview
This is a Selenium-based test automation framework using Java and Cucumber for UI testing. It follows the Page Object Model (POM) for maintainability and scalability.

## 📂 Project Structure
```
MSIL/
│── src/
│   ├── main/java/utilities/       # Helper classes (WebDriverManager, reporting, etc.)
│   ├── main/java/pages/           # Page Object Model classes
│   ├── main/java/steps/           # Step Definitions for Cucumber
│   ├── main/java/runners/         # Test runners for executing scenarios
│   ├── test/resources/features/   # Cucumber feature files
│── test-output/                   # Test reports and logs
│── pom.xml                         # Maven dependencies and configurations
│── README.md                       # Project documentation
```

## 🛠️ Setup & Installation
### Prerequisites
- Java 11 or later
- Maven installed
- Chrome/Firefox/Edge browsers installed

### Installation Steps
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/MSIL.git
   cd MSIL
   ```
2. Install dependencies:
   ```sh
   mvn clean install
   ```

## 🚦 Running Tests
Run tests with different browsers:
```sh
mvn test -Dbrowser=chrome   # Run tests on Chrome
mvn test -Dbrowser=firefox  # Run tests on Firefox
mvn test -Dbrowser=edge     # Run tests on Edge
```

## 📊 Test Reports
- Reports are generated in `test-output/`
- Open `test-output/index.html` for detailed results


Happy Testing! 🎯


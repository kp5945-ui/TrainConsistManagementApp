# Train Consist Management App

A simple Java application demonstrating train bogie management with sorting capabilities using Comparator.

## Features

- **Bogie Management**: Create and manage train bogies with name and capacity.
- **Sorting**: Sort bogies by capacity in ascending or descending order using Java Comparator.
- **Unit Tests**: Comprehensive JUnit tests for validation.

## Use Case (UC7)

Sort Bogies by Capacity (Comparator) - Demonstrates flexible sorting without modifying the Bogie class.

## How to Run

### Prerequisites

- Java 8 or higher
- JUnit 5 (for running tests)

### Compile and Run

1. Clone the repository:
   ```bash
   git clone https://github.com/kp5945-ui/TrainConsistManagementApp.git
   cd TrainConsistManagementApp
   ```

2. Compile the main application:
   ```bash
   javac src/main/java/*.java
   ```

3. Run the application:
   ```bash
   java -cp src/main/java TrainConsistManagementApp
   ```

### Run Tests

1. Download JUnit 5 JAR (e.g., junit-platform-console-standalone-1.8.2.jar) and place it in the project root.

2. Compile tests:
   ```bash
   javac -cp src/main/java;junit-platform-console-standalone-1.8.2.jar src/test/java/*.java
   ```

3. Run tests:
   ```bash
   java -cp src/main/java;src/test/java;junit-platform-console-standalone-1.8.2.jar org.junit.platform.console.ConsoleLauncher --scan-classpath
   ```

## TEST CASE CREATION & EXECUTION IN INTELLIJ (JAVA PROJECT)

### 1. WHAT IS A TEST CASE?

A test case is a small piece of code written to check whether your program works correctly.

It works like this:
- Input → Give some data
- Expected Output → What should come
- Actual Output → What your code gives

If both match → Test Passed
If not → Test Failed

### 2. WHY DO WE WRITE TEST CASES?
- To verify your code works correctly
- To catch bugs early
- To make future changes safely

### 3. WHERE TO WRITE TEST CASES IN INTELLIJ?
Project Structure:

```
src
 ├── main
 │    └── java        (your actual code)
 └── test
      └── java        (your test cases)
```

If 'test' folder is not present:
1. Right-click on src
2. Click New → Directory
3. Name it test
4. Right-click → Mark Directory as → Test Sources Root

### 4. HOW TO CREATE A TEST CASE (USING JUNIT)
**Step 1: Add JUnit Library**
- Go to File → Project Structure
- Click Libraries
- Add JUnit (JUnit5 recommended)

**Step 2: Create Test Class**
- Right-click on your class (Example: TrainConsistManagement.java)
- Click Generate → Test
- Select methods to test
- Click OK
- A test class will be created like with the same name as the class, followed by a name "Test"
- EX: TrainConsistManagementTest

**Step 3: Write a Simple Test Case**

### 5. UNDERSTANDING THE TEST CODE
- `@Test` → Marks a test method
- `assertEquals(expected, actual)` → Checks result
- If values match → Pass
- If not → Fail

### 6. HOW TO RUN TEST CASES

**Method 1: Run Single Test**
- Click the green play icon near the method
- Click Run

**Method 2: Run Entire Test Class**
- Right-click on test class
- Click Run 'ClassNameTest'

### 7. HOW TO SEE RESULTS

After running:
- Green → Test Passed
- Red → Test Failed
- Results will show:
  - Number of tests run
  - Passed / Failed count
  - Error details (if failed)

### 8. EXAMPLE OUTPUT

```
Test run finished
1 test passed
0 tests failed
```

### 9. IMPORTANT TIPS
- Always test both valid and invalid inputs
- Keep test cases simple and clear
- One test = One scenario

### 10. SUMMARY
- Test cases verify your code
- Written using JUnit
- Stored in 'test' folder
- Run using IntelliJ Run option
- Results shown instantly

## Sample Output

```
=== Train Consist Management App ===

--- UC7: Sort Bogies by Capacity (Comparator) ---

Unsorted bogies:
1. Sleeper (72 seats)
2. AC Chair (56 seats)
3. First Class (48 seats)

Sorting bogies by capacity (ascending)...
Sorting completed.

Sorted bogies (by capacity ascending):
1. First Class (48 seats)
2. AC Chair (56 seats)
3. Sleeper (72 seats)

Sorting bogies by capacity (descending)...
Sorting completed.

Sorted bogies (by capacity descending):
1. Sleeper (72 seats)
2. AC Chair (56 seats)
3. First Class (48 seats)

Key Benefits of Comparator:
✓ Flexible sorting without modifying the class
✓ Chain comparators for multiple criteria
✓ Reusable and composable
✓ Improves code readability and maintainability
✓ Supports both ascending and descending order

Program continues...
```

## Project Structure

```
src/
├── main/java/
│   └── TrainConsistManagementApp.java  # Main application and Bogie class
└── test/java/
    └── TrainConsistManagementAppTest.java  # JUnit tests
```

## Contributing

Feel free to fork and submit pull requests.

## License

This project is open source.
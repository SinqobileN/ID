## Overview
This Java console application determines a person's gender based on their South African ID number. It demonstrates string manipulation, input validation, and basic control flow in Java. The program is designed for educational and practical use, especially for developers working with South African identity data.

## 🇿🇦 South African ID Format
A South African ID number is a 13-digit numeric string with the following structure:

```
YYMMDDSSSSCAZ
```

- **YYMMDD**: Date of birth
- **SSSS**: Sequence used to determine gender
  - If the first digit of this sequence (the 7th digit overall) is **5 or greater**, the person is **male**
  - If it's **less than 5**, the person is **female**
- **C**: Citizenship status
- **A**: Usually 8 (used for historical reasons)
- **Z**: Control digit (checksum)

## Features
- Accepts a 13-digit South African ID number from the user
- Validates input length and numeric format
- Extracts gender based on the 7th digit
- Displays result clearly in the console
- Optionally loops for multiple checks

## Technologies Used
- Java (JDK 8 or higher)
- Scanner class for input
- String and character manipulation

## How to Run

### Prerequisites
- Java installed on your system
- Terminal or command prompt access

### Steps
1. Save the source code as `GenderChecker.java`
2. Compile the program:
   ```bash
   javac GenderChecker.java
   ```
3. Run the program:
   ```bash
   java GenderChecker
   ```

## Sample Output
```
Enter your South African ID number: 8001015009087
Gender: Male

Check another ID? (yes/no): yes
Enter your South African ID number: 9203051234083
Gender: Female
```

## Code Structure
- `GenderChecker.java`: Contains the main method and logic for:
  - Input handling
  - ID validation
  - Gender extraction
  - Console interaction

## Future Enhancements
- Add birthdate and citizenship extraction
- Implement checksum validation for full ID verification
- Build a GUI version using JavaFX or Swing

## License
This project is open-source and available under the MIT License.


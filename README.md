
# Address Book Application

This repository contains an Address Book application developed using JavaFX. The application allows users to manage their contacts by adding, browsing, and searching for entries in a local database.

## Description

The Address Book application provides the following functionalities:

- **Add Entry**: Allows users to add new contacts to the address book.
- **Browse All Entries**: Displays all the contacts stored in the address book.
- **Search by Last Name**: Allows users to search for contacts by their last name.

## Files

- `AddressBook.java`: Main application class that loads and displays the AddressBook's GUI.
- `AddressBookController.java`: Controller class that handles user interactions and database operations.
- `Person.java`: Represents an entry in the address book.
- `PersonQueries.java`: Contains methods for interacting with the database.
- `AddressBook.fxml`: FXML layout file for the AddressBook application.

## How to Run

1. **Clone the repository**:

2. **Set up the database**:
    - Make sure you have MySQL installed.
    - Create a database named `addressbook`.
    - Create a table `Addresses` with the following schema:
      ```sql
      CREATE TABLE Addresses (
        AddressID INT AUTO_INCREMENT PRIMARY KEY,
        FirstName VARCHAR(50),
        LastName VARCHAR(50),
        Email VARCHAR(50),
        PhoneNumber VARCHAR(15)
      );
      ```

3. **Update database credentials**:
    - Open `PersonQueries.java`.
    - Update the `URL`, `USERNAME`, and `PASSWORD` constants with your MySQL database credentials.

4. **Open the project**:
    - Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).

5. **Build the project**:
    - Build the project to resolve dependencies.

6. **Run the application**:
    - Run the `AddressBook.java` file to start the application.

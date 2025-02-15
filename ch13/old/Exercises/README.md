# kopakakisExercises
#### all exercises have a copyFromTerminalExercise___.txt file to showcase there functionality

### This README.md was automatically generated by GPT . 

## Project 1

# Lotto Number Filter - Java

This Java program reads a list of integers from a file, processes the numbers according to specific rules, and then generates combinations of six numbers (lotto sets) that meet certain criteria. These sets are saved to a file for later use. The main functionality revolves around filtering the lotto sets based on rules such as even/odd balance, contiguous numbers, and number grouping.

## Project Overview

The program performs the following steps:

1. **Read Numbers from File**: Reads a list of integers (from 1 to 49) from a file. The file should contain between 7 and 49 numbers.
2. **Sort Numbers**: Sorts the numbers in ascending order.
3. **Generate Combinations**: Creates all possible combinations of 6 numbers from the sorted list.
4. **Apply Filters**: Filters out combinations based on several criteria:
    - A maximum of 4 even numbers.
    - A maximum of 4 odd numbers.
    - A maximum of 2 consecutive numbers.
    - A maximum of 3 numbers with the same last digit.
    - A maximum of 3 numbers in the same decade (10's group).
5. **Output the Valid Combinations**: The valid combinations are written to an output file.

## Project Structure

The project consists of a single class, `Exercise101`, with multiple methods for file handling, number processing, and filtering. Here's a breakdown of each method:

### Methods

1. **`main(String[] args)`**:
    - The entry point for the program.
    - Calls methods to size the file, check the file's validity, read the numbers, sort them, and generate the lotto combinations.

2. **`fileSizer(String path)`**:
    - Takes a file path as input and counts the number of lines (numbers) in the file.
    - Returns the total number of lines, which corresponds to the number of lotto numbers.

3. **`sizeTester(String path)`**:
    - Validates that the file contains between 7 and 49 numbers.
    - Throws an error if the file contains fewer than 7 or more than 49 numbers.

4. **`fileReader(String path)`**:
    - Reads the numbers from the file and returns them as an array of integers.
    - Each number is expected to be an integer value between 1 and 49.
    - Handles exceptions for invalid input.

5. **`printToFile(int[] toPrint)`**:
    - Takes an array of numbers and writes them to an output file.
    - The file is opened in append mode to add each valid combination of numbers without overwriting the previous content.

6. **`sixSetCreator(int[] arr)`**:
    - Generates all possible combinations of 6 numbers from the sorted array using nested loops.
    - Each combination is then filtered based on the specified criteria:
        - **Even/Odd Balance**: The combination must contain no more than 4 even and no more than 4 odd numbers.
        - **Contiguous Numbers**: The combination must not have more than 2 consecutive numbers.
        - **Same Ending**: The combination cannot have more than 3 numbers with the same last digit.
        - **Same Ten**: The combination cannot have more than 3 numbers in the same decade (10's group).
    - If the combination passes all tests, it is written to the output file.

7. **Filtering Methods**:
   These methods are used to filter combinations based on the criteria:

    - **`maxFourEven(int[] arr)`**: Checks that the combination has no more than 4 even numbers.
    - **`maxFourOdd(int[] arr)`**: Checks that the combination has no more than 4 odd numbers.
    - **`isContiguous(int[] arr)`**: Ensures that there are no more than 2 consecutive numbers in the combination.
    - **`isSameEnding(int[] arr)`**: Ensures that no more than 3 numbers have the same last digit.
    - **`isSameTen(int[] arr)`**: Ensures that no more than 3 numbers belong to the same decade (10's group).



## Project 2
### Kadane's algorithm

# Maximum Sum Subarray Problem - Java Solution

## Overview

This project implements a solution to the "Maximum Sum Subarray" problem, where the goal is to find the contiguous subarray within a given array of integers that has the largest sum. The solution employs two different methods to solve the problem, with an emphasis on dynamic programming for optimal performance.

## Problem Description

Given an array of integers, the task is to find the subarray (a contiguous part of the array) whose sum of elements is the largest. The problem can be solved using an efficient linear time algorithm with a time complexity of O(n).

### Example:
For an input array `{-2, 1, -3, 4, -1, 2, 1, -5, 4}`, the subarray with the maximum sum is `{4, -1, 2, 1}`, with a sum of 6.

## Project Structure

The project is implemented with a simple class `Exercise102` containing the following methods:

### 1. `main(String[] args)`
- This is the entry point of the program. It:
    - Initializes an example array.
    - Calls two different methods for calculating the maximum sum subarray.
    - Prints the results to the console.

### 2. `maxSubArrFirst(int[] arr)`
- This method uses a brute force approach to find the maximum sum subarray.
- It iterates over all possible subarrays (by using two nested loops) and calculates their sums.
- It tracks the subarray with the largest sum and returns it.

**Time Complexity:** O(n^2)  
**Space Complexity:** O(n)

### 3. `maxSubArrSecond(int[] arr)`
- This method uses Kadane's Algorithm, which is an efficient linear-time algorithm to find the maximum sum subarray.
- It iterates through the array, maintaining a running sum and keeping track of the largest sum found so far.
- If adding the current element results in a larger sum, it continues the current subarray. If not, it starts a new subarray from the current element.

**Time Complexity:** O(n)  
**Space Complexity:** O(n)

### 4. `printerArr(int[] arr)`
- This helper method prints the elements of an array, separated by a pipe symbol (`|`).

## Key Concepts

- **Kadane’s Algorithm**: This algorithm is widely used to solve the maximum subarray problem efficiently in linear time.
- **Brute Force Approach**: Although not optimal, it provides an easy-to-understand solution by checking all possible subarrays.


## Project 3
## Problem Description

The task is to read a text file, analyze the characters (ignoring whitespaces), and store their frequencies in a 128x2 array. The first position of the array holds the character (if it hasn't already been encountered), and the second position stores the count of occurrences of that character. After processing the entire file, the program displays the frequencies of each character, sorted first by character and then by frequency.

### Key Steps:
1. **File Reading**: The application reads each character from the file.
2. **Whitespace Removal**: It removes whitespace characters such as spaces, tabs, and line breaks.
3. **Character Counting**: It counts the frequency of each character.
4. **Sorting**: The characters are sorted by frequency.
5. **Display Results**: Finally, the program displays each character along with its frequency.

## Project Structure

The project is implemented within the `Exercise103` class, which includes several methods to handle different parts of the task. These methods are outlined below:

### 1. `main(String[] args)`
- The entry point of the program.
- It orchestrates the workflow by:
    - Determining the size of the file.
    - Reading the file content.
    - Removing whitespaces.
    - Indexing characters and counting their occurrences.
    - Printing the sorted frequency data.

### 2. `fileSizer(String path)`
- This method calculates the size of the file in terms of the total number of characters.
- **Time Complexity**: O(n), where n is the number of characters in the file.

### 3. `fileReader(String path, int size)`
- This method reads the file and stores each character in an array.
- **Time Complexity**: O(n), where n is the number of characters in the file.

### 4. `whitespaceLength(char[] fullTextChar)`
- This method counts the number of whitespace characters in the text.
- **Time Complexity**: O(n), where n is the number of characters in the file.

### 5. `spaceRemover(char[] fullTextChar)`
- This method removes all whitespace characters from the character array.
- **Time Complexity**: O(n), where n is the number of characters in the file.

### 6. `arrayIndexer(char[] fullTextCharClean)`
- This method indexes the characters and counts their frequencies.
- It stores the count in a 2D array, where the first column holds the count and the second column holds the ASCII value of the character.
- **Time Complexity**: O(n), where n is the number of characters in the file.

### 7. `printer(int[][] charMap)`
- This method prints the sorted character frequency data.
- **Time Complexity**: O(n log n) due to the sorting of the character frequency array.

### 8. `bubbleSort(int[][] charMap)`
- This method sorts the character map array based on the frequency counts using the Bubble Sort algorithm.
- **Time Complexity**: O(n^2), where n is the size of the character map.

### 9. `swap(int[][] arr, int i, int j)`
- This helper method swaps two elements in the 2D array.

## Example Workflow

1. **File Read**: The file is read character by character.
2. **Whitespace Removal**: All whitespaces are removed from the array of characters.
3. **Character Indexing**: Each character is indexed and counted in a 128x2 array.
4. **Sorting**: The character counts are sorted by frequency using Bubble Sort.
5. **Display**: The sorted characters and their frequencies are printed.

## Project 4

# Tic-Tac-Toe Game - Java Implementation

This project is a simple console-based implementation of the Tic-Tac-Toe (Three-in-a-Row) game in Java. It allows two players to take turns playing with "X" and "Y" on a 3x3 grid. The game ends when one player wins by aligning three of their marks in a row, column, or diagonal, or when the board is full with no winner (draw).

## Project Structure

### Main Class: `Exercise104`

The main class controls the flow of the game, alternating turns between the two players and handling input and output. It contains the following methods:

### Methods

- **`main(String[] args)`**  
  Starts the game loop. It initializes the game board, handles player turns, checks for game over conditions, and asks if the players want to play again after a game ends.

- **`gridCreator()`**  
  Creates and returns a 3x3 board initialized with empty spaces (" "). It represents the Tic-Tac-Toe grid where the players will make their moves.

- **`gameplay(String[][] board, Scanner in)`**  
  Handles the game loop where players take turns. It alternates between player "X" and player "Y". After each turn, it checks if the game has ended (draw, "X" wins, or "Y" wins).

- **`xRound(String[][] board, Scanner in)`**  
  Manages player "X"'s turn. It clears the screen, displays the current game board, and prompts player "X" to make a move. It validates the move and updates the board.

- **`yRound(String[][] board, Scanner in)`**  
  Similar to `xRound`, this method manages player "Y"'s turn. It performs the same operations, allowing "Y" to place their mark on the board.

- **`showGrid(String[][] board)`**  
  Displays the current state of the board on the console. It prints the grid with the "X" and "Y" marks and the dividers between rows.

- **`moveChecker(String[][] board, int[] move)`**  
  Checks if the player's move is valid. It ensures that the chosen row and column are within the valid range and that the selected spot is not already taken.

- **`clearScreen()`**  
  Clears the console screen by printing 50 newlines. This is used to refresh the view after each player's move.

- **`isGameOver(String[][] board)`**  
  Checks the game status after each move. It calls other methods (`drawChecker`, `xWinChecker`, `yWinChecker`) to determine if the game has ended in a draw, or if either player has won.

- **`drawChecker(String[][] board)`**  
  Checks if the game has ended in a draw. It returns `true` if there are no empty spots left on the board.

- **`xWinChecker(String[][] board)`**  
  Checks if player "X" has won the game. It checks all possible winning combinations (rows, columns, diagonals).

- **`yWinChecker(String[][] board)`**  
  Similar to `xWinChecker`, but checks for a win by player "Y".

- **`winChecker(String c, String[][] board)`**  
  A helper method that checks if a given player (either "X" or "Y") has won by aligning three of their marks in a row, column, or diagonal.

## How to Play

1. The game starts with an empty 3x3 grid.
2. Player "X" and Player "Y" take turns to enter their moves.
3. To make a move, a player must input the column (0, 1, or 2) and the row (0, 1, or 2) where they want to place their mark.
4. The game will announce the result after every game (win or draw).
5. Players can choose to play again after a game ends.

## Additional Notes

- This implementation uses a simple console interface. To restart the game, players will be asked if they want to play again after each game.
- The screen is cleared between turns to give a fresh view of the board after each move (note that this feature is implemented via printing 50 newlines).
- Input validation ensures players can only choose valid positions on the grid.

## Project 5

# Theater Seat Booking System

This is a Java project designed to simulate a theater seat booking and cancellation system for a theater with 30 rows and 12 columns. The program uses a 2D array (boolean[][]) to represent the seating layout, where `true` indicates that a seat is available and `false` means it has been booked.

## Project Structure

### 1. **Main Class: `Exercise105`**

The project consists of a single class `Exercise105` which handles the booking and cancellation of theater seats. The core functionality is implemented through a set of methods that interact with the 2D array representing the theater's seating chart.

### 2. **Key Methods**

#### `main(String[] args)`
This is the entry point of the application. It initiates the theater array, prompts the user for input, and continuously asks for booking or cancellation choices until the user decides to exit.

#### `reRun(Scanner in)`
This method prompts the user whether they want to exit the program or perform another operation (book/cancel a seat). It returns `true` if the user wants to continue and `false` otherwise.

#### `userInt(Scanner in, boolean[][] theater)`
This method asks the user whether they want to book or cancel a seat. It then prompts for the column letter (A-L) and row number (1-30), and checks if the seat is available for booking or cancellation. It returns an array with the user's choice (1 for booking, 2 for cancellation), column number, and row number.

#### `columnNumInterface(Scanner in)`
Prompts the user for a valid column letter (A-L) and row number (1-30). It ensures that the user provides valid input and returns the corresponding column number and row number.

#### `letterNumConventor(String ch)`
Converts a column letter (A-L) to its corresponding column number. For example, 'A' becomes 1, 'B' becomes 2, and so on.

#### `numLetterConventor(int num)`
Converts a column number back to its corresponding letter. For example, 1 becomes 'A', 2 becomes 'B', etc.

#### `checkAvailability(int column, int row, boolean[][] theater)`
Checks if a specific seat (given by column and row) is available (not booked). Returns `true` if the seat is available and `false` if it is already booked.

#### `arrayInitialiser(boolean[][] theater)`
Initializes the theater array, marking all seats as available (`true`). This method sets up the seating layout before any bookings are made.

#### `book(char column, int row)`
Books a seat at the specified column and row by setting the corresponding value in the theater array to `false`.

#### `cancel(char column, int row)`
Cancels the booking of a seat at the specified column and row by setting the corresponding value in the theater array to `true`.

#### `clearScreen()`
Clears the console screen by printing 40 empty lines. This helps in creating a cleaner output interface for the user.

#### `displayBooked()`
Displays all the booked seats in the theater by iterating through the theater array. Booked seats are shown in the format "ColumnRow", e.g., "A1", "B2".

#### `isEmpty()`
Checks if all seats in the theater are available (not booked). Returns `true` if all seats are available, and `false` if any seat is booked.

## Usage

1. **Book a Seat:**
   To book a seat, the user chooses the option to book (1), then selects a seat by specifying the column letter (A-L) and row number (1-30).

2. **Cancel a Seat:**
   To cancel a booking, the user chooses the option to cancel (2), then selects the seat they wish to cancel by specifying the column letter (A-L) and row number (1-30).

3. **Exit or Re-run:**
   After each booking or cancellation, the user is prompted whether they want to exit the program or continue with another operation.



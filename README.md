## Assignment Deadline Tracker
# Project Goal
The goal of this project is to create a simple program that helps students keep track of assignments and deadlines. Students often have work spread across multiple classes, which can make it difficult to remember what is due and what has already been completed.
# MVP Scope
Version 1.0 will allow users to:
- Add an assignment with a course name, assignment name, and due date
- View all assignments and their due dates
- Mark assignments as completed
- Save assignments so they remain available after the program closes
# Future Plans
Future versions may include:
- Sorting assignments by due date or course
- Showing assignments due within the next 7 days
- Adding High, Medium, and Low priority levels
# Tech Stack
- Java
- Java standard library
- Scanner
- ArrayList
- LocalDate
- Java file I/O
- CSV file storage
- Git and GitHub
# Data Storage
Assignment information will be stored in a CSV file. Each assignment will contain the course name, assignment name, due date, and completion status.
# External Data Sources
This project does not use any external APIs or data sources. Assignment information is entered manually by the user.

## How to Run

1. Make sure Java JDK 11 or newer is installed.
2. Open a terminal in the project directory.
3. Compile the program:

   javac -d out src/Assignment.java src/Main.java

4. Run the program:

   java -cp out Main

## Features

- Add assignments with a course name, title, and due date
- View all assignments and their completion status
- Mark assignments as completed
- Save assignments to a CSV file
- Automatically load saved assignments when the program starts
- Handle invalid menu selections and date inputs

## Current Limitations

- Assignments cannot be edited or deleted.
- Assignments are displayed in the order they were added.
- Course and assignment names cannot contain commas.
- There are no automatic deadline reminders.
- The application uses a command-line interface.
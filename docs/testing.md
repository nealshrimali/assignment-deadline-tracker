| # | Test | Test Input / Action | Expected Result | Actual Result | Status |
|---|---|---|---|---|---|
| 1 | Add assignment | Enter valid course, name, and due date | Assignment added successfully | Assignment added successfully | Passed |
| 2 | Invalid date | Enter an invalid date | Error message displayed | Error message displayed | Passed |
| 3 | Mark complete | Select an existing assignment | Completion status changes | Status changed to Completed | Passed |
| 4 | Restart program | Exit and restart application | Previously saved data loads | Data preserved after restart | Passed |
| 5 | View assignments | Add multiple assignments and select option 2 | All assignments displayed | All assignments displayed | Passed |
| 6 | Empty assignment list | Select option 2 with no assignments saved | "No assignments found" displayed | Correct message displayed | Passed |
| 7 | Empty assignment name | Enter a blank assignment name | Input rejected | Blank name rejected | Passed |
| 8 | Comma in assignment name | Enter "Essay, Draft" | Input rejected | Input rejected | Passed |
| 9 | Invalid menu selection | Enter 9 or abc | Error displayed and menu returns | Error displayed; menu returned | Passed |
| 10 | Invalid assignment number | Select an assignment number that doesn't exist | Error message displayed | Correct error message displayed | Passed |
| 11 | Sorting by due date | Add assignments with different due dates out of order | Earliest deadline appears first | Assignments displayed chronologically | Passed |
| 12 | Completion after sorting | Complete an assignment using its displayed number | Correct assignment marked completed | Correct assignment marked completed | Passed |
| 13 | CSV file contents | Open `data/assignments.csv` after adding assignments | Correct assignment information stored | CSV contains correct assignment data | Passed |
| 14 | Completion persistence | Mark assignment complete, exit, and restart | Assignment remains completed | Completion status preserved | Passed |
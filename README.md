# University of Huddersfield Campus Help System

A menu-driven Java console application that helps campus visitors find information about university services and academic departments.

## Project background

Created by **Prakash Bahadur G C** for **XFX1063: Software Design & Development**, International Study Centre, University of Huddersfield. Original portfolio submitted on **29 May 2025**.

## Features

- Browse Student Services, Library, IT Support and Sports Centre information.
- View locations, opening hours, contact details, facilities and directions.
- Explore three academic departments through a submenu.
- Validate numeric menu choices and yes/no responses.
- Make repeated queries or exit the application.

## Skills demonstrated

Java, console input with `Scanner`, methods, conditional statements, loops, input validation and basic program decomposition.

## Run locally

Install a Java Development Kit (JDK 8 or newer). From the repository root:

```bash
mkdir -p build
javac -encoding UTF-8 -d build src/UoHCampusHelpSystem.java
java -cp build UoHCampusHelpSystem
```

On Windows, create the `build` folder in File Explorer or use `mkdir build`, then run the same Java commands.

## Example interaction

```text
Enter your choice:
1. Student Services
2. Library
3. IT Support
4. Sports Centre
5. Academic Departments
6. Exit
Enter your choice (1-6): 2
```

## Portfolio preparation

Source code was extracted from the original Word portfolio. One small correction makes selecting **6. Exit** close the application immediately instead of asking whether to make another query.

## Limitations and future improvements

Campus information is hard-coded coursework data from 2025 and has not been verified as current. This is an independent student project, not an official university service.

Possible improvements include loading information from a file, separating campus data from menu logic, handling end-of-input gracefully, and adding automated tests or a graphical interface.

import java.util.Scanner;

public class UoHCampusHelpSystem {
    static Scanner scanner = new Scanner(System.in);  // global scanner for user input

    public static void main(String[] args) {
        int choice;   // local variable to store user choices

        System.out.println("Welcome to the University of Huddersfield Campus Help System! 🙏🙏"); // welcome message
        do {
            displayMenu();   // display menu
            choice = getUserChoice(); // get valid user input
            handleSelection(choice); // handle the selected option
        } while (choice != 6 && continueQuery());   // loop to allow multiple queries or exit

        scanner.close();   // close scanner and exit
        System.out.println("Thank you for using the UoH Campus Help System.");
    }

    static void displayMenu() { // function to display main menu
        System.out.println("\nEnter your choice:");
        System.out.println("1. Student Services");
        System.out.println("2. Library");
        System.out.println("3. IT Support");
        System.out.println("4. Sports Centre");
        System.out.println("5. Academic Departments");
        System.out.println("6. Exit");
    }

    static int getUserChoice() {  // function to get valid user input
        int choice = 0;
        boolean validInput = false;

        do {
            System.out.print("Enter your choice (1-6): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 6) {  //to check if choice is between 1 to 6
                    validInput = true;
                } else {
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // clear invalid input
            }
        } while (!validInput); // loop until a valid input is received

        return choice;
    }
    static void handleSelection(int choice) {  // function to handle the user selection
        String location; // local variable to store location information

        if (choice == 1) {
            location = "Student Central, Barbara Hepworth Building";
            System.out.println("\nStudent Services");
            System.out.println("Location: " + location);
            System.out.println("Opening Hours: Monday-Friday, 8:30 AM - 5:00 PM");
            System.out.println("Contact: 📞 01484-471001, 📩: studentservices@hud.ac.uk");
            System.out.println("Utilities: iPoint Helpdesk, Student's Union, Student support Services, " +
                    "Food and drink outlets, Hudlet office,Job Shop and careers Services");
            System.out.println("Directions: From the BH building, level 2, head straight and turn left.");
        } else if (choice == 2) {
            location = "Schwann Building, Level 4";
            System.out.println("\nLibrary");
            System.out.println("Location: " + location);
            System.out.println("Opening Hours: Monday-Friday, 8:00 AM - 10:00 PM");
            System.out.println("Contact: 📞 01484-473888, 📩: library@hud.ac.uk");
            System.out.println("Utilities: Study rooms and spaces, Online resources and books, " +
                    "laptop loans, Print collection, Information skills Training");
            System.out.println("Directions: Enter Schwann Building level 4, head straight and turn left.");
        } else if (choice == 3) {
            location = "Schwann Building, Level 4";
            System.out.println("\nIT Support");
            System.out.println("Location: " + location);
            System.out.println("Opening Hours: Monday-Friday, 9:00 AM - 5:00 PM");
            System.out.println("Contact: 📞 01484-473737, 📩: it.support@hud.ac.uk");
            System.out.println("Utilities: Access to campus resources, Printing facilities, " +
                    "Help with VLE(Virtual Learning Environment)," +
                    "Digital Skill Training, Wi-Fi access");
            System.out.println("Directions: From the library entrance, go straight to the IT help desk");
        } else if (choice == 4) {
            location = "Student Central, Level 3 ";
            System.out.println("\nSports Centre");
            System.out.println("Location: " + location);
            System.out.println("Opening Hours: Monday-Sunday, 8:00 AM - 9:00 PM");
            System.out.println("Contact: 📞 01484-258674, 📩: activehud@hud.ac.uk");
            System.out.println("Utilities: Gym membership, swimming, access to KAL fitness centers across Kirkless," +
                    " Sports activities, Wellbeing Programs ");
            System.out.println("Directions: Follow the signs to Student Central and head towards active hud at level 3.");
        } else if (choice == 5) {
            showAcademicDepartments();  // show academic departments sub-menu
        } else if (choice == 6) {
            System.out.println("Preparing to exit...");
        }
    }

    static void showAcademicDepartments() { // function to display academic departments sub-menu
        int deptChoice = 0; // Initialising to 0 to avoid uninitialized variable error in sub-function
        boolean validInput = false;

        System.out.println("\nAcademic Departments");
        System.out.println("1. School of Computing and Engineering");
        System.out.println("2. School of Business");
        System.out.println("3. School of Arts and Humanities");

        do {   //validating department choices
            System.out.print("Enter your choice (1-3): ");
            if (scanner.hasNextInt()) {
                deptChoice = scanner.nextInt();
                if (deptChoice >= 1 && deptChoice <= 3) {  // checking if choices are between 1 and 3
                    validInput = true;
                } else {
                    System.out.println("Invalid choice! Please enter a number between 1 and 3.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next(); // clear invalid input
            }
        } while (!validInput);

        scanner.nextLine();   // to clear buffer from query


        if (deptChoice == 1) {   // displaying department details
            System.out.println("\nSchool of Computing and Engineering");
            System.out.println("Location: Sparck Jones Building, 3rd Floor");
            System.out.println("Contact: computing@hud.ac.uk");
            System.out.println("Key Courses: Computer Science, Mechanical Engineering");
        } else if (deptChoice == 2) {
            System.out.println("\nSchool of Business");
            System.out.println("Location: Barbara Hepworth Building");
            System.out.println("Contact: business@hud.ac.uk");
            System.out.println("Key Courses: Business Management, Accounting, Finance, Business Administration ");
        } else if (deptChoice == 3) {
            System.out.println("\nSchool of Arts and Humanities");
            System.out.println("Location: Danphe Steele Building");
            System.out.println("Contact: arts@hud.ac.uk");
            System.out.println("Key Courses: English Literature, History, Drama, Fashion, Journalism and Media");
        }
    }

    static boolean continueQuery() {   // function to check if user wants to continue
        String response;
        System.out.print("\nWould you like to make another query? (yes/no): ");
        response = scanner.next();


        while (isInvalidResponse(response)) { // check if input is valid
            System.out.print("Please enter 'yes' or 'no': ");
            response = scanner.next();
        }

        return response.equalsIgnoreCase("yes");
    }


    static boolean isInvalidResponse(String response) {   //to check if response is invalid
        // return if input is neither yes nor no
        return !response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no");
    }

}

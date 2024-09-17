// Multi Dimensional Array Example (we will use 4-dimensional array)
/* We Want To Store The Grade of Students in A University(e.g Federal University Dutse) Where
 1. They Are 3 Faculties (Computing, Sciences, Clinical Science)
 2. Let Say Each Faculty Has 4 Departments
 -Computing: Sofware Engineering, Computer Sci, Information Tech, Cyber-Security
 3. Let Say Each Department has 6 courses(i.e Each Course is represented
  by it course code CSE for Software Engineering)
 4.And Each Course Has 8 Semester(First And Second Semester for a year
  i.e 8/2 = 4 years duration)*/

import java.util.Scanner;

public class University {

    public static void main(String[] args) {
        // 4D array: [faculties][departments][semesters][courses]
        String[][][][] university = new String[3][4][8][6]; // 3 faculties, 4 departments, 8 semesters, 6 courses per semester
        double[][][][] grades = new double[3][4][8][6]; // Array to store grades for each course

        // Populate the university array
        // Faculty 1: Computing (Software Engineering, Computer Science, Information Technology, Cyber Security)
        university[0][0][0] = new String[] {"SE101", "SE102", "SE103", "SE104", "SE105", "SE106"};  // Software Engineering - Semester 1
        university[0][0][1] = new String[] {"SE201", "SE202", "SE203", "SE204", "SE205", "SE206"};  // Software Engineering - Semester 2
        university[0][0][2] = new String[] {"SE301", "SE302", "SE303", "SE304", "SE305", "SE306"};  // Software Engineering - Semester 3
        university[0][0][3] = new String[] {"SE401", "SE402", "SE403", "SE404", "SE405", "SE406"};  // Software Engineering - Semester 4
        university[0][0][4] = new String[] {"SE501", "SE502", "SE503", "SE504", "SE505", "SE506"};  // Software Engineering - Semester 5
        university[0][0][5] = new String[] {"SE601", "SE602", "SE603", "SE604", "SE605", "SE606"};  // Software Engineering - Semester 6
        university[0][0][6] = new String[] {"SE701", "SE702", "SE703", "SE704", "SE705", "SE706"};  // Software Engineering - Semester 7
        university[0][0][7] = new String[] {"SE801", "SE802", "SE803", "SE804", "SE805", "SE806"};  // Software Engineering - Semester 8

        // Faculty 2: Sciences (Biology, Chemistry, Physics, Mathematics)
        university[1][0][0] = new String[] {"BIO101", "BIO102", "BIO103", "BIO104", "BIO105", "BIO106"};  // Biology - Semester 1
        university[1][0][1] = new String[] {"BIO201", "BIO202", "BIO203", "BIO204", "BIO205", "BIO206"};  // Biology - Semester 2

        // Faculty 3: Clinical Sciences (Public Health, Environmental Health, Nursing, Pharmacy)
        university[2][0][0] = new String[] {"PH101", "PH102", "PH103", "PH104", "PH105", "PH106"};  // Public Health - Semester 1
        university[2][0][1] = new String[] {"PH201", "PH202", "PH203", "PH204", "PH205", "PH206"};  // Public Health - Semester 2

        // Create scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Step 1: Select a Faculty
        String[] faculties = {"Computing", "Sciences", "Clinical Sciences"};
        System.out.println("Select a Faculty:");
        for (int i = 0; i < faculties.length; i++) {
            System.out.println(i + ": " + faculties[i]);
        }
        int facultyIndex = scanner.nextInt();

        // Step 2: Select a Department
        String[][] departments = {
            {"Software Engineering", "Computer Science", "Information Technology", "Cyber Security"},
            {"Biology", "Chemistry", "Physics", "Mathematics"},
            {"Public Health", "Environmental Health", "Nursing", "Pharmacy"}
        };
        System.out.println("Select a Department in " + faculties[facultyIndex] + ":");
        for (int i = 0; i < departments[facultyIndex].length; i++) {
            System.out.println(i + ": " + departments[facultyIndex][i]);
        }
        int departmentIndex = scanner.nextInt();

        // Step 3: Select a Semester
        System.out.println("Select a Semester (0 to 7): ");
        int semesterIndex = scanner.nextInt();

        // Step 4: Display the Courses in that Semester
        System.out.println("Courses offered in Semester " + (semesterIndex + 1) + " for " + departments[facultyIndex][departmentIndex] + ":");
        for (int i = 0; i < university[facultyIndex][departmentIndex][semesterIndex].length; i++) {
            System.out.println((i + 1) + ": " + university[facultyIndex][departmentIndex][semesterIndex][i]);
        }

        // Allow the user to select a course to view more information
        System.out.println("Select a Course Number (1 to 6) to view more information:");
        int courseIndex = scanner.nextInt() - 1;

        // Display the selected course
        String selectedCourse = university[facultyIndex][departmentIndex][semesterIndex][courseIndex];
        System.out.println("You selected the course: " + selectedCourse);

        // Step 5: Store and display the grade for the selected course
        System.out.println("Enter the grade for " + selectedCourse + ":");
        double grade = scanner.nextDouble();

        // Store the grade
        grades[facultyIndex][departmentIndex][semesterIndex][courseIndex] = grade;

        // Display the stored grade
        System.out.println("The grade you entered for " + selectedCourse + " is: " + grades[facultyIndex][departmentIndex][semesterIndex][courseIndex]);
    }
}

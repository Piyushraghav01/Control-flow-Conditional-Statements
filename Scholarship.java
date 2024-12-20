/*
 * write a program to determine whether a student is eligible for a
 * scholarship based on their grades or stars recieved in sports.
 * only after student has cleared the scholarship exam
 * Scholarship exam cutOff: 65
 * GPA should be >= 3.5
 * stars in sports >= 3
 */

import java.util.*;

class Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks in exam ");
        double marks = sc.nextDouble();

        System.out.println("Enter the GPA ");
        double gpa = sc.nextDouble();

        System.out.println("Enter the stars in sports ");
        int stars = sc.nextInt();

        // write the logic here
        if (marks >= 65 && (gpa >= 3.5 || stars >= 3)) {
            System.out.println("Congratulations! You are Eligible.");
        } else {
            System.out.println("We are Sorry. You are not Eligible.");
        }

        sc.close();

    }
}

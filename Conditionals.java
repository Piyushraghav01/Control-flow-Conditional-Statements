import java.util.Scanner;

class Conditionals {
    public static void main(String[] args) {
        // if Condition
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks % 2 == 0) {
        System.out.println("Even Number");
        }

        System.out.println("Outside if");

        // If - else Statement

        // if(num %2 == 0){
        // System.out.println("Even Number");
        // }
        // else{
        // System.err.println("Odd Number");
        // }

        // if-else-if

        // if(marks >= 90){
        // System.out.println("A+");
        // }
        // else if(marks >= 80){
        // System.out.println("A");
        // }
        // else if(marks >= 70){
        // System.out.println("B");
        // }

        if (marks >= 70 && marks < 80) {
            System.out.println("B");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A");
        } else if (marks >= 90) {
            System.out.println("A+");
        }else{
            System.out.println("Passed");
        }

        sc.close();

    }

}

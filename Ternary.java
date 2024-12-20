import java.util.Scanner;

class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        // int greatest = num1 < num2 ? 
        // (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
        int greatest = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);


        // if (num1 > num2) {
        // greater = num1;
        // } else {
        // greater = num2;
        // }

        System.out.println("The Greater number is: " + greatest);
        sc.close();

    }

}

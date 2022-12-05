package LabAssignment2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        System.out.println("Enter Distance");
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextDouble();

        double meters = 1000*distance;
        double feet = 3280.8399*distance;
        double inch = 39370.0787*distance;
        double centi = 10e5*distance;

        System.out.println(meters);
        System.out.println(feet);
        System.out.println(inch);
        System.out.println(centi);
    }
}

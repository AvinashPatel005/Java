package LabAssignment2;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        System.out.println("Enter Radius of Hemisphere");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        double volume  = Math.PI*(2.0/3)*Math.pow(radius,3);
        double surface = Math.PI*3*Math.pow(radius,2);

        System.out.println(volume);
        System.out.println(surface);

    }
}

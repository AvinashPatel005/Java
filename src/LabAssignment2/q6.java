package LabAssignment2;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        System.out.println("Enter Time");
        Scanner sc = new Scanner(System.in);
        double time = sc.nextDouble();
        double g =32.174;
        double feet_distance = 0.5*g*Math.pow(time,2);
        System.out.println(feet_distance);
    }
}

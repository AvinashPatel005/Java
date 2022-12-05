package LabAssignment2;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        System.out.println("Basic Salary");
        Scanner sc = new Scanner(System.in);
        double bs = sc.nextDouble();

        double da = 0.4*bs;
        double hra = 0.2*bs;
        double gs = bs + hra + da;

        System.out.println(gs);
    }
}

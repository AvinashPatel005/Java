package LabHomeAssignment2;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        System.out.println("Enter Time");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();

        int year = time/(365*24*60);
        int day = (time%(365*24*60))/(24*60);

        System.out.println(year);
        System.out.println(day);
    }
}

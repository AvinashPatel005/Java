package LabHomeAssignment2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        System.out.println("Enter No. of eggs");
        Scanner sc = new Scanner(System.in);
        int eggs = sc.nextInt();

        int gross = eggs/144;
        int aboveGross = eggs%144;
        int dozen = aboveGross/12;
        int extra = aboveGross%12;

        System.out.println(gross);
        System.out.println(dozen);
        System.out.println(extra);
    }
}

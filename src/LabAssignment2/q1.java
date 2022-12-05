package LabAssignment2;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        System.out.println("Enter Temperature in Degree Fahrenheit :");
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = (f-32)*5.0/9;

        System.out.println(f+"Degree Fahrenheit is "+c+" Degree Celcius");
    }
}

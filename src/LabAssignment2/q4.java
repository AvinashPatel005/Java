package LabAssignment2;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        System.out.println("Enter number between 0 and 1000");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        if(num>=0&&num<=1000){
            for (;num!=0;num=num/10){
                sum = sum + num%10;
            }
            System.out.println(sum);
        }
        else System.out.println("Please Enter num between 0 And 1000");
    }
}

package NumberProblems;

import java.util.Scanner;

// Numbers whose square ends with the number itself. eg 25--625 & 76--5776

public class AutomorphicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int numSquare = (int)Math.pow(num , 2);

        int count=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }

        if(num == numSquare%Math.pow(10,count)){
            System.out.println("AutoMorphic Number");
        }
        else System.out.println("No");
    }
}

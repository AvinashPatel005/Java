package NumberProblems;

import java.util.Scanner;

//Number whose sum of factorial of digits is equal to number itself. eg 145 .

public class PetersonNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int facSum = 0;

        for(int temp = x ; temp!=0 ;temp = temp/10){

            int remainder = temp%10;
            int fact = 1;

            for (int i = 1 ; i<=remainder;i++){
                fact = fact * i;
            }

            facSum = facSum + fact ;

        }

        if(facSum == x) System.out.println("Peterson Number");
        else System.out.println("No");
    }
}

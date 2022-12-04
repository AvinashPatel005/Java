package NumberProblems;

import java.util.Scanner;

//Number whose consecutive number is a perfect Square. eg 80
public class SunnyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  num = sc.nextInt();

        FindPerfectSquare(num+1);


    }
    static void FindPerfectSquare(int num){
        int square = 0;
        for(int i = 0 ;i<=num;i++){
            square = 0;
            square = i*i;
            if(square == num){
                break;
            }
        }
        if (square == num){
            System.out.println("Sunny Number");;
        }
        else System.out.println("No");;
    }
}

package NumberProblems;
// 153 == 1^3+5^3+3^3;
//1634 == 1^4 + 6^4 + 3^4 + 4^4
public class ArmstrongNum {
    public static void main(String[] args) {
        int num = 1634;

        int squareDigits = 0;
        int digits = 0;

        for(int temp = num ; temp != 0 ; temp=temp/10 ){
            digits++;
        }

        for (int temp = num ; temp != 0 ; temp = temp/10){
            squareDigits = squareDigits + (int)Math.pow((temp%10),digits);
        }

        if(num == squareDigits) System.out.println("Armstrong Number");
        else System.out.println("No");
    }
}

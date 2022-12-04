package NumberProblems;

public class pailindromeNum {
    public static void main(String[] args) {

        int num = 23032;
        int backup = num ;
        int reverseNum =0;

        for(;num!=0;num=num/10){
            reverseNum = reverseNum*10 + num%10;
        }

        if(backup==reverseNum){
            System.out.println("Pailindrome Number");
        }
        else System.out.println("NO");

    }
}

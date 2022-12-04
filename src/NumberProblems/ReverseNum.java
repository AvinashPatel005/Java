package NumberProblems;

public class ReverseNum {
    public static void main(String[] args) {
        int x = 4213;
        int rev = 0;

        for(;x!=0;x=x/10){
            int remainder = x%10;
            rev = (rev*10)+remainder;
        }
        System.out.println(rev);
    }
}

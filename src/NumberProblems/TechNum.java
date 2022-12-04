package NumberProblems;


// 2025 ---> 20 && 25 --> 20+25= 45 ---> 45^2 --->2025

public class TechNum {

    public static void main(String[] args) {

        int num = 2025;
        int digits=0;

        for(int temp = num ; temp!=0;temp=temp/10){
            digits++;
        }

        int firstHalf = num/(int)Math.pow(10,(digits/2));
        int secondHalf = num%(int)Math.pow(10,(digits/2));

        if((int)Math.pow(firstHalf+secondHalf,2)==num){
            System.out.println("Tech Number");
        }
        else System.out.println("no");

    }

}

package LabAssignment2;

public class q7 {
    public static void main(String[] args) {
        System.out.println("a b pow(a,b)");
        for(int a = 1;a<=5;a++){
            int b =a+1;
            int cal = (int)Math.pow(a,b);
            System.out.println(a+" "+b+" "+cal);
        }
    }
}

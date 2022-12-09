package Patterns;

public class pattern2 {
    public static void main(String[] args) {
        int num = 1;
        int limit = 5;

        for (int i = 0;i<limit;i++){
            for(int j = limit - i;j>0;j--){
                System.out.print(" ");
            }
            for (int k=limit-i;k<=limit;k++){
                System.out.print(num);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

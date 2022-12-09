package Patterns;

public class pattern1 {
    public static void main(String[] args) {
        int n = 1;
        int limit = 8;
      for(int k =0 ;k<=limit;k++){
          for (int i = limit-k ;i>0;i--){
              System.out.print(" ");
          }
          for (int j = limit-k;j<=limit;j++){
              System.out.print(n);
              System.out.print(" ");
          }
          n++;
          System.out.println();
      }
    }
}

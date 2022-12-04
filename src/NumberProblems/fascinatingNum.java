package NumberProblems;

public class fascinatingNum {
    public static void main(String[] args) {

        int num = 2019;

        int num2 = num*2;
        int num3 = num*3;
        boolean flag = true;

        String finalNum =""+num+num2+num3;

        for(char c = '1';c<='9';c++){
            int count=0;
            for(int i = 0;i<finalNum.length();i++){
                if(finalNum.charAt(i)==c){
                    count++;
                }
            }
            if(count == 0 || count > 1){
                flag = false ;
                break;
            }
        }
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}

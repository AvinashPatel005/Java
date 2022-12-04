package NumberProblems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class KiethNum {
    public static void main(String[] args) {

        int num = 742;
        int j  =3;

        ArrayList<Integer> series = new ArrayList<Integer>(); // ArrayList does not have pre-defined limit.

        for(int temp = num; temp!=0;temp=temp/10){
            series.add(temp%10);
        }
        Collections.reverse(series);                          // this reverses the arrayList.
        int element = series.get(0);

        for (int i = 0 ;;i++){
            int x=series.get(i) + series.get(i+1) + series.get(i+2);
            series.add(x);
            if(x==num){
                System.out.println("yes");
                break;
            }
        }
    }



}

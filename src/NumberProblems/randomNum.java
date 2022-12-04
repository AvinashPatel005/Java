package NumberProblems;
//Math.random() generates random double [0,1)
public class randomNum {
    public static void main(String[] args) {
        System.out.println(Math.random());

        //for printing num between [max,min)
        int min = 10;
        int max = 20;

        System.out.println(((max - min)*Math.random())+min);
    }
}

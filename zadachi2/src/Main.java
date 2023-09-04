import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] sp = new int[1000];
        for (int i=0; i<sp.length; i++){
            sp[i]=new Random().nextInt(10000);
        }
        int min = 10000;
        int min21 = 10000;
        int min3 = 10000;
        int min7 = 10000;
        for (int i : sp){
            if (i<min){
                min = i;
            }
            if (i<min21 && i%21==0){
                min21 = i;
            }
            if (i<min3 && i%3==0){
                min3 = i;
            }
            if (i<min7 && i%7==0){
                min7 = i;
            }
        }
        min = min*min21;
        min3 = min3 * min7;
        if (min==10000 || min21==10000 || min3==10000 || min7==10000){
            System.out.println("-1");
        }
        else if (min>min){
            System.out.println(min);
        }
        else{
            System.out.println(min3);
        }
    }
}
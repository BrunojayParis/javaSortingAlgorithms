import java.lang.Math;

public class Sort {
    public static void main(String[] args) {

        int[] arrayNumbers = new int[100];
        generator(arrayNumbers);
        for (int num : arrayNumbers){System.out.println(num);}







    }
    public static void generator(int[] a){
        for (int i=0; i< a.length; i++){
            a[i]= (int) (Math.random()*(1000+1));
        }
    }
}

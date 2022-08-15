import java.lang.Math;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {

        int[] arrayNumbers = new int[100];
        generator(arrayNumbers);
        for (int num : arrayNumbers) {
            System.out.println(num);
        }

        Scanner response = new Scanner(System.in);
        int algo;
        System.out.println("Select Sorting Algorithm:\n1)Quick Sort \n2)Merge Sort");
        algo = Integer.parseInt(response.nextLine());
        long startTime = 0;
        if (algo == 1) {
            startTime = System.nanoTime();
            QuickSort.quicksort(arrayNumbers);

        }
        if (algo == 2) {
            startTime = System.nanoTime();
            MergeSort.mergeSort(arrayNumbers);

        }

        for (int num : arrayNumbers) {
            System.out.println(num);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;
        System.out.println(duration + " miliseconds");


    }

    public static void generator(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (1000 + 1));
        }
    }
}

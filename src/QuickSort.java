public class QuickSort {

    public static void  quicksort(int[] nums){ quicksort(nums,0, nums.length-1);}
    private static void quicksort(int[] nums, int first, int last) {
        int central, pivot, i, j;
        central = (first + last) / 2;
        pivot = nums[central];
        i = first;
        j = last;
        do {
            while (nums[i] < pivot) {
                i++;
            }
            while (nums[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(nums, i, j);
                i++;
                j--;
            }
        } while (i <= j);
        if (first < j) {
            quicksort(nums, first, j);
        }
        if (i < last) {
            quicksort(nums, i, last);
        }

    }

    private static void swap(int[] nums, int i, int j) {
        int aux = nums[i];
        nums[i] = nums[j];
        nums[j] = aux;
    }
}

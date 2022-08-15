public class MergeSort {
    public static void mergeSort(int[] nums){ mergeSort(nums,0,nums.length-1);}
    private static void merge(int[] nums, int first, int mid, int last){
        int i,j,k;
        int n1 = mid-first+1;
        int n2 = last-mid;

        //Temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        //Copy data to temporary arrays
        for (i=0;i<n1;i++){
            leftArray[i]=nums[first+i];
        }
        for (j=0;j<n2;j++){
            rightArray[j]=nums[mid+1+j];
        }

        i=0;//initial index from first subarray
        j=0;//initial index from second subarray
        k=first;//initial index from merged subarray

        while (i<n1 && j<n2){
            if (leftArray[i]<=rightArray[j]){
                nums[k]=leftArray[i];
                i++;
            }else {
                nums[k]=rightArray[j];
                j++;
            }
            k++;
        }
        while (i<n1){
            nums[k]=leftArray[i];
            i++;
            k++;
        }
        while (j<n2){
            nums[k]=rightArray[j];
            j++;
            k++;
        }

    }
    private static void mergeSort(int[] nums, int first, int last){
        if (first<last){
            int mid = (first+last)/2;
            mergeSort(nums,first,mid);
            mergeSort(nums,mid+1,last);
            merge(nums,first,mid,last);
        }
    }
}

public class SelectionSort {
    public static void selection(int[] nums){
        int i,j,small;
        int n = nums.length;
        for (i=0;i<n;i++){
            small=i;
            for (j=i+1;j<n;j++){
                if (nums[j]<nums[small]){
                    small = j;
                }
            }
            //swap the minimum element with the first element
            int aux = nums[small];
            nums[small]= nums[i];
            nums[i]=aux;
        }
    }
}

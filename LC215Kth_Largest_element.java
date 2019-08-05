/*
Find the kth Largest element in an Array 

Example: 
Input: [3,2,1,5,6,4] and k=2
Output :5
Input: [3,2,3,1,2,4,5,5,6] and k =4
Output: 4


Use quickselect to find Kth largest or smallest element

Author: JG
Time: 13/06/2019
*/

// class LC215{
//     public int findKthLargest (int[] nums, int k){
//         return select(nums, k-1);
//     }
//     private int select(int[] nums, int k){
//         int mid = start +(end - start)/2;
//         int pivot = choosePivot(nums[mid],nums[start], nums[end]);

//     }


// }
class LC215 {
    public int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length == 0|| k<=0) return 0;
        randomize(nums);
        int left = 0, right = nums.length-1;
        int target = nums.length -k+1;
        while(left <= right){
            int pivotIndex = partition(nums, left, right);
            if (target == pivotIndex +1){
                return nums[pivotIndex];
            }else if(target <pivotIndex +1){
                right =pivotIndex -1;
            }else{
                left = pivotIndex +1;
                
            }
        }
        return 0;
    }
    
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j] = temp;
    
    }
    private void randomize(int[] nums){
        Random rand = new Random();
        for (int i =nums.length -1; i>0;i--){
            int r = rand.nextInt(i+1);
            swap(nums,i,r);
        }
    }
    private int partition(int[] nums,int left,int right){
        int pivot = right;
        int slow = left -1;
        int fast = left;
        while(fast < pivot ){
            if(nums[fast] >nums[pivot])
                fast++;
            else{
                slow++;
                swap(nums,fast,slow);
                fast++;
            }
        }
            slow++;
            swap(nums,slow,pivot);
            return slow;
    }
}
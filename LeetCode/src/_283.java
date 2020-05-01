/** Slow solution regarding time complexity */
class Solution {
    public void moveZeroes(int[] nums) {
        for(int i = 0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i] == 0){
                   if(nums[j] == 0){
                       continue;
                   }
                   else{
                       int temp = nums[j];
                       nums[j] = nums[i];
                       nums[i] = temp;
                   }
               }
           }
       }
    }

    /** Fast performant solution  */
    public void moveZeroes(int [] nums){
        int pos = 0;
        for (int i=0;i<nums.length;i++){
            if(nums[i] !=0 ){
                if(i != pos){
                    int temp = nums[i];
                    nums[i] = nums[pos];
                    nums[pos] = temp;
                }
                pos++;

            }
        }
    }
}
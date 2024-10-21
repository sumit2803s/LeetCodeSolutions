class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
         int count=0;
        int product=1;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                product*=nums[j];
                if(product<k){
                    count++;
                }
                else{
                    break;
                }
            }
            product=1;
        }
        return count;
    }
}
class Solution {
    public int[] sortedSquares(int[] nums) {
        int size = nums.length;
        int start = 0, end = size-1;
        int[] ans = new int[size];

        while(start<=end){
            if(Math.abs(nums[start]) > Math.abs(nums[end])){
                ans[size-1] = nums[start]*nums[start];
                start++;
            } else{
                ans[size-1] = nums[end]*nums[end];
                end--;
            }
            size--;
        }
        return ans;
    }
}
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] nums=new int[2001];
        for(int i=0;i<arr.length;i++)
        {
            nums[arr[i]+1000]++;
        }
        Arrays.sort(nums);
        for(int i=0;i<2000;i++)
        {
            if(nums[i]!=0 && nums[i]==nums[i+1]){
                return false;
            }
        }
        return true;
    }
}
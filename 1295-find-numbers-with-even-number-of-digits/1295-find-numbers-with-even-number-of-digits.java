class Solution {
    public int findNumbers(int[] nums) {
      String [] str = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i] = Integer.toString(nums[i]);
        }
        int count = 0;
        for(int j=0;j<nums.length;j++){
            if(str[j].length() % 2 ==0){
                count++;
            }
        }
        return count;  
    }
}
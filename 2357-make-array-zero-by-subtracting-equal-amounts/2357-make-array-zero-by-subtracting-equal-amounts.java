class Solution {
    public int minimumOperations(int[] nums) {
         Set<Integer> ans=new HashSet();
        for(int i: nums)
        {
            if(i>0)
                ans.add(i);
        }
        return ans.size();
    }
}
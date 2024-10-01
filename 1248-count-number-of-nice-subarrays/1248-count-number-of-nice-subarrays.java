class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]%2;
        }
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int sub=sum-k;
            if(map.containsKey(sub)){
                result+=map.get(sub);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return result;
    }
}
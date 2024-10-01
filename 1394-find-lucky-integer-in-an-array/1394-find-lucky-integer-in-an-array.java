class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int luck=-1;
        for(int nums:arr)
        {
            map.put(nums,map.getOrDefault(nums,0)+1);
        }
          
        for(int value:map.keySet()){
            if(value==map.get(value)) luck=Math.max(luck,value);
        }
        return luck;
        
    }
}
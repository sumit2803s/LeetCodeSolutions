class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=nums.length;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Integer temp[]=new Integer[n];
        for(int i=0;i<n;i++){
            temp[i]=nums[i];
        }
        Arrays.sort(temp, new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                if(map.get(a)==map.get(b)){
                    return b-a;
                }return map.get(a)-map.get(b);
            }
        });
         for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
       return nums;
    }
}
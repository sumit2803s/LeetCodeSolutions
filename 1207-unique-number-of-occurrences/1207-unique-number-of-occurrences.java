class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i:arr)
        mp.put(i,mp.getOrDefault(i,0)+1);
        HashSet<Integer> set = new HashSet<>(mp.values());
        if(mp.size()==set.size())
        return true;
        return false;
    }
}
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr=new int[26];
    	for(char c:s.toCharArray()) {
    		arr[c-'a']++;
    	}
    	int num=arr[s.charAt(0)-'a'];
    	for(int i:arr) {
    		if(i!=0 && num!=i) {
    			return false;
    		}
    	}
    	return true;
    }
}
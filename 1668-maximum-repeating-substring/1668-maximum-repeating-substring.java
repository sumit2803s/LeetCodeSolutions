class Solution {
    public int maxRepeating(String sequence, String word) {
         int n = sequence.length(), m = word.length();
        int max = 0;
        for(int i = 0;i < n;i++) {
            int cnt = 0, k = 0;
            for(int j = i;j < n;j++) {
                if(sequence.charAt(j) == word.charAt(k)) k++;
                else break;
                if(k == m) {
                    k = 0;
                    cnt++;
                }
            }
            max = Math.max(max, cnt);
        }
        return max;
    }
}
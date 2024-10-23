class Solution {
    public String reverseWords(String s) {
        char[] chars=s.toCharArray();
        int left=0;
        int right;
        for(right=0;right<=chars.length;right++)
        {
            if(right==chars.length || chars[right]==' ') {
                reverse(chars,left,right-1);
                left=right+1;
            }
        }
        return new String(chars);
        
    }
    public void reverse(char[] s,int left,int right) {
        while(left<right) {
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}
class Solution {
    public int minAddToMakeValid(String s) {
          int bracket = 0,len = s.length(), res=0;
        for(int i=0; i<len; i++){
            if(s.charAt(i)=='('){
                bracket++;
            } else{
                bracket--;
            }
            if(bracket<0){
                res++;
                bracket++;
            }
        }
        return res+bracket;
    }
}
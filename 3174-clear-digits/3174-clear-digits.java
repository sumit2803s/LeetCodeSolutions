class Solution {
    public String clearDigits(String s) {
        Stack<Character> s1 = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!s1.isEmpty() && Character.isDigit(ch)) {
                s1.pop();
            } else {
                s1.push(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        while (!s1.isEmpty()) {
            res.append(s1.pop());
        }
        return res.reverse().toString();
    }
}
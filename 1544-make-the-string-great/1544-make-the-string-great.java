class Solution {
    public String makeGood(String s) {
        Stack<Character> s1 = new Stack<>();
        for (char c : s.toCharArray()) {

            if ((!s1.isEmpty() && Math.abs(c - s1.peek()) == 32)) {
                s1.pop();
            }

            else {
                s1.push(c);
            }
        }
        StringBuilder good = new StringBuilder();
        while (!s1.isEmpty()) {
            good.append(s1.pop());
        }
        return good.reverse().toString();
    }
}
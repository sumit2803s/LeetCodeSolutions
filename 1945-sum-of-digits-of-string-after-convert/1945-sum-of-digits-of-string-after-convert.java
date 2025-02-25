class Solution {
    public int getLucky(String s, int k) {
         int num = 0;
        for (char c : s.toCharArray()) {
            int temp = c - 'a' + 1;
            while (temp > 0) {
                num += temp % 10;
                temp /= 10;
            }
        }
        k -= 1;
        for (int i = 0 ; i < k ; i++) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
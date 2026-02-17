// User function Template for Java

class Solution {
    public static ArrayList<Integer> factorial(int n) {
        // code here
      ArrayList<Integer> res = new ArrayList<>();
        res.add(1);   // 1! = 1

        for (int i = 2; i <= n; i++) {
            int carry = 0;

            for (int j = 0; j < res.size(); j++) {
                int prod = res.get(j) * i + carry;
                res.set(j, prod % 10);
                carry = prod / 10;
            }

            while (carry > 0) {
                res.add(carry % 10);
                carry /= 10;
            }
        }

        Collections.reverse(res);
        return res;
    }
}
class Solution {
    public int smallestSubWithSum(int x, int[] arr) {
        
        int n = arr.length;
        int start = 0;
        int sum = 0;
        int minLen = n + 1;   
        
        for (int end = 0; end < n; end++) {
            
            sum += arr[end];   
            
          
            while (sum > x) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }
        
        if (minLen == n + 1)
            return 0;
        
        return minLen;
    }
}

// User function Template for Java

import java.util.*;

class Solution {
    
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        
        int n = arr.size();
        
       
        if (m == 0 || n == 0)
            return 0;
        
        if (m > n)
            return -1;
        
  
        Collections.sort(arr);

        int minDiff = arr.get(m - 1) - arr.get(0);
        

        for (int i = 1; i <= n - m; i++) {
            int diff = arr.get(i + m - 1) - arr.get(i);
            minDiff = Math.min(minDiff, diff);
        }
        
        return minDiff;
    }
}

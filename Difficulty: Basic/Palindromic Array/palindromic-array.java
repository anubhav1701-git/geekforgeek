class Solution {
    public boolean isPalinArray(int[] arr) {
        
        for(int i = 0; i < arr.length; i++) {
            int num = arr[i];
            
            if(!isPalindrome(num)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;
        
        while(num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        
        return original == reverse;
    }
}

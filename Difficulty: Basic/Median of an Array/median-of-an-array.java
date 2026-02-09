class Solution {
    public double findMedian(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        if (n % 2 == 0) { 
            int mid1 = arr[n / 2 - 1];
            int mid2 = arr[n / 2];
            return (mid1 + mid2) / 2.0;
        } else { 
            return arr[n / 2];
        }
    }
}

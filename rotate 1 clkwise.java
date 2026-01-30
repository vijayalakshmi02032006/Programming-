class Solution {
    public int[] rotate(int[] arr) {
        // code here
        int i;
        int n=arr.length;
        int t=arr[n-1];
        for(i=n-1;i>0;i--)
        {
             arr[i] = arr[i - 1];
        }
       arr[0]=t; 
      return arr;
    }
}
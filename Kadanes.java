class Solution {
    int maxSubarraySum(int[] arr) {
       
        int n=arr.length;
        int res=arr[0];
        int cs=arr[0];
        if(n==0)
        {
          return 0;
        }
        for(int i=1;i<n;i++)
          {
          cs= Math.max(arr[i], cs + arr[i]);
            
          res = Math.max(res, cs);}
        return res;
    }
}

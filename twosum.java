class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
               if(target==arr[i]+arr[j])
               {
                   return true;
               }
            }
        }
        return false;
    }
}




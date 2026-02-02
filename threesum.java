class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        int i,j,k;
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                for(k=j+1;k<arr.length;k++){
               if(target==arr[i]+arr[j]+arr[k])
               {
                   return true;
               }
            }
        }}
        return false;
    }
}

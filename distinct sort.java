class Solution {
    public int[] sort012(int[] arr) {
        int i,j,t;
        for(i=0;i<arr.length-1;i++)
        {
            for(j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        return arr;
        
    }
}
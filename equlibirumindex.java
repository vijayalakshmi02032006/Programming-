class Solution {
    public static int findEquilibrium(int arr[]) {
     int ls=0;
     int ts=0;
     int i;
     for( i=0;i<arr.length;i++)
     {
         ts=ts+arr[i];
     }
     for( i=0;i<arr.length;i++)
     {
         ts=ts-arr[i];
     
     if(ls==ts)
     {
         return i;
     }
    ls=ls+arr[i];
     }
    return -1;
    }
}

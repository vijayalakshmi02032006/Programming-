class Solution {
    public boolean checkPerfectNumber(int num) {
        int s=0;
        int temp=num;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
            s=s+i;
            }
         }    
         if (s==temp)
    {
        return true;
    }  return false; 
}}

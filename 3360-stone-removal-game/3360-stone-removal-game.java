class Solution {
    public boolean canAliceWin(int n) {
        if(n<10)
            return false;

        int a=10;
        int b=9;

        while(n>0)
        {
            
            if(a>b)
                {
                    n=n-a;
                    a=b-1;
                }
            if(b>n)
                return true;
            if(a<b)
            {
                n=n-b;
                b=a-1;
            }

            if(a>n)
                return false;
        }
        
        return false;
    }
}
class Solution {
    public boolean checkString(String s) {
        
        int b=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='b')
                b++;

            if(b>0 && s.charAt(i)=='a')
            {
                return false;
            }
        }
        return true;
    }
}
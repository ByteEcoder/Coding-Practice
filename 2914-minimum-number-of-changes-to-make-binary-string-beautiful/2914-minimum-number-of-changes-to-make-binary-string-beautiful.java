class Solution {
    public int minChanges(String s) {
        char cur=s.charAt(0);
        int cnt = 1;
        int change = 0;
        for (int i = 1; i < s.length(); i++) {
            if(cur==s.charAt(i))
            {
                cnt++;
                continue;
            }

            if(cnt%2==0)
            {
                cur=s.charAt(i);
                cnt=1;
            }
            else
            {
                change++;
                cnt++;
            }


        }
        return change;
    }
}
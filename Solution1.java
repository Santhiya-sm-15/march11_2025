class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length(),cnt=0;
        Map<Character,Integer> m=new HashMap<>();
        int l=0,r=0;
        while(r<n)
        {
            char c=s.charAt(r);
            m.put(c,m.getOrDefault(c,0)+1);
            while(m.size()==3)
            {
                cnt+=(n-l)-(r-l+1)+1;
                char x=s.charAt(l);
                if(m.get(x)!=1)
                    m.put(x,m.get(x)-1);
                else
                    m.remove(x);
                l++;
            }
            r++;
        }
        return cnt;
    }
}
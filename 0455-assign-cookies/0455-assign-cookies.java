class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int cookies = s.length - 1;
        int child = g.length - 1;
        while(cookies >= 0 && child >= 0){
            if(s[cookies] >= g[child]){
                count++;
                cookies--;
                child--;
            }
            else{
                child--;
            }
        }
        return count;    
    }
}
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l;
        int c = 0, j = 0;
        for(int i = 0;i < g.length;i++){
            while(j < s.length){
                if(s[j++] >= g[i]){
                    c++;
                    break;
                }
            }
        }
        return c;
    }
}
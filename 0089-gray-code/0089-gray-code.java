class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        long len=(long)Math.pow(2,n);
        for(int i=0;i<n;i++){
            sb.append('0');
        }
        boolean [] used=new boolean[(int)len];
        ans.add(0);
        used[0]=true;
        helper(ans,sb,len,used);
        return ans;
    }
    public static void helper(List<Integer> ans,StringBuilder sb,long len,boolean [] used){
        if((long)ans.size()==len){
            return;
        }
        for(int i=sb.length()-1;i>=0;i--){
            char ch=sb.charAt(i);     
            sb.setCharAt(i,ch=='0'?'1':'0');//convert the character to opposite
            // int val=toBinary(sb);
            int val=Integer.parseInt(sb.toString(),2);//used to convert binary string to integer value
            if(!used[val]){
                used[val]=true;
                ans.add(val);
                helper(ans,sb,len,used);
                return;
            }
            sb.setCharAt(i,ch);//change the character to its original value;
        }
    }
   
}
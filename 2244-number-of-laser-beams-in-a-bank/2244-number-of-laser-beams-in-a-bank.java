class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int count = 0;

        for(String s : bank){
            int curr = 0;
            for(char c : s.toCharArray()){
                if(c == '1') curr++;
            }
            if(curr > 0){
                count += curr * prev;
                prev = curr;
            }
        }
        return count;
    }
}
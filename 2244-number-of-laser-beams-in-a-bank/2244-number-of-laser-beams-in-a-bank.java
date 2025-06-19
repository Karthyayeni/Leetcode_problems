class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int count = 0;

        for(String s : bank){
            int curr = 0;
            for(char c : s.toCharArray()){
                curr += c - '0';
            }
            if(curr == 0)
                continue;

            count += curr * prev;
            prev = curr;
        }
        return count;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxlength = 0;
        Map<Character, Integer> count = new HashMap<>();

        for(int right = 0;right < s.length();right++){
            char c = s.charAt(right);
            count.put(c, count.getOrDefault(c, 0) + 1);

            while(count.get(c) > 1){
                char leftChar = s.charAt(left);
                count.put(leftChar, count.get(leftChar) - 1);
                left++;
            }
            maxlength = Math.max(maxlength, right - left + 1);
        }

        return maxlength;       
    }
}
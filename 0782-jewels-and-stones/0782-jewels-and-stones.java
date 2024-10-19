class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i = 0;i < stones.length();i++){
            h.put(stones.charAt(i), h.getOrDefault(stones.charAt(i),0)+1);
        }
        int sum = 0;
        for(char ch : h.keySet()){
            for(int i = 0;i < jewels.length();i++){
                if(ch == jewels.charAt(i)){
                    sum += h.get(ch);
                }
            }
        }
        return sum;
    }
}
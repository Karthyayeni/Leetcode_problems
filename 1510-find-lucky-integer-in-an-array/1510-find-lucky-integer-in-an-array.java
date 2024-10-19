class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0;i < arr.length;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        int max = -1;
        for(int c : h.keySet()){
            if(c == h.get(c)){
                if(c > max){
                    max = c;
                }
            }
        }
        return max;
    }
}
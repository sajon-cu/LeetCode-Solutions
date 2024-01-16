class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : arr) {
            if(!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        
        HashSet<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }
}
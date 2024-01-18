class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> a.getValue().equals(b.getValue()) ? b.getKey() - a.getKey() : a.getValue() - b.getValue());
        
        int[] result = new int[nums.length];
        
        int index = 0;
        
        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println("["+entry.getKey()+":"+entry.getValue());
            Arrays.fill(result, index, index + entry.getValue(), entry.getKey());
            index += entry.getValue();
        }
        
        return result;
    }
}
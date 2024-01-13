class Solution {
    public int[] arrayRankTransform(int[] arr) {
               int[] res = new int[arr.length];
        
        for(int i = 0; i< arr.length; i++) {
            res[i] = arr[i];
        }

        Arrays.sort(res);

        // [40,10,20,30]
        // [10,20,30,40]
        // [37, 12, 28, 9, 100, 56, 80, 5, 12]
        // [5;1, 9:2, 12:3, 12:3, 28:4, 37:5, 56:6, 80:7, 100:8];



        Map<Integer, Integer> map = new HashMap<>();

        int pos = 1;
        for(int i = 0; i < res.length; i++) {
            if(!map.containsKey(res[i])) {
                map.put(res[i], pos++);
            }
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() +" : "+entry.getValue());
            System.out.println();
        }

        for(int entry : arr) {
            System.out.print(entry+" ");
        }

        System.out.println();

        for(int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        for(int entry : arr) {
            System.out.print(entry+" ");
        }

        return arr;
    }
}
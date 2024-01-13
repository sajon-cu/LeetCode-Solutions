class Solution {
    /*public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;

        for(int i = 0; i < nums.size(); i++) {
            String binary = decimalToBinary(i);
            if(isValidLengthOf(binary, k)) {
                sum += nums.get(i);
            }
        }

        return sum;
    }


    boolean isValidLengthOf(String binary, int k) {
        int count = 0;
        for(int j = 0; j < binary.length(); j++) {
            if(binary.charAt(j) == '1') {
                count++;
            }
        }

        return count == k ;
    }

    public String decimalToBinary(int num) {
        StringBuilder sb = new StringBuilder();

        if(num == 0) {
            System.out.println(num);
            sb.append(0);
        }

        while(num != 0) {
            int rem = num % 2;
            num /= 2;
            sb.append(rem);
        }

        System.out.print(sb +" ");

        return sb.toString();
    }*/
    
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;

        for(int i = 0; i < nums.size(); i++) {
            if(k == decimalToBinary(i)) {
                sum += nums.get(i);
            }
        }

        return sum;
    }
    
    public int decimalToBinary(int num) {
        int count = 0;

        while(num != 0) {
            if(num % 2 == 1) count++;
            num /= 2;
        }
        return count;
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        HashMap<Integer, Boolean> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, false);
        }

        int max = 1;

        for (int i = 0; i < nums.length; i++) {
            int currentVal = nums[i]; 
            if (mp.get(currentVal) == true) {
                continue;
            }

            mp.put(currentVal, true);
            int count = 1;

            int nextVal = currentVal + 1;
            while (mp.containsKey(nextVal) && mp.get(nextVal) != true) {
                mp.put(nextVal, true);
                count++;
                nextVal++; 
            }

            int prevVal = currentVal - 1;
            while (mp.containsKey(prevVal) && mp.get(prevVal) != true) {
                mp.put(prevVal, true);
                count++;
                prevVal--;
            }

            if (count > max)
                max = count;
        }
        return max;
    }
}

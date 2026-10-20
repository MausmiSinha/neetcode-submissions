class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] rightHighest = new int[temp.length];
        for (int i = (temp.length - 2); i >= 0; i--) {
            int r = i + 1;
            while (temp[i] >= temp[r] && rightHighest[r] > 0) {
                r += rightHighest[r];
            }
            if (temp[i] < temp[r]) {
                rightHighest[i] = r - i;
            } else {
                rightHighest[i] = 0;
            }
        }
        return rightHighest;
    }
}

class Solution {
    public int binarySearch(int[] nums, int target, int l, int r) {
        if (l > r) {
            return -1;
        }

        int mid = l + (r - l) / 2;
        if (target > nums[mid])
            return binarySearch(nums, target, mid + 1, r);
        else if (target < nums[mid])
            return binarySearch(nums, target, l, mid - 1);
        else
            return mid;
    }
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length-1;

        return binarySearch(nums, target, l, r);
    }
}

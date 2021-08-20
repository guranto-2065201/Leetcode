class Solution {
    public int[] twoSum(int[] nums, int target) {
        int first = 0;
        int second = 0;
        for(int i = 0; i<nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    first = i;
                    second = j;
                    return new int[]{first, second};
                }
            }
        }
        return new int[]{first, second};
    }
}

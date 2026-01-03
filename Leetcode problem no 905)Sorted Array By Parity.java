class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int[] result = new int[nums.length];
        int index = 0;

        // even numbers
        for (int n : nums) {
            if (n % 2 == 0) result[index++] = n;
        }

        // odd numbers
        for (int n : nums) {
            if (n % 2 != 0) result[index++] = n;
        }

        return result;
    }
}

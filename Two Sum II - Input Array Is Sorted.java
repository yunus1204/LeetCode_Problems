class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;
    
    while (left < right) {
        int sum = numbers[left] + numbers[right];
        
        if (sum == target) {
            return new int[]{left + 1, right + 1}; // Return 1-based indices
        } else if (sum < target) {
            left++; // Move the left pointer to the right
        } else {
            right--; // Move the right pointer to the left
        }
    }
    
    return new int[]{-1, -1}; // If no such pair exists, return an invalid result
}

}

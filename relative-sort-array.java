import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Step 1: Create a frequency map for arr1
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Step 2: Initialize the result list
        ArrayList<Integer> res = new ArrayList<>();

        // Step 3: Add elements from arr2 to result list according to their frequency
        for (int i : arr2) {
            if (map.containsKey(i)) {
                int count = map.get(i);
                for (int j = 0; j < count; j++) {
                    res.add(i);
                }
                map.remove(i); // Remove the element from map once added to the result
            }
        }

        // Step 4: Sort the remaining elements in arr1 which are not in arr2
        ArrayList<Integer> remaining = new ArrayList<>();
        for (int i : arr1) {
            if (map.containsKey(i)) {
                remaining.add(i);
            }
        }
        Collections.sort(remaining);

        // Step 5: Add the sorted remaining elements to the result list
        res.addAll(remaining);

        // Convert result list to array
        int[] resultArr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resultArr[i] = res.get(i);
        }

        return resultArr;
    }
}

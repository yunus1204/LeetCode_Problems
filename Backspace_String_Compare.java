// Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

// Note that after backspacing an empty text, the text will continue empty.

 

// Example 1:

// Input: s = "ab#c", t = "ad#c"
// Output: true
// Explanation: Both s and t become "ac".

// Example 2:

// Input: s = "ab##", t = "c#d#"
// Output: true
// Explanation: Both s and t become "".

// Example 3:

// Input: s = "a#c", t = "b"
// Output: false
// Explanation: s becomes "c" while t becomes "b".

// CODE

class Solution {
    public boolean backspaceCompare(String s, String t) {
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == '#' && !s1.isEmpty()) {
                s1.pop();
            } else if (arr1[i] != '#') {
                s1.push(arr1[i]);
            }
        }
        
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == '#' && !s2.isEmpty()) {
                s2.pop();
            } else if (arr2[i] != '#') {
                s2.push(arr2[i]);
            }
        }

        if (s1.size() != s2.size()) {
            return false;
        }
        
        while (!s1.isEmpty()) {
            if (s1.pop() != s2.pop()) {
                return false;
            }
        }
        
        return true;
    }
}


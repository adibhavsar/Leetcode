//my solution 

class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a, String b) {
        char[] c1 = a.toCharArray();
        Arrays.sort(c1);
        char[] c2 = b.toCharArray();
        Arrays.sort(c2);
        if (Arrays.equals(c1, c2)) {
            return true;
        }
        return false;
        // Your code here

    }
}
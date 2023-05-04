//my solution 

class Solution {
    String firstRepChar(String s) {
        // code here
        String result = "-1", str = "";
        for (int i = 0; i < s.length(); i++) {
            if (str.contains(Character.toString(s.charAt(i)))) {
                result = Character.toString(s.charAt(i));
                break;
            }
            str = str + s.charAt(i);
        }
        return result;
    }
}
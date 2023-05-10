//my solution 

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jewArr = jewels.toCharArray();
        char[] stoneArr = stones.toCharArray();
        int ans = 0;

        for (int i = 0; i < jewArr.length; i++) {
            for (int j = 0; j < stoneArr.length; j++) {
                if (jewArr[i] == stoneArr[j]) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
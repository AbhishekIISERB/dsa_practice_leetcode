class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean arr[]=new boolean[65536];
        int left=0;
        int max=0;

        for (int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            while(arr[ch]){
                arr[s.charAt(left)]=false;
                left++;

            }
            arr[ch]=true;
            max=Math.max(max,right-left+1);
        }

        return max;
    }
}
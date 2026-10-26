class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq[]=new int[26];
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        int target=freq[s.charAt(0)-'a'];
        for(int i=0;i<26;i++){
            if(freq[i]>0 && freq[i]!=target){
                return false;
            }
        }
        
        return true;
    }
}
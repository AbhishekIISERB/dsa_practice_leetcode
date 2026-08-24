class Solution {
    public boolean hasDuplicate(int[] nums) {
        java.util.Arrays.sort(nums);
        int n=nums.length;
        int flag=0;
        for (int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1])
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        return true;
        else 
        return false;       
    }
}
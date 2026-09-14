class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int num=n;
        int x=0;
        for (int i=0;i<n;i++)
        {
            if(nums[i]!=x){
                num=i;
                break;
            }
            x++;
        }
        return num;
        
    }
}

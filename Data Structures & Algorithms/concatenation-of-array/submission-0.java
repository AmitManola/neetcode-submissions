class Solution {
    public int[] getConcatenation(int[] nums) {
        int i,size=nums.length;
        int a[]=new int[2*size];
        for(i=0;i<size;i++)
        {
            a[i]=nums[i];
            a[size+i]=nums[i];
        }
        return(a);
    }
}
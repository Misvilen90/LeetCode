class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0,maxsum=0;
        for(int num:gain){
            sum+=num;
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
}

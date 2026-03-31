class Solution {
    public int maxOperations(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            int c = k-num;
            if(map.getOrDefault(c,0)>0){
                count++;
                map.put(c,map.get(c)-1);
            }else{
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        return count;
    }
}

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> ans= new ArrayList<>();
         Arrays.sort(candidates);
        helper(candidates,target,res,ans,0);
        return res;
    }

    public static void helper(int [] nums,int target,List<List<Integer>> res,List<Integer> ans,int idx){
            if(0==target){
                res.add(new ArrayList<>(ans));
                return;
            }
            if(idx==nums.length|| target<0) return;

        for(int i=idx;i<nums.length;i++){
        if(i>idx && nums[i]==nums[i-1]) continue;

        ans.add(nums[i]);
        helper(nums,target-nums[i],res,ans,i+1);
        ans.remove(ans.size()-1);
        }

        

       
    }
}
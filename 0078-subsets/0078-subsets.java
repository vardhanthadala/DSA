class Solution { // 2 solns (1.recursion,2.bit manipulation)
   
    List<List<Integer>> ans=new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        int idx = 0;
        List<Integer> al = new ArrayList<>(); 
        allcases(nums, ans, idx, al);
        return ans;
    }

    public void allcases(int[] nums, List<List<Integer>> ans, int idx, List<Integer> al) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(al));
            return;
        }
        al.add(nums[idx]);
        allcases(nums, ans, idx + 1, al);
        al.remove(al.size() - 1);
        allcases(nums, ans, idx + 1, al);
        return;
    }
}

// List<List<Integer>>result=new ArrayList<>();
// int n=nums.length;
// for(int i=0;i<(1<<n);i++){ //1<<n --> number of subsets
// List<Integer>subset=new ArrayList<>();
// for(int j=0;j<n;j++){
// if((i&(1<<j))>0){ //set
// subset.add(nums[j]);
// }
// }
// result.add(subset);
// }
// return result;
// }
// }
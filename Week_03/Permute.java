class Permute {
    private int [] nums;
    private int length;
    List<List<Integer>> result;
    private  Deque<Integer> path;
    boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        result=new ArrayList<>();
        this.nums=nums;
        this.length=nums.length;
        if(nums.length==0){
            return result;
        }
        path=new ArrayDeque<>(length);
        used=new boolean[length];
        dfs(0);
        return result;
    }

    private void dfs(int depth){
        if(depth==length){
            result.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i = 0; i <length; i++) {
            if(used[i]){
                continue;
            }
            path.addLast(nums[i]);
            used[i]=true;
            dfs(depth+1);
            path.removeLast();
            used[i]=false;
        }

    }
}

class Solution {
    List<Integer> aList=new ArrayList<>();
    List<Integer> bList=new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        bst(root,p.val,aList);
        bst(root,q.val,bList);
        TreeNode result=new TreeNode(0);
        int length=Math.min(aList.size(),bList.size());
        for(int i=0;i<length;i++){
            if(aList.get(i).equals(bList.get(i))){
                result.val=aList.get(i);
            }
        }

        return result;
    }

    private void bst(TreeNode node,int target,List<Integer> testList){
            if(node == null){
                return;
            }
            testList.add(node.val);
            if(node.val > target)
                bst(node.left,target,testList);
            if(node.val < target)
                bst(node.right,target,testList);
          
           
    }
}
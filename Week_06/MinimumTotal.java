class MinimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null ){
            return 0;
        }
        int [] temp=new int[triangle.size()+1];
        for(int i=triangle.size()-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                temp[j]=Math.min(temp[j],temp[j+1])+triangle.get(i).get(j);
            }
        }
        return temp[0];
    }
}

/*
2 
34
657
4183

p[i,j]=Min(sub[i+1,j],sub[i+1,j+1])+p[i+j]

*/
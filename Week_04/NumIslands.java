class NumIslands {
    private int m;
    private int n;
    private char[][] grid;
    public int numIslands(char[][] grid) {
        int count=0;
        if(grid.length==0){
            return 0;
        }
        m=grid.length;
        this.grid=grid;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    n=grid[i].length;
                    dfsIsLands(i,j);
                }
            }
        }
        return count;
    }

    private void dfsIsLands(int i,int j){
        if(i<0||j<0||i>=m||j>=n||grid[i][j]!='1'){
            return;
        }
        grid[i][j]='0';
        dfsIsLands(i,j+1);
        dfsIsLands(i,j-1);
        dfsIsLands(i+1,j);
        dfsIsLands(i-1,j);
    }

}

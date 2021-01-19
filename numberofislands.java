class Solution {
    public int numIslands(char[][] grid) {
        int count_of_islands=0;
        for(int k=0;k<grid.length;k++){
            for(int l=0;l<grid[k].length;l++){
                if(grid[k][l]=='1'){
                    count_of_islands+=1;
                    bfs(grid,k,l);
                }
            }
        }
        return count_of_islands;
    }
    public void bfs(char grid[][],int k,int l){
        if(k<0||k>=grid.length||l<0||l>=grid[k].length||grid[k][l]=='0')
            return;
        grid[k][l]='0';
        bfs(grid,k+1,l);
        bfs(grid,k-1,l);
        bfs(grid,k,l-1);
        bfs(grid,k,l+1);
        
    }
}


class Solution {
    class Pair{
        int row, col, time;
        Pair(int r, int c, int t){
            row = r;
            col = c;
            time = t;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;

        int fresh = 0;

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(grid[i][j] == 2){
                    q.add(new Pair(i, j, 0));
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }

        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};

        int rc = 0, maxTime = 0;

        while(!q.isEmpty()){
            Pair p = q.poll();
            int r = p.row;
            int c = p.col;
            int t = p.time;

            maxTime = Math.max(maxTime, t);

            for(int k = 0;k < 4;k++){
                int newR = r + dRow[k];
                int newC = c + dCol[k];

                if(newR >= 0 && newR < n && newC >=0 && newC < m && grid[newR][newC] == 1){
                    grid[newR][newC] = 2;
                    q.add(new Pair(newR, newC, t + 1));
                    rc++;
                }
            }
        }

        return rc == fresh ? maxTime : -1;
    }
}
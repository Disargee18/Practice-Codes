public class veejay
{
    private int row, col;
    private int[][] arr;
    
    public veejay(int row, int col, int[][]arr)
    {
        this.row = row;
        this.col = col;
        this.arr = arr;
    }

    public void populate(java.util.Scanner s)
    {
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr[i][j] = s.nextInt();
            }
        }
    }
    public void printing()
    {
        for(int[] row:arr)
        {
            for(int col:row)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }

}
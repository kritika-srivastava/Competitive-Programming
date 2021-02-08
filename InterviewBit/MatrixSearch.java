// Link - https://www.interviewbit.com/problems/matrix-search/
public class MatrixSearch {
    public int searchMatrix(int[][] A, int B) {
        for(int i=0;i<A.length;i++)
        {
            if(B>=A[i][0]&&B<=A[i][A[i].length-1])
            {
            for(int j=0;j<A[i].length;j++)
            {
                if(B==A[i][j])
                {
                    return 1;
                }
                else{}
            }
            }
        }
        return 0;
    }
}

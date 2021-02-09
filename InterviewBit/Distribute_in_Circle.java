// Link - https://www.interviewbit.com/problems/distribute-in-circle/
public class Distribute_in_Circle {
    public int solve(int A, int B, int C) {
        if(A+C<=B)
        {
            return A+C-1;
        }
        else
        {
            int m=A+C;
            while(m>B)
            {
                m-=B;
            }
           return m-1;
        }
    }
}

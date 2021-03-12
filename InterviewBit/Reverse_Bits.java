public class Reverse_Bits {
    public long reverse(long a) {
        int i=31;
        long ret=0;
        while(a!=0)
        {
            long m=a%2;
            if(m==1)
            {
                ret+=Math.pow(2,i);
            }
            else{}
            a/=2;
            i--;
        }
            return ret;
    }
}

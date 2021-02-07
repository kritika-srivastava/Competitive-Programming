Link - https://www.interviewbit.com/problems/amazing-subarrays/
public class AmazingSubarrays {
    public int solve(String A) {
        LinkedList<Character> l=new LinkedList<Character>();
        l.add('a');
        l.add('e');
        l.add('i');
        l.add('o');
        l.add('u');
        l.add('A');
        l.add('E');
        l.add('I');
        l.add('O');
        l.add('U');
        int k=0;
        for(int i=0;i<A.length();i++)
        {
            if(l.contains(A.charAt(i)))
            {
                k+=A.length()-i;
                k%=10003;
            }
            else{}
        }
        return k;
    }
}

public class empirp {
    int is_Prime(int a) {
        int c = 0;
        for (int i = 2; i <= a; i++)
            if (a % i == 0)
                c++;
        if (c == 1)
            return 1;
        else
            return 0;
    }

    void is_Empirp(int n) {
        int rev = 0;
        int a = is_Prime(n);
        while (n != 0) {
            rev = rev * 10 + n;
            n = n / 10;
        }
        int b = is_Prime(rev);
        if (a == 1 && b == 1)
            System.out.println("Empirp Number.");
        else
            System.out.println("Not an Empirp Number.");
    }
}

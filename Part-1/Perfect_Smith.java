public class Perfect_Smith {
    void perfect(int c) {
        int n = 2, sum = 1, num = c;
        int lim = num / 2;
        for (n = 2; n <= lim; n++) {
            if (num % n == 0)
                sum += n;
        }
        if (sum == num)
            System.out.println(c + " is a Perfect Number.");
        else
            System.out.println(c + " is not a perfect Number.");
    }

    boolean Prime(int a) {
        int c = 0;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0)
                c++;
        }
        if (c == 1)
            return true;
        else
            return false;
    }

    void Smith(int n) {
        int sum = 0, m = 2, s = 0, x = n;
        for (int j = n; j != 0; j /= 10)
            sum += j % 10;
        while (n != 1) {
            int i = m, k = 0;
            while (n % i == 0) {
                if (Prime(i) == true) {
                    for (int j = i; j != 0; j /= 10)
                        s += j % 10;
                    n /= i;
                    k++;
                    i++;
                }
            }
            if (k == 0)
                m++;
        }
        if (sum == s)
            System.out.println(x + " is a Smith Number.");
        else
            System.out.println(x + " is not a Smith Number.");
    }
}

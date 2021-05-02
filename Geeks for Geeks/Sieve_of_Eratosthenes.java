
/**
 * E:\#Fod Do\Competitive-Coding\Geeks for Geeks\Seive_of_Eratosthenes.java
 * @author Kritika Srivastava
 * @since May 02, 2021
 *
 * Sieve of Eratosthenes
 * Link - https://practice.geeksforgeeks.org/problems/sieve-of-eratosthenes5242/1
 * 
 */
import java.io.*;
import java.util.*;

class Sieve_of_Eratosthenes {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            ArrayList<Integer> primes = sieveOfEratosthenes(N);
            for (int prime : primes) {
                System.out.print(prime + " ");
            }
            System.out.println();
        }
    }

    static ArrayList<Integer> sieveOfEratosthenes(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        boolean prime[] = new boolean[n+1];
        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (prime[i] == true) {
                for (int p = i * i; p <= n; p += i) {
                    prime[p] = false;
                }
            } else {
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true) {
                arr.add(i);
            } else {
            }
        }
        return arr;

    }
}
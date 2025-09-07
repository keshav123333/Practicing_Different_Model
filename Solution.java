import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long ans;

            if (b % 2 == 1) {
                // b is odd
                if (a % 2 == 1) {
                    // both odd
                    ans = a * b + 1;
                } else {
                    ans = -1;
                }
            } else {
                // b is even
                if (a % 2 == 0) {
                    // both even: best is max(k=1 => a+b, k=b/2 => a*(b/2)+2)
                    long s1 = a + b;
                    long s2 = a * (b / 2) + 2;
                    ans = Math.max(s1, s2);
                } else {
                    // a odd, b even: only k = b/2 works if b/2 is even
                    if ((b / 2) % 2 == 0) {
                        ans = a * (b / 2) + 2;
                    } else {
                        ans = -1;
                    }
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
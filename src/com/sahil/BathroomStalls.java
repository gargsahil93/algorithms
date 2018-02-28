package com.sahil;


/*
* Problem
A certain bathroom has N + 2 stalls in a single row; the stalls on the left and right ends are permanently occupied by the bathroom guards. The other N stalls are for users.

Whenever someone enters the bathroom, they try to choose a stall that is as far from other people as possible. To avoid confusion, they follow deterministic rules: For each empty stall S, they compute two values LS and RS, each of which is the number of empty stalls between S and the closest occupied stall to the left or right, respectively. Then they consider the set of stalls with the farthest closest neighbor, that is, those S for which min(LS, RS) is maximal. If there is only one such stall, they choose it; otherwise, they choose the one among those where max(LS, RS) is maximal. If there are still multiple tied stalls, they choose the leftmost stall among those.

K people are about to enter the bathroom; each one will choose their stall before the next arrives. Nobody will ever leave.

When the last person chooses their stall S, what will the values of max(LS, RS) and min(LS, RS) be?

Solving this problem
This problem has 2 Small datasets and 1 Large dataset. You must solve the first Small dataset before you can attempt the second Small dataset. You will be able to retry either of the Small datasets (with a time penalty). You will be able to make a single attempt at the Large, as usual, only after solving both Small datasets.

Input
The first line of the input gives the number of test cases, T. T lines follow. Each line describes a test case with two integers N and K, as described above.

Output
For each test case, output one line containing Case #x: y z, where x is the test case number (starting from 1), y is max(LS, RS), and z is min(LS, RS) as calculated by the last person to enter the bathroom for their chosen stall S.

Limits
1 ≤ T ≤ 100.
1 ≤ K ≤ N.
Small dataset 1
1 ≤ N ≤ 1000.
Small dataset 2
1 ≤ N ≤ 10^6.
Large dataset
1 ≤ N ≤ 10^18.
Sample

Input

Output

5
4 2
5 2
6 2
1000 1000
1000 1

Case #1: 1 0
Case #2: 1 0
Case #3: 1 1
Case #4: 0 0
Case #5: 500 499

In Case #1, the first person occupies the leftmost of the middle two stalls, leaving the following configuration (O stands for an occupied stall and . for an empty one): O.O..O. Then, the second and last person occupies the stall immediately to the right, leaving 1 empty stall on one side and none on the other.

In Case #2, the first person occupies the middle stall, getting to O..O..O. Then, the second and last person occupies the leftmost stall.

In Case #3, the first person occupies the leftmost of the two middle stalls, leaving O..O...O. The second person then occupies the middle of the three consecutive empty stalls.

In Case #4, every stall is occupied at the end, no matter what the stall choices are.

In Case #5, the first and only person chooses the leftmost middle stall.*/

public class BathroomStalls {
    public void magic(long n, long k) {
        int base_log2 = log(n,2);
        long base = (long) Math.pow(2, base_log2);
        long nonZero = base/2;
        if(base != n) {
            nonZero = base/2 + n - base;
        }
        if(k > nonZero) {
            return;
        }
        long f = findFirst(n, k);
        long l = findLast(f, n, k);
        return;
    }

    private long findFirst(long n, long k) {
        int aboveBaseLog2 = log(k, 2)+1;
        long aboveBase = (long) Math.pow(2, aboveBaseLog2);
        long res = n/aboveBase;
        if(n%aboveBase == 0 && n%k != 0) {
            res = res - 1;
        }
        return res;
    }

    private long findLast(long f, long n, long k) {
        if(k == 1){
            return n-1-f;
        }
        int baseLog2 = log(k, 2);
        long base = (long) Math.pow(2, baseLog2);
        long at = base/2 + k%(base/2);
        long ff = findFirst(n, at);
        if(n%base < base/2) {
            return ff - 1 - f;
        } else {
            return findLast(ff, n, at) - 1 - f;
        }
    }
    static int log(long x, int base) {
        return (int) (Math.log(x)/Math.log(base));
    }
}

package baekjoon.ps2dp;

public class Prob02_FunRecursive {
    /*if a <= 0 or b <= 0 or c <= 0, then w(a, b, c) returns:
            1

            if a > 20 or b > 20 or c > 20, then w(a, b, c) returns:
    w(20, 20, 20)

    if a < b and b < c, then w(a, b, c) returns:
    w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c)

    otherwise it returns:
    w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1)*/

}

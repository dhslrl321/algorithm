package com.wonit.k2022;

public class P1 {
    public static void main(String[] args) {
        System.out.println(solution(8, 5, 3));
    }

    private static int solution(int x, int y, int z) {

        if (canNotComingBack(x, y, z)) {
            return -1;
        }

        if (isRightSide(x, y)) {
            return moveRight(x, y, z);
        } else if (isLeftSideMove(x, y)) {
            return moveLeft(x, y, z);
        }
        return moveBackAndForth(y, z);
    }

    private static int moveBackAndForth(int y, int z) {
        return y + (z / 2);
    }

    private static int moveLeft(int x, int y, int z) {
        return ((z - (x - y)) / 2) + x;
    }

    private static int moveRight(int x, int y, int z) {
        return ((z - (y - x)) / 2) + y;
    }

    private static boolean isLeftSideMove(int x, int y) {
        return x > y;
    }

    private static boolean isRightSide(int x, int y) {
        return x < y;
    }

    // 절대로 못 가는 경우
    private static boolean canNotComingBack(int x, int y, int z) {
        return (y - x) > z;
    }
}

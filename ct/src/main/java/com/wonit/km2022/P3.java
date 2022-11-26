package com.wonit.km2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P3 {
    public static void main(String[] args) {
        List<String> ss = new ArrayList<>();
        List<String[]> times = new ArrayList<>();

        ss.add("2021:04:12:16:08:35");
        times.add(new String[]{"01:06:30:00", "01:04:12:00"});
        ss.add("2021:04:12:16:08:35");
        times.add(new String[]{"01:06:30:00", "00:01:12:00"});
        ss.add("2021:04:12:16:10:42");
        times.add(new String[]{"01:06:30:00"});
        ss.add("2021:04:12:16:08:35");
        times.add(new String[]{"01:06:30:00", "01:01:12:00", "00:00:09:25"});

        for (int i = 0; i < ss.size(); i++) {
            System.out.println(Arrays.toString(solution(ss.get(i), times.get(i))));
        }
    }

    private static int[] solution(String s, String[] times) {

        List<Deposit> deposits = new ArrayList<>();
        deposits.add(new Deposit(s));
        int beforeIndex = 0;
        for (String time : times) {
            Deposit newDeposit = deposits.get(beforeIndex).plusTime(time);
            deposits.add(newDeposit);
            beforeIndex++;
        }
        // 연속된 날짜 구하기
        return new int[]{isDailyBy(deposits), getTotalSavingDays(deposits)};
        // 시작일과 끝날 구하기
    }

    private static int isDailyBy(List<Deposit> deposits) {
        boolean isDaily = true;

        for (int i = 1; i < deposits.size(); i++) {
            int before = deposits.get(i - 1).day;
            int after = deposits.get(i).day;
            if (after - before > 2) {
                isDaily = false;
                break;
            }
        }
        return isDaily ? 1 : 0;
    }

    private static int getTotalSavingDays(List<Deposit> deposits) {
        return 0;
    }

    // add;
}

class Deposit {
    int year;
    int month;
    int day;

    int hour;
    int minute;
    int second;

    public Deposit(String dateTime) {
        String[] split = dateTime.split(":");
        this.year = Integer.parseInt(split[0]);
        this.month = Integer.parseInt(split[1]);
        this.day = Integer.parseInt(split[2]);
        this.hour = Integer.parseInt(split[3]);
        this.minute = Integer.parseInt(split[4]);
        this.second = Integer.parseInt(split[5]);
    }

    public Deposit(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Deposit plusTime(String provided) {
        String[] split = provided.split(":");
        int day = Integer.parseInt(split[0]);
        int hour = Integer.parseInt(split[1]);
        int minute = Integer.parseInt(split[2]);
        int second = Integer.parseInt(split[3]);

        int s = this.second + second;
        if (s / 60 > 0) {
            minute++;
            s %= 60;
        }

        int m = this.minute + minute;
        if (m / 60 > 0) {
            hour++;
            m %= 60;
        }

        int h = this.hour + hour;
        if (h / 24 > 0) {
            day++;
            h %= 24;
        }

        int month = this.month;
        int d = this.day + day;
        if (d / 30 > 0) {
            month++;
            d %= 30;
        }

        int year = this.year;
        if (month / 12 > 0) {
            year++;
            month %= 12;
        }

        return new Deposit(year, month, d, h, m, s);
    }
}
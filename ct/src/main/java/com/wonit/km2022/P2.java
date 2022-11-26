package com.wonit.km2022;

import java.util.HashMap;
import java.util.Map;

public class P2 {
    public static void main(String[] args) {
        String[] arr = {"J", "J E J M", "M E M", "E M", "E E E", "M"};
        System.out.println(solution(arr, 3));
    }

    private static Map<String, Wallet> map = new HashMap<>();

    private static int solution(String[] id_list, int k) {
        for (int i = 0; i < id_list.length; i++) {
            String[] ids = id_list[i].split(" ");
            // 하루에 최대 한장이라는 장치 필요
            for (String id : ids) {
                if (map.containsKey(id)) {
                    if ( !map.get(id).lock && map.get(id).count < k) {
                        Wallet wallet = map.get(id);
                        wallet.plus();
                        wallet.lock();
                    }
                } else {
                    Wallet newWallet = new Wallet(id, 1);
                    map.put(id, newWallet);
                    newWallet.lock();
                }
            }
            releaseAllLock();
        }

        int count = 0;

        for (Wallet wallet : map.values()) {
            count += wallet.count;
        }

        return count;
    }

    private static void releaseAllLock() {
        for (Wallet wallet : map.values()) {
            wallet.release();
        }
    }

    private static class Wallet {
        String name;
        int count;
        boolean lock;

        public Wallet(String name, int count) {
            this.name = name;
            this.count = count;
            lock = false;
        }

        private void plus() {
            count++;
        }

        private void lock() {
            lock = true;
        }

        private void release() {
            lock = false;
        }

    }
}

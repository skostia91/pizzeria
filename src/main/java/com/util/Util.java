package com.util;

import java.util.List;

public class Util {
    public static int sumAllOrders(List<Integer> list) {
        int a = 0;
        for (int i = 0; i < list.size(); i++) {
            a += list.get(i);
        }
        return a;
    }
}

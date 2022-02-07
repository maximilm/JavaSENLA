package com.company.exercise5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите максимальный объем сейфа: ");
        int v = in.nextInt();

        System.out.print("Введите количество предметов: ");
        int n = in.nextInt();

        System.out.println("Введите поочереди ценность каждого предмета: ");
        int[] value = new int[n];
        for (int i = 0; i < value.length; i++)
            value[i] = in.nextInt();

        System.out.println("Введите, соответственно ценностям, объем каждого предмета: ");
        int[] size = new int[n];
        for (int i = 0; i < size.length; i++)
            size[i] = in.nextInt();

        ArrayList<Item> items = new ArrayList<>();
        for (int i = 0; i < n;i++)
            items.add(new Item(size[i],value[i],(i+1) + " предмет"));

        Safe safe = new Safe(items,n,v);
        safe.searchMaxValueSafe();
        safe.result();
    }
}

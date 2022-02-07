package com.company.exercise5;

import java.util.ArrayList;

public class Safe {
    private int v; // максимальный объем сейфа

    private int n; // Количество предметов

    private ArrayList<Item> items; // предметы

    private int[][] sets; // наборы предметов в сейфе с разными комбинациями

    public Safe(ArrayList<Item> items, int n, int v){
        this.items = items;
        this.n = n;
        this.v = v;
        sets = new int[n+1][v+1]; // n+1 и v+1 чтобы обозначить начальное состояние сейфа, 0 предметов - 0 ценность
        for (int i= 0; i <= v; i++)
            sets[0][i] = 0;
    }
    public void searchMaxValueSafe(){
        for (int i = 0; i < n; i++){
            for (int j =0; j<=v;j++){
                if (j >= items.get(i).getSize())  // Если в сейф вместимостью j помещается i-й объект
                    // выбираем наилучший исход, либо добавлять новый предмет, либо не добавлять
                    sets[i+1][j] = Math.max(sets[i][j - items.get(i).getSize()] + items.get(i).getValue(),sets[i][j]);
                else
                    sets[i+1][j] = sets[i][j]; // нету смысла добавлять
            }
        }
    }
    public void result() {
        System.out.println("Максимальная ценность сейфа: " + sets[n][v]);
        System.out.println("Список предметов, которые можно положить: ");
        int V = v;
        for(int i = n; i >= 1; i--) { // вывод предметов, которые подойдут
            if(!(sets[i][V] == sets[i-1][V])){
                System.out.println(items.get(i-1).getName());
                V -= items.get(i-1).getSize();
            }
        }
    }
}

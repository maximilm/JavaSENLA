package com.company.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][][] nums = {  // трехмерный массив для чисел
                {
                        {'*', '*', '*','*', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', '*', '*','*', '*'},
                },
                {
                        {' ', ' ', '*',' ', ' '},
                        {' ', '*', '*',' ', ' '},
                        {'*', ' ', '*',' ', ' '},
                        {' ', ' ', '*',' ', ' '},
                        {' ', ' ', '*',' ', ' '},
                        {' ', ' ', '*',' ', ' '},
                        {' ', ' ', '*',' ', ' '},
                        {'*', '*', '*','*', '*'},
                },
                {
                        {' ', '*', '*','*', ' '},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {' ', ' ', ' ','*', ' '},
                        {' ', ' ', '*',' ', ' '},
                        {' ', '*', ' ',' ', ' '},
                        {'*', '*', '*','*', '*'},
                },
                {
                        {'*', '*', '*','*', '*'},
                        {' ', ' ', ' ',' ', '*'},
                        {' ', ' ', ' ',' ', '*'},
                        {'*', '*', '*','*', '*'},
                        {' ', ' ', ' ',' ', '*'},
                        {' ', ' ', ' ',' ', '*'},
                        {' ', ' ', ' ',' ', '*'},
                        {'*', '*', '*','*', '*'},
                },
                {
                        {'*', ' ', ' ',' ', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', '*', '*','*', '*'},
                        {' ', ' ', ' ',' ', '*'},
                        {' ', ' ', ' ',' ', '*'},
                        {' ', ' ', ' ',' ', '*'},
                },
                {
                        {'*', '*', '*','*', '*'},
                        {'*', ' ', ' ',' ', ' '},
                        {'*', ' ', ' ',' ', ' '},
                        {'*', ' ', ' ',' ', ' '},
                        {'*', '*', '*','*', '*'},
                        {' ', ' ', ' ',' ', '*'},
                        {' ', ' ', ' ',' ', '*'},
                        {'*', '*', '*','*', '*'},
                },
                {
                        {'*', '*', '*','*', '*'},
                        {'*', ' ', ' ',' ', ' '},
                        {'*', ' ', ' ',' ', ' '},
                        {'*', ' ', ' ',' ', ' '},
                        {'*', '*', '*','*', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', '*', '*','*', '*'},
                },
                {
                        {'*', '*', '*','*', '*'},
                        {' ', ' ', ' ',' ', '*'},
                        {' ', ' ', ' ',' ', '*'},
                        {' ', ' ', ' ',' ', '*'},
                        {' ', ' ', ' ','*', ' '},
                        {' ', ' ', '*',' ', ' '},
                        {' ', '*', ' ',' ', ' '},
                        {'*', ' ', ' ',' ', ' '},
                },
                {
                        {' ', '*', '*','*', ' '},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {' ', '*', '*','*', ' '},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {' ', '*', '*','*', ' '},
                },
                {
                        {'*', '*', '*','*', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', ' ', ' ',' ', '*'},
                        {'*', '*', '*','*', '*'},
                        {' ', ' ', ' ',' ', '*'},
                        {' ', ' ', ' ',' ', '*'},
                        {'*', '*', '*','*', '*'},
                },
        };
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        ArrayList<Integer> digits = new ArrayList<>();
        int max = 0;
        while (num > 0 ){ // поиск максимального числа
            if (max < num % 10){
                max = num % 10;
            }
            digits.add(num%10);
            num /= 10;
        }
        Collections.reverse(digits);
        for (int k = 0; k < nums[0].length;k++) { // вывод
            for (Integer dig : digits) {
                for (int j = 0; j < nums[dig][k].length; j++) {
                    if (dig == max && nums[dig][k][j] == '*') {
                        System.out.print(max);
                    } else
                        System.out.print(nums[dig][k][j]);
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}

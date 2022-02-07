package com.company.exercise2;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        long num = 0;
        Scanner in = new Scanner(System.in);
        try {
            num = Long.valueOf(in.next());
            ArrayList<Long> factors = new ArrayList<>();

            for(long i = 2; i <= Math.sqrt(num);i++){
                while ( num % i == 0){
                    factors.add(i);
                    num /= i;
                }
            }

            if (num != 1)
                factors.add(num);
            System.out.println("Простые множители: " + factors.toString());
        } catch (NumberFormatException ex) {
            System.out.println("Введено не целое число!");
        }
    }
}

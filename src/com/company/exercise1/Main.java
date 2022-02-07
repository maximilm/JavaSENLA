package com.company.exercise1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = in.next();
        for (int i = 0; i < string.length(); i++){
            if (Character.isDigit(string.charAt(i)))
                sum += string.charAt(i) - '0';
        }
        System.out.println(sum);
//        int sum_2 = string.chars().map((w) -> {
//            if (Character.isDigit(w))
//                return (int) (w - '0');
//            else
//                return 0;
//        }).sum();
//        System.out.println(sum_2);
    }
}

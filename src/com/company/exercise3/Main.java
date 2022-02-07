package com.company.exercise3;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> words = new HashMap<>();
        Pattern letters = Pattern.compile("[уеыаоэяиюё]"); // паттерн гласных букв
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        String strings[] = sentence.toLowerCase().split(" ");
        for (String str: strings){
            Matcher m = letters.matcher(str);
            int letterCount = 0;
            boolean flag = false;
            String newString = str;
            while (m.find()) { // если гласная найдена в слове
                letterCount += 1;
                if (!flag){ // если первая гласная найденная в слове
                    flag = true;
                    newString = str.replaceFirst(String.valueOf(str.charAt(m.start())), String.valueOf(Character.toUpperCase(str.charAt(m.start())))); // переход первой гласной в верхний регистр
                }
            }
            if (!words.containsKey(str))
                words.put(newString,letterCount); // добавления в словарь
        }
        System.out.println("Слово\tКоличество гласных\n");
        words.entrySet().stream().sorted(Map.Entry.<String,Integer> comparingByValue().reversed()).forEach(w -> System.out.print(w.getKey() + "\t" + w.getValue() + "\n")); // сортировка и вывод с помощью stream API
    }
}

package com.company.exercise5;
// Класс предмета
public class Item {
    private int size; // объем

    private int value; // ценность

    private String name; // название предмета

    public Item(int size, int value, String name) {
        this.size = size;
        this.name = name;
        this.value = value;
    }

    public int getSize() {
        return size;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }
}

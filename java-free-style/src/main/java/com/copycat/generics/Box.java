package com.copycat.generics;

/**
 *
 * Generic Class
 *
 * @param <T>
 */
public class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }


    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("Hello");
        System.out.println(box.getItem());
    }

}

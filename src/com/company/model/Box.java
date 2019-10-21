package com.company.model;

public class Box<T> {
    private boolean isEmpty = true;
    private T element = null;

    public void putInBox(T elem) {
        if (isEmpty) {
            element = elem;
            isEmpty = false;
        } else throw new RuntimeException("Box is not empty!");

    }

    public T getOutOfBox() {
        if (!isEmpty) {
            return element;
        } else throw new RuntimeException("box is empty!");

    }

   public void deleteFromBox() {
        if (!isEmpty) {
            element = null;
            isEmpty = true;
        }
    }

}
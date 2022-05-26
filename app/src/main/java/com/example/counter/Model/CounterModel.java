package com.example.counter.Model;

public class CounterModel {
    public int count = 0;
    public int toastNumber = 10;

    public int getToastNumber() {
        return toastNumber;
    }

    public int getChangeColor() {
        return changeColor;
    }

    public int changeColor = 15;

    public void increment() {
        ++count;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }

}

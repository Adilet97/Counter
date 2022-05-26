package com.example.counter.View;

import com.example.counter.Model.CounterModel;

public class CounterContracts {
    public interface CounterView {
        void updateText(int count);
        void toast(int id);
        void color();

    }

    public interface CounterPresenter {
        void increment();
        void decrement();
        void attachCounterView(CounterView view);

    }

}

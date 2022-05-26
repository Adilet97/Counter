package com.example.counter;

import com.example.counter.Presenter.CounterPresenter;

public class Injector {
    public static CounterPresenter getCounter(){
        return new CounterPresenter();
    }
}

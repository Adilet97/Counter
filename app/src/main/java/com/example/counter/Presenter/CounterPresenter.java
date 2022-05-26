package com.example.counter.Presenter;

import com.example.counter.Model.CounterModel;
import com.example.counter.View.CounterContracts;

public class CounterPresenter implements CounterContracts.CounterPresenter {
    CounterModel counterModel = new CounterModel();
    CounterContracts.CounterView counterView;

    @Override
    public void increment() {
        counterModel.increment();
        counterView.updateText(counterModel.getCount());
        if (counterModel.getCount() == counterModel.getToastNumber()) {
            counterView.toast(counterModel.getToastNumber());
        }
        if (counterModel.getCount() == counterModel.getChangeColor()) {
            counterView.color();
        }

    }

    @Override
    public void decrement() {
        counterModel.decrement();
        counterView.updateText(counterModel.getCount());
        if (counterModel.getCount() == counterModel.getToastNumber()) {
            counterView.toast(counterModel.getToastNumber());
        }
        if (counterModel.getCount() == counterModel.getChangeColor()) {
            counterView.color();
        } else if (counterModel.getCount() != counterModel.changeColor) {
            counterView.color();
        }
    }

    @Override
    public void attachCounterView(CounterContracts.CounterView view) {
        counterView = view;
    }

}

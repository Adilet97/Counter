package com.example.counter;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.counter.Presenter.CounterPresenter;
import com.example.counter.View.CounterContracts;
import com.example.counter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements CounterContracts.CounterView {
    ActivityMainBinding binding;
    CounterPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = Injector.getCounter();
        presenter.attachCounterView(this);
        initClickers();
    }

    private void initClickers() {
        binding.btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.increment();
            }
        });
        binding.btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.decrement();
            }
        });
    }

    @Override
    public void updateText(int count) {
        binding.counterTv.setText(String.valueOf(count));
    }

    @Override
    public void toast(int id) {
        Toast.makeText(this, "Congrats", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void color() {
        binding.counterTv.setTextColor(Color.GREEN);
    }
}
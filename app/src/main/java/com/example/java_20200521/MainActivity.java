package com.example.java_20200521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;

import com.example.java_20200521.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setContentView(R.layout.activity_main);
        setupEvents();
        setValues();
    }

    // 이벤트 처리 코드 모아두는곳
    void setupEvents(){

    }

    // 화면에 나와야할 데이터 세팅 코드 모아두는곳
    void setValues(){

    }

}

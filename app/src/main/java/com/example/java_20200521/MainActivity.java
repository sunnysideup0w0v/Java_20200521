package com.example.java_20200521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.java_20200521.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        setupEvents();
        setValues();
    }

    // 이벤트 처리 코드 모아두는곳
    void setupEvents(){
        binding.goToFirstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //FirstActivity로 이동
                //여행에 비유

                //티켓발권
                Intent myIntent = new Intent(MainActivity.this, FirstActivity.class);
                //실제출발
                startActivity(myIntent);

                //이 액티비티를 종료하는 코드.
                //finish();
            }
        });
    }

    // 화면에 나와야할 데이터 세팅 코드 모아두는곳
    void setValues(){

    }

}

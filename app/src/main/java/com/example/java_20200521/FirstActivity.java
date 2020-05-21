package com.example.java_20200521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.java_20200521.databinding.ActivityFirstBinding;

public class FirstActivity extends AppCompatActivity {
    ActivityFirstBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_first);
        setUpEvents();
        setValues();
    }
    void setUpEvents(){
        binding.goBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                // 이전 화면으로 돌아갈 때에는 intent 사용 x. 돌아가는게 아니라 새로운 화면을 얹어주는 효과가 생기기 때문에.
//                Intent myIntent = new Intent(FirstActivity.this,MainActivity.class);
//                startActivity(myIntent);
            }
        });
    }
    void setValues(){

    }
}

package com.example.ivanlayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = this.getIntent();

        if(intent!= null)
        {
            String name = intent.getStringExtra("name");
            String phone = intent.getStringExtra("phone");
            String country = intent.getStringExtra("country");
            int imageid = intent.getIntExtra("imageid",R.drawable.a);



        }


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

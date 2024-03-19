package com.example.week9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void screenAddUser(View view){
        Intent intent = new Intent (this, AddUserActivity.class);
        startActivity(intent); 
    }

    public void screenListUser(View view){
        Intent intent = new Intent(this, ListUserInRecycleViewActivity.class);
        startActivity(intent);
    }
}
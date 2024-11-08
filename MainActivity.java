package com.example.database;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                SharedPreferences preferences=getSharedPreferences("login",MODE_PRIVATE);
//                Boolean check = preferences.getBoolean("flag",false);
//                Intent intent;
//                if(check){
//                    intent = new Intent(MainActivity.this, Home.class);
//                    startActivity(intent);
//                }
//                else{
//                    intent = new
//                            Intent(MainActivity.this,Login.class);
//                    startActivity(intent);
//                }
//            }
//        },3000);

        Databasehelper dh = new Databasehelper(this);
//        SQLiteDatabase db= dh.getWritableDatabase();
//        dh.onCreate(db);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}


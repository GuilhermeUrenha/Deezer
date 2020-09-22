package com.example.deezer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void actPesquisa(View view){
        Intent intPesq = new Intent(this, activity_pesquisa.class);
        this.startActivity(intPesq);
    }

    public void actEmail(View view){
        Intent intEmail = new Intent(this, activity_email.class);
        this.startActivity(intEmail);
    }
}
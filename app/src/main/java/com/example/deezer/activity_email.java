package com.example.deezer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class activity_email extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
    }

    public void SendEmail(View view) {
        EditText Address = findViewById(R.id.edtAddress);
        EditText Subject = findViewById(R.id.edtSubject);
        EditText Text = findViewById(R.id.edtText);

        Intent intent = new Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("mailto", Address.getText().toString(), null));
        intent.putExtra(Intent.EXTRA_SUBJECT, Subject.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT, Text.getText().toString());

        this.startActivity(Intent.createChooser(intent, "Enviar Email:"));
    }
}
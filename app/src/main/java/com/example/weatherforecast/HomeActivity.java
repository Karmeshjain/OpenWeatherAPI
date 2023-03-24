package com.example.weatherforecast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button btVolley;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btVolley = findViewById(R.id.btVolley);

        btVolley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openVolley();
            }
        });

    }

    public void openVolley() {
        Intent intent = new Intent(this, VolleyMainActivity.class);
        startActivity(intent);
    }
}
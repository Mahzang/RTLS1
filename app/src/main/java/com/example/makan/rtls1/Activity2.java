package com.example.makan.rtls1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        karte();
        freunde();
    }
    public void karte(){
        Button karteclick = (Button) findViewById(R.id.button3);
        karteclick.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(Activity2.this, Map.class));
           }
        });
        }
    public void freunde() {
        Button freundeclick = (Button) findViewById(R.id.button4);
        freundeclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity2.this, Freunde.class));
            }
        });
    }
}

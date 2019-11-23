package com.example.test_me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button p_home,p_friend,p_inox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p_home = (Button)findViewById(R.id.button1);
        p_friend = (Button)findViewById(R.id.button2);
        p_inox = (Button)findViewById(R.id.button3);

        p_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this,Two.class);
                i1.putExtra("p_lat","17.332179383796596");
                i1.putExtra("p_lng","78.51671982094739");
                startActivity(i1);
            }
        });

        p_friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(MainActivity.this,Two.class);
                i2.putExtra("p_lat","17.330441568436015");
                i2.putExtra("p_lng","78.52034863315043");
                startActivity(i2);
            }
        });

        p_inox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(MainActivity.this,Two.class);
                i3.putExtra("p_lat","17.39065539160473");
                i3.putExtra("p_lng","78.48842831960998");
                startActivity(i3);
            }
        });


    }
}

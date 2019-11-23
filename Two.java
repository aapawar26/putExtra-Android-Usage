package com.example.test_me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Two extends AppCompatActivity {

    Button d_home,d_friend,d_inox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Bundle get = getIntent().getExtras();
        final String str1 = get.getString("p_lat");
        final String str2 = get.getString("p_lng");

        d_home = (Button)findViewById(R.id.button4);
        d_friend = (Button)findViewById(R.id.button5);
        d_inox = (Button)findViewById(R.id.button6);

        d_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Two.this,Three.class);
                i4.putExtra("pickup_lat",str1);
                i4.putExtra("pickup_lng",str2);
                i4.putExtra("dropoff_lat","17.332179383796596");
                i4.putExtra("dropoff_lng","78.51671982094739");
                startActivity(i4);
            }
        });


        d_friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Two.this,Three.class);
                i4.putExtra("pickup_lat",str1);
                i4.putExtra("pickup_lng",str2);
                i4.putExtra("dropoff_lat","17.330441568436015");
                i4.putExtra("dropoff_lng","78.52034863315043");
                startActivity(i4);
            }
        });

        d_inox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(Two.this,Three.class);
                i4.putExtra("pickup_lat",str1);
                i4.putExtra("pickup_lng",str2);
                i4.putExtra("dropoff_lat","17.39065539160473");
                i4.putExtra("dropoff_lng","78.48842831960998");
                startActivity(i4);
            }
        });
    }


}

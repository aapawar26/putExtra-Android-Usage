package com.example.test_me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Three extends AppCompatActivity {

    TextView tv;

    Button ola,uber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        tv = (TextView)findViewById(R.id.final_show);

        Bundle get_f = getIntent().getExtras();
        final String plat = get_f.getString("pickup_lat");
        final String plng = get_f.getString("pickup_lng");
        final String dlat = get_f.getString("dropoff_lat");
        final String dlng = get_f.getString("dropoff_lng");

        tv.setText(plat+"\n"+plng+"\n"+dlat+"\n"+dlng);

        ola = (Button)findViewById(R.id.button7);
        uber = (Button)findViewById(R.id.button8);

        ola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_ola = "https://olawebcdn.com/assets/ola-universal-link.html?"
                        +"lat="+plat+"&"
                        +"lng="+plng+"&"
                        +"drop_lat="+dlat+"&"
                        +"drop_lng="+dlng+"&"
                        +"dsw=yes";

                Intent i7 = new Intent(Intent.ACTION_VIEW);
                i7.setData(Uri.parse(str_ola));
                startActivity(i7);
            }
        });

        uber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_uber = "https://m.uber.com/ul/?action=setPickup&client_id=H12cTZ3-Cve8_x0GbYxzUWYOBsqgSMa8&product_id=3d67403a-afdc-41a1-9ea9-df68a3f4a835 &pickup[latitude]="+plat+
                "&pickup[longitude]="+plng+
                        "&dropoff[latitude]="+dlat+
                        "&dropoff[longitude]="+dlng;

                Intent i8 = new Intent(Intent.ACTION_VIEW);
                i8.setData(Uri.parse(str_uber));
                startActivity(i8);
            }
        });

    }
}
/*

"https://m.uber.com/ul/?action=setPickup&client_id=H12cTZ3-Cve8_x0GbYxzUWYOBsqgSMa8&product_id=3d67403a-afdc-41a1-9ea9-df68a3f4a835
&pickup[latitude]="+plat+
"&pickup[longitude]="+plng+
"&dropoff[latitude]="+dlat+
"&dropoff[longitude]="+dlng
 */

package arysmart.project.app.main.unit_converter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MenuActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button btnDistance = (Button) findViewById(R.id.btnDistance);
        Button btnSpeed = (Button) findViewById(R.id.btnSpeed);
        Button btnTemperature = (Button) findViewById(R.id.btnTemperature);

        btnDistance.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MenuActivity.this, DistanceActivity.class);
                MenuActivity.this.startActivity(intent);
            }
        });

        btnSpeed.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MenuActivity.this, SpeedActivity.class);
                MenuActivity.this.startActivity(intent);

            }
        });
        btnTemperature.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MenuActivity.this, TemperatureActivity.class);
                MenuActivity.this.startActivity(intent);

            }
        });
    }
}
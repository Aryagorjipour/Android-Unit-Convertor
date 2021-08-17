package arysmart.project.app.main.unit_converter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;


public class TemperatureActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperature);

        final EditText edtC = (EditText) findViewById(R.id.edtC);
        final EditText edtK = (EditText) findViewById(R.id.edtK);
        final EditText edtF = (EditText) findViewById(R.id.edtF);

        final Button btnConvert = (Button) findViewById(R.id.btnConvert);

        edtF.setOnFocusChangeListener(new OnFocusChangeListener() {

            @Override
            public void onFocusChange(View arg0, boolean arg1) {
                edtC.setText("");
                edtK.setText("");
            }
        });

        edtC.setOnFocusChangeListener(new OnFocusChangeListener() {

            @Override
            public void onFocusChange(View arg0, boolean arg1) {
                edtF.setText("");
                edtK.setText("");
            }
        });
        edtK.setOnFocusChangeListener(new OnFocusChangeListener() {

            @Override
            public void onFocusChange(View arg0, boolean arg1) {
                edtF.setText("");
                edtC.setText("");
            }
        });

        btnConvert.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                //double Celsius = 0;

                if (edtC.getText().toString().length() > 0)
                {
                    double value = Double.parseDouble(edtC.getText().toString());
                    edtK.setText("" + (value + 273.15));
                    edtF.setText("" + ((value * 1.8) + 32));
                    return;
                    //Celsius = Double.parseDouble(edtC.getText().toString());
                }
                else if (edtK.getText().toString().length() > 0)
                {
                    double value = Double.parseDouble(edtK.getText().toString());
                    edtC.setText("" + (value - 273.15));
                    edtF.setText("" + (1.8 * (value - 273.15) + 32));
                    return;
                    //Celsius = Double.parseDouble(edtK.getText().toString());

                }
                else if (edtF.getText().toString().length() > 0)
                {
                    double value = Double.parseDouble(edtF.getText().toString());
                    edtK.setText("" + (((value - 32) / 1.8) + 273.15));
                    edtC.setText("" + ((value - 32) / 1.8));
                    return;
                    //Celsius = Double.parseDouble(edtF.getText().toString());
                }

                //edtC.setText("" + Celsius);
                //edtK.setText("" + Celsius);
                //edtF.setText("" + Celsius);
            }
        });
    }
}
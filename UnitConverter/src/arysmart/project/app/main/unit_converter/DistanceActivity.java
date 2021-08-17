package arysmart.project.app.main.unit_converter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;


public class DistanceActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.distance);

        final EditText edtMm = (EditText) findViewById(R.id.edtMm);
        final EditText edtCm = (EditText) findViewById(R.id.edtCm);
        final EditText edtM = (EditText) findViewById(R.id.edtM);
        final EditText edtKm = (EditText) findViewById(R.id.edtKm);
        final Button btnConvert = (Button) findViewById(R.id.btnConvert);

        edtMm.setOnFocusChangeListener(new OnFocusChangeListener() {

            @Override
            public void onFocusChange(View arg0, boolean arg1) {
                edtCm.setText("");
                edtM.setText("");
                edtKm.setText("");
            }
        });

        edtCm.setOnFocusChangeListener(new OnFocusChangeListener() {

            @Override
            public void onFocusChange(View arg0, boolean arg1) {
                edtMm.setText("");
                edtM.setText("");
                edtKm.setText("");
            }
        });
        edtM.setOnFocusChangeListener(new OnFocusChangeListener() {

            @Override
            public void onFocusChange(View arg0, boolean arg1) {
                edtMm.setText("");
                edtCm.setText("");
                edtKm.setText("");
            }
        });
        edtKm.setOnFocusChangeListener(new OnFocusChangeListener() {

            @Override
            public void onFocusChange(View arg0, boolean arg1) {
                edtMm.setText("");
                edtCm.setText("");
                edtM.setText("");
            }
        });

        btnConvert.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                double mm = 0;

                if (edtMm.getText().toString().length() > 0)
                {
                    mm = Double.parseDouble(edtMm.getText().toString());
                }
                else if (edtCm.getText().toString().length() > 0)
                {
                    mm = Double.parseDouble(edtCm.getText().toString()) * 10.0;
                }
                else if (edtM.getText().toString().length() > 0)
                {
                    mm = Double.parseDouble(edtM.getText().toString()) * 1000.0;
                }
                else if (edtKm.getText().toString().length() > 0)
                {
                    mm = Double.parseDouble(edtKm.getText().toString()) * 1000000.0;
                }

                edtMm.setText("" + mm);
                edtCm.setText("" + (mm * 0.1));
                edtM.setText("" + (mm * 0.001));
                edtKm.setText("" + (mm * 0.000001));
            }
        });
    }
}
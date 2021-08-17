package arysmart.project.app.main.unit_converter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;


public class SpeedActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speed);

        final EditText edtMOnS = (EditText) findViewById(R.id.edtMOnS);
        final EditText edtKmOnH = (EditText) findViewById(R.id.edtKmOnH);
        final EditText edtMilPerH = (EditText) findViewById(R.id.edtMilPerH);
        final Button btnConvert = (Button) findViewById(R.id.btnConvert);

        edtMOnS.setOnFocusChangeListener(new OnFocusChangeListener() {

            @Override
            public void onFocusChange(View arg0, boolean arg1) {
                edtKmOnH.setText("");
                edtMilPerH.setText("");
            }
        });

        edtKmOnH.setOnFocusChangeListener(new OnFocusChangeListener() {

            @Override
            public void onFocusChange(View arg0, boolean arg1) {
                edtMOnS.setText("");
                edtMilPerH.setText("");
            }
        });
        edtMilPerH.setOnFocusChangeListener(new OnFocusChangeListener() {

            @Override
            public void onFocusChange(View arg0, boolean arg1) {
                edtMOnS.setText("");
                edtKmOnH.setText("");
            }
        });

        btnConvert.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                double mOs = 0;
                if (edtMOnS.getText().toString().length() > 0)
                {
                    mOs = Double.parseDouble(edtMOnS.getText().toString());
                }
                else if (edtKmOnH.getText().toString().length() > 0)
                {
                    mOs = Double.parseDouble(edtKmOnH.getText().toString()) / 3.6;

                }
                else if (edtMilPerH.getText().toString().length() > 0)
                {
                    mOs = Double.parseDouble(edtMilPerH.getText().toString()) / 2.237;
                }
                edtMOnS.setText("" + mOs);
                edtKmOnH.setText("" + mOs * 3.6);
                edtMilPerH.setText("" + mOs * 2.237);
            }
        });
    }
}
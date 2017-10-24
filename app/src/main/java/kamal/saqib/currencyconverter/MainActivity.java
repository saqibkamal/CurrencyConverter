package kamal.saqib.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void inrtonpr(View view){
        TextView text1=(TextView) findViewById(R.id.text1);
        Double indian=Double.parseDouble(text1.getText().toString());
        Double nepali=indian*1.60;
        TextView result1=(TextView) findViewById(R.id.result1);
        result1.setText(nepali.toString());
        Toast.makeText(getApplicationContext(), "Done!", Toast.LENGTH_SHORT).show();
    }

    public void nprtoinr(View view){
        TextView text2=(TextView) findViewById(R.id.text2);
        Double nepali=Double.parseDouble(text2.getText().toString());
        Double indian=nepali/1.60;
        TextView result2=(TextView) findViewById(R.id.result2);
        result2.setText(indian.toString());
        Toast.makeText(getApplicationContext(), "Done!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

package kumar.addingtwostrings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    EditText e3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.e1);
        e2=(EditText) findViewById(R.id.e2);
        e3=(EditText) findViewById(R.id.e3);
        b1=(Button) findViewById(R.id.button);
    }

    public void btn(View view) {
       switch (view.getId()){
           case R.id.button:
               String firstName=e1.getText().toString();
               String secondName=e2.getText().toString();
               e3.setText(firstName + "" + secondName);
               break;

           }
       }
    }

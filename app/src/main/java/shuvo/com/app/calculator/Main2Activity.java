package shuvo.com.app.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        screen = (TextView)findViewById(R.id.Bishmillah);
        Log.d("!!!!!!!!!!!!!!!!!","This Called");

    }
}

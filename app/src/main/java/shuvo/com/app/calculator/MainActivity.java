package shuvo.com.app.calculator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import bsh.Interpreter;

public class MainActivity extends Activity {

    private Button button_one,button_two,button_three,button_four,button_five,button_six,button_seven,button_eight,button_nine,button_zero,button_dot,button_equal,button_plus,button_minus,button_multiple,button_division,button_history,button_memory,button_memory_recall,button_ac,button_memory_plus,button_memory_minus,button_memory_clean;
    private TextView text_main_screen;
    private String value = "";
    DatabaseHandler dbHandler;
    Intent intent;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        onClick();

    }

    public void initialize()
    {
        text_main_screen = (TextView) findViewById(R.id.text_main_screen);


        button_one = (Button) findViewById(R.id.button_one);
        button_two = (Button) findViewById(R.id.button_two);
        button_three = (Button) findViewById(R.id.button_three);
        button_four = (Button) findViewById(R.id.button_four);
        button_five = (Button) findViewById(R.id.button_five);
        button_six = (Button) findViewById(R.id.button_six);
        button_seven = (Button) findViewById(R.id.button_seven);
        button_eight = (Button) findViewById(R.id.button_eight);
        button_nine = (Button) findViewById(R.id.button_nine);
        button_zero = (Button) findViewById(R.id.button_zero);
        button_dot = (Button) findViewById(R.id.button_dot);
        button_equal = (Button) findViewById(R.id.button_equal);
        button_plus = (Button) findViewById(R.id.button_plus);
        button_minus = (Button) findViewById(R.id.button_minus);
        button_multiple = (Button) findViewById(R.id.button_multiple);
        button_division = (Button) findViewById(R.id.button_division);
        button_ac = (Button) findViewById(R.id.button_clear);
        button_memory = (Button) findViewById(R.id.button_memory);
        button_memory_recall = (Button) findViewById(R.id.button_memory_recall);
        button_history = (Button) findViewById(R.id.button_history);
        button_memory_plus =(Button) findViewById(R.id.button_memory_plus);
        button_memory_minus = (Button) findViewById(R.id.button_memory_minus);
        button_memory_clean = (Button) findViewById(R.id.button_memory_clean);

    }


    public void addHistory(String _history){
        String str = _history;
        History history = new History(str);
        dbHandler = new DatabaseHandler(this, null, null, 1);
        dbHandler.addHistory(history);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate if the process is
        // killed and restarted.
        savedInstanceState.putString("value", value);
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        value = savedInstanceState.getString("value");
      //  valueString=memoryValue;
        text_main_screen.setText(value);

    }
    public void history(View view)
    {

        Button btn = (Button)view;
        intent = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(intent);


    }
    public void onClick()
    {
        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value+=button_one.getHint().toString();
                text_main_screen.setText(value);
            }
        });

        button_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value+=button_two.getHint().toString();
                text_main_screen.setText(value);
            }
        });

        button_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value+=button_three.getHint().toString();
                text_main_screen.setText(value);
            }
        });

        button_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value+=button_four.getHint().toString();
                text_main_screen.setText(value);
            }
        });

        button_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value+=button_five.getHint().toString();
                text_main_screen.setText(value);
            }
        });

        button_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value+=button_six.getHint().toString();
                text_main_screen.setText(value);
            }
        });

        button_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value+=button_seven.getHint().toString();
                text_main_screen.setText(value);
            }
        });

        button_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value+=button_eight.getHint().toString();
                text_main_screen.setText(value);
            }
        });

        button_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value+=button_nine.getHint().toString();
                text_main_screen.setText(value);
            }
        });

        button_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value+=button_zero.getHint().toString();
                text_main_screen.setText(value);
            }
        });

        button_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value+=button_dot.getHint().toString();
                text_main_screen.setText(value);
            }
        });

        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value+=button_plus.getHint().toString();
                text_main_screen.setText(value);
            }
        });

        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value+=button_minus.getHint().toString();
                text_main_screen.setText(value);
            }
        });

        button_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value+=button_division.getHint().toString();
                text_main_screen.setText(value);
            }
        });

        button_multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value+=button_multiple.getHint().toString();
                text_main_screen.setText(value);
            }
        });

        button_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value="";
                text_main_screen.setText(value);
            }
        });

        button_memory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getSharedPreferences("Memory", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =sharedPreferences.edit();
                editor.putString("data",value);
                editor.commit();

            }
        });

        button_memory_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getSharedPreferences("Memory",Context.MODE_PRIVATE);
                value+="+"+sharedPreferences.getString("data","");
                text_main_screen.setText(value);

            }
        });

        button_memory_recall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getSharedPreferences("Memory",Context.MODE_PRIVATE);
                value=sharedPreferences.getString("data","");
                text_main_screen.setText(value);
            }
        });

        /*button_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //History
                 intent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(intent);
            }
        });*/

        button_memory_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getSharedPreferences("Memory",Context.MODE_PRIVATE);
                value+="-"+sharedPreferences.getString("data","");
                text_main_screen.setText(value);
            }
        });

        button_memory_clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getSharedPreferences("Memory", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =sharedPreferences.edit();
                editor.putString("data","0");
                editor.commit();
            }
        });


        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //calculation
                addHistory(value);
                try{
                    //saveHistory

                    Interpreter interpreter = new Interpreter();
                    interpreter.eval("result ="+value+".0");
                     value=""+interpreter.get("result");
                    text_main_screen.setText(value);
                }
                catch(Exception e){

                }
                text_main_screen.setText(value);
            }
        });
    }





}


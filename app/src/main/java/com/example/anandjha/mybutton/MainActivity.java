package com.example.anandjha.mybutton;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    //Button bluebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.mybtn);
        //bluebutton=findViewById(R.id.bluebtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TEST","Cliked");
                }


        });
//        bluebutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("Click","BlueClick");
//
//            }
//
//
//    });
}
    public void bluePressed(View view){
//        Log.d("BLUE","clicked via method");
//        Context context=getApplicationContext();
//        CharSequence text="Hello from blue";
//        int duration=Toast.LENGTH_SHORT;
//        Toast toast=Toast.makeText(context,text,duration);
//        toast.show();
        Toast.makeText(getApplicationContext(),"short blue",Toast.LENGTH_SHORT).show();

    }

    }


package com.swufe.heka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText inp;
    TextView out;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inp =(EditText)findViewById(R.id.inpText);
        out =(TextView)findViewById(R.id.showText);


         btn =(Button)findViewById(R.id.btn1);
         btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Log.i("click","onClick.....");
        int c = Integer.parseInt(inp.getText().toString());
        out.setText("out"+(c*1.8+32));

        }

    }






package com.example.findage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText tnum1=(EditText)findViewById(R.id.tnum1);
        final EditText tnum2=(EditText)findViewById(R.id.tnum2);
        final EditText tres=(EditText)findViewById(R.id.tres);
        Button btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(tnum1.getText().toString());
                int n2=Integer.parseInt(tnum2.getText().toString());
                int r=n1+n2;
                tres.setText(String.valueOf(r));


            }
        });


    }

}

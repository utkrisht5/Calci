package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    TextView text;
    EditText n1,n2;
    Button button,button2,button3,button4,button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        text=findViewById(R.id.text);
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sum=Double.parseDouble(n1.getText().toString()) + Double.parseDouble(n2.getText().toString());
                text.setText("The result is " + sum);

            }
        });
        button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double difference=Double.parseDouble(n1.getText().toString()) - Double.parseDouble(n2.getText().toString());
                text.setText("The result is " + difference);

            }
        });
        button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double product=Double.parseDouble(n1.getText().toString()) * Double.parseDouble(n2.getText().toString());
                text.setText("The result is " + product);

            }
        });
        button4=findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double quotient=Double.parseDouble(n1.getText().toString()) / Double.parseDouble(n2.getText().toString());
                text.setText("The result is " + quotient);

            }
        });
        button5=findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(n1.getText().toString());
                int b=Integer.parseInt(n2.getText().toString());
                double power=a;
                for(int i=1; i<b; i++){
                    power*=a;
                }
                text.setText("The result is " + power);
            }
        });

    }

    public void openActivity(View v){
        Intent intent;
        intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }


}
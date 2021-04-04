package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView text1;
    EditText n3;
    Button button7,button8,button9,button10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text1=findViewById(R.id.text1);
        n3=findViewById(R.id.n3);
        button7=findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(n3.getText().toString());
                for(double i=0; i<a; i++){
                    if((i * i) == a){
                        text1.setText("The result is " + i);
                        break;
                    }
                }
            }
        });
        button8=findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a=Double.parseDouble(n3.getText().toString());
                for(double i=0; i<a; i++){
                    if(((i * i) * i) == a){
                        text1.setText("The result is " + i);
                        break;
                    }
                }
            }
        });
        button9=findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(n3.getText().toString());
                boolean check=true;
                for(int i=2; i<a; i++){
                    if(a%i == 0){
                        check=false;
                        break;
                    }
                }
                if(check){
                    text1.setText("The number is a prime number");
                }
                else{
                    text1.setText("The number is not a prime number");
                }
            }
        });
        button10=findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=Integer.parseInt(n3.getText().toString());
                int sum=0;
                int digit;
                int temp=num;
                while(temp!=0){
                    digit=temp%10;
                    sum+=(digit*digit*digit);
                    temp*=10;
                }
                if(sum == num){
                    text1.setText("The number is an armstrong number");
                }
                else{
                    text1.setText("The number is not an armstrong number");
                }
            }
        });
    }
}
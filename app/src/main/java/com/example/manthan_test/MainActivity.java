package com.example.manthan_test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText edit_input_number;
    Button button;
    TextView text_status;
    
    int n=0;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        edit_input_number = findViewById(R.id.edit_input_number);
        text_status = findViewById(R.id.text_status);

        int input = Integer.parseInt(edit_input_number.getText().toString());


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(n == 0){
                    Random random = new Random();
                    n = random.nextInt(100);

                    if(input == n){
                        text_status.setText("Win");
                        edit_input_number.setText("");
                        n = 0;
                    }else if(input > n){
                        text_status.setText("go lowwer");
                        edit_input_number.requestFocus();
                    }else if(input < n){
                        text_status.setText("go Higher");
                        edit_input_number.requestFocus();
                    }

                }else{
                        if(input == n){
                            text_status.setText("Win");
                            edit_input_number.setText("");
                            n = 0;
                        }else if(input > n){
                            text_status.setText("go lowwer and by change value again click on button to compare again");
                            edit_input_number.requestFocus();
                        }else if(input < n){
                            text_status.setText("go Higher and by change value again click on button to compare again");
                            edit_input_number.requestFocus();
                        }

                }



            }
        });



    }
}

package com.example.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {
    private EditText metName;
    private EditText mEtPass;
    private Button mBtnmSignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        mBtnmSignin=findViewById(R.id.btnSign);
        metName=findViewById(R.id.etName);
        mBtnmSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignIn.this,Home.class);
                String s=metName.getText().toString();
                intent.putExtra("name","s");
            }
        });
    }
}
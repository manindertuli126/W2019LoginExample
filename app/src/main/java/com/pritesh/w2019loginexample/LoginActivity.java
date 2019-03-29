package com.pritesh.w2019loginexample;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity
{

    private EditText edtUserEmail;
    private EditText edtPassword;
    private Button btnLogin;
    private TextView txtMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUserEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        txtMsg = findViewById(R.id.lblMessage);

        btnLogin = findViewById(R.id.btnSignIn);

        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String email = edtUserEmail.getText().toString();
                String pwd = edtPassword.getText().toString();

                if(email.equals("admin") && pwd.equals("admin@123"))
                {
                    txtMsg.setText("Login Success");
                    txtMsg.setTextColor(Color.GREEN);


                    //Navigate to NEXT Activity
                    Intent mIntent = new Intent(LoginActivity.this, HomeActivity.class);
                    //Set value to pass on next activity
                    mIntent.putExtra("name", "Pritesh Patel");
                    startActivity(mIntent);
                }
                else
                {
                    txtMsg.setText("Email/Password invalid");
                    txtMsg.setTextColor(Color.RED);
                }

                //Toast.makeText(LoginActivity.this, email, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
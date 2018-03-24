package com.example.sravanreddy.signinvalidation;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    private static final String TAG= MainActivity.class.getSimpleName();
    EditText username;
    EditText password;
    String userName, passWord;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Activity created");
        username=findViewById(R.id.usernameEdittext);
        password=findViewById(R.id.passwordEdittext);
        login=findViewById(R.id.loginbutton);
        userName="Sravan";
        passWord="Password";
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userName.equals(username.getText().toString()) && passWord.equals(password.getText().toString()))
                {
                    Intent intent=new Intent(MainActivity.this, Home.class);
                    startActivity(intent);
                }
                else {
                    AlertDialog.Builder alertdialog = new AlertDialog.Builder(MainActivity.this, R.style.MyDialog);

                    alertdialog.setTitle("Invalid username");
                    alertdialog.setMessage("Invalid user name or password");
                    alertdialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    alertdialog.show();

                }
            }
        });

    }



}

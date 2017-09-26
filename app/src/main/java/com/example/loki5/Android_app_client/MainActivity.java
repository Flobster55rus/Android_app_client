package com.example.loki5.Android_app_client;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText login;
    private EditText password;
    private Button btn_ok;
    String logData = "Flobster";
    String passData = "Qwezxc12";
    Intent intent;

    private final static String LOG_TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=(EditText) findViewById(R.id.editTextLog);
        password=(EditText) findViewById(R.id.editTextPass);
        btn_ok=(Button) findViewById(R.id.btn_login);
        intent = new Intent(this,TwoScrinActivity.class);
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);

        builder.setTitle("Ошибка авторизации")
                .setMessage("Неверный логин или пароль")
                .setNeutralButton("OK", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
            }
        } );
        final AlertDialog alert = builder.create();

        btn_ok.setOnClickListener(new View.OnClickListener(){ //обработка кнопки


            @Override
            public void onClick(View v) {

                Log.d(LOG_TAG, "Login ="+login.getText());
                Log.d(LOG_TAG, "Password ="+password.getText());

                if (login.getText().toString().equals(logData)&&password.getText().toString().equals(passData)){
                    startActivity(intent);}
                else {
                    alert.show();
                }
            }
        });
}

    @Override
    protected void onRestart() {
        super.onRestart();
    }
    protected void onStart(){
        super.onStart();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onStop() {
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
